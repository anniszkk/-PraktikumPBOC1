/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author MyBook Hype
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection(); 
    }
    
    //Membuat objek mahasiswa
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    //Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String sql;
        boolean useProvidedId = mhs.getId() > 0; 

        if (useProvidedId) {
            sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        } else {
            sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        }

        try (PreparedStatement pstmt = koneksi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            if (useProvidedId) {
                pstmt.setInt(1, mhs.getId());
                pstmt.setString(2, mhs.getNama());
            } else {
                pstmt.setString(1, mhs.getNama()); 
            }

            int affectedRows = pstmt.executeUpdate(); 

            if (affectedRows > 0) {
                // Jika insert berhasil dan ID tidak disediakan sebelumnya (auto-increment case)
                // maka kita update objek mhs dengan ID yang di-generate database.
                // Jika ID sudah disediakan (useProvidedId == true), kita asumsikan ID tersebut berhasil digunakan
                // dan tidak menimpanya dengan generatedKeys, agar ID 5 untuk Haryo tetap.
                if (!useProvidedId) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            mhs.setId(generatedKeys.getInt(1)); 
                        }
                    }
                }
                System.out.println("Berhasil insert");
            } else {
                System.err.println("Insert query dieksekusi, tetapi tidak ada baris yang terpengaruh.");
            }
        } catch (SQLException e) {
            System.err.println("Gagal menambahkan mahasiswa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement pstmt = koneksi.prepareStatement(sql)) {
            pstmt.setString(1, mhs.getNama());
            pstmt.setInt(2, mhs.getId());
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Berhasil update"); 
            } else {
                System.out.println("Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan untuk diupdate.");
            }
        } catch (SQLException e) {
            System.err.println("Gagal update mahasiswa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //Delete data mahasiswa sesuai id
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement pstmt = koneksi.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                 System.out.println("Berhasil delete");
            } else {
                 System.out.println("Data mahasiswa dengan ID " + id + " tidak ditemukan untuk didelete.");
            }
        } catch (SQLException e) {
            System.err.println("Gagal menghapus mahasiswa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        String sql = "SELECT id, nama FROM mahasiswa WHERE id = ?";
        try (PreparedStatement pstmt = koneksi.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int mhsId = rs.getInt("id");
                    String nama = rs.getString("nama");
                    return new Mahasiswa(mhsId, nama);
                }
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengambil mahasiswa by ID: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    //Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String sql = "SELECT id, nama FROM mahasiswa";
        
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
             
            while (rs.next()) {
                int mhsId = rs.getInt("id");
                String nama = rs.getString("nama");
                daftarMahasiswa.add(new Mahasiswa(mhsId, nama));
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengambil semua mahasiswa: " + e.getMessage());
            e.printStackTrace();
        }
        return daftarMahasiswa;
    }
}