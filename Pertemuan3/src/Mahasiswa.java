import java.util.ArrayList;

public class Mahasiswa {
    /************ATRIBUT****************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int counterMahasiswa = 0;

    /**********METHOD*******************/
    //Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
        this.listMatkul = new ArrayList<>(); //inisialisasi ArrayList kosong
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        counterMahasiswa++;
    }
    

}
