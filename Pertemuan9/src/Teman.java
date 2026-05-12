/*Nama File     : Teman.java
  Deskripsi     : Teman merupakan kelas yang merepresentasikan daftar teman dengan berbagai operasi seperti menambah, menghapus, dan memeriksa keanggotaan teman.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

import java.util.List;
import java.util.ArrayList;

public class Teman {
    /************ATRIBUT****************/
    private int nbelm;
    private List<String> Lnama;

    //KONSTRUKTOR
    //Konstruktor tanpa parameter
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    //Method aksesor - getNbelm(), yaitu mengembalikan jumlah teman yang ada dalam daftar
    public int getNbelm() {
        return this.nbelm;
    }

    //Method aksesor - getNama(indeks), yaitu mengembalikan nama teman pada indeks tertentu
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < this.nbelm) {
            return this.Lnama.get(indeks);
        } else {
            throw new IndexOutOfBoundsException("Indeks " + indeks + " di luar batas (0 - " + (this.nbelm - 1) + ")");
        }
    }

    //Method mutator - setNama(indeks, nama), yaitu mengubah nama teman pada indeks
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < this.nbelm) {
            this.Lnama.set(indeks, nama);
        } else {
            throw new IndexOutOfBoundsException("Indeks " + indeks + " di luar batas (0 - " + (this.nbelm - 1) + ")");
        }
    }

    //Method - addNama(nama), yaitu menambahkan nama teman ke dalam daftar
    public void addNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.Lnama.add(nama);
            this.nbelm++;
        } else {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
    }

    //Method - delNama(nama), yaitu menghapus nama teman dari daftar
    public boolean delNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            if (this.Lnama.remove(nama)) {
                this.nbelm--;
                return true;
            }
            return false;
        } 
        throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
    }

    //Method - isMember(nama), yaitu memeriksa apakah nama teman ada dalam daftar
    public boolean isMember(String nama) {
        if (nama != null && !nama.isEmpty()) {
            return this.Lnama.contains(nama);
        } 
        throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
    }

    //Method - gantiNama(nama,namabaru), yaitu mengganti nama teman dengan namabaru
    public boolean gantiNama(String nama, String namabaru) {
        if (nama != null && !nama.isEmpty() && namabaru != null && !namabaru.isEmpty()) {
            int indeks = this.Lnama.indexOf(nama);
            if (indeks != -1) {
                this.Lnama.set(indeks, namabaru);
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
    }

    //Method - countNama(nama), yaitu menghitung berapa kali nama muncul dalam daftar
    public int countNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            int count = 0;
            for (String n : this.Lnama) {
                if (n.equals(nama)) {
                    count++;
                }
            }
            return count;
        } else {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
    }

    //Method - showTeman(), yaitu menampilkan daftar teman
    public void showTeman() {
        if (this.nbelm > 0) {
            System.out.println("Daftar Teman:");
            for (int i = 0; i < this.nbelm; i++) {
                System.out.println((i + 1) + ". " + this.Lnama.get(i));
            }
        } else {
            System.out.println("Belum ada teman yang ditambahkan.");
        }
    }
} //end class Teman