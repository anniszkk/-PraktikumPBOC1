/*Nama File     : Mahasiswa.java
  Deskripsi     : berisi atribut dan method dalam class Mahasiswa
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

import java.util.ArrayList;

public class Mahasiswa {
    /************ATRIBUT****************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int counterMahasiswa = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>(); //inisialisasi ArrayList kosong
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMahasiswa++;
    }

    //konstruktor untuk membuat mahasiswa dengan nilai NIM, nama, dan prodi tertentu
    public Mahasiswa(String nim,String nama,String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); //inisialisasi ArrayList kosong
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMahasiswa++;
    }

    //SELEKTOR
    //mengembalikan NIM mahasiswa
    public String getNim() {
        return this.nim;
    }

    //mengembalikan nama mahasiswa
    public String getNama() {
        return this.nama;
    }

    //mengembalikan prodi mahasiswa
    public String getProdi() {
        return this.prodi;
    }

    //mengembalikan list mata kuliah mahasiswa
    public ArrayList<MataKuliah> getListMatKul() {
        return this.listMatKul;
    }

    //mengembalikan data dosen mahasiswa
    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    //mengembalikan data kendaraan mahasiswa
    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    //mengembalikan nilai counterMhs
    public static int getCounterMhs() {
        return counterMahasiswa;
    }

    //MUTATOR
    //mengeset NIM dengan nilai baru string nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    //mengeset Nama dengan nilai baru string nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset Prodi dengan nilai baru string prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    //mengeset list matkul dengan nilai baru listMatKul
    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    //mengeset dosen wali dengan nilai baru dosenWali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    //mengeset kendaraan dengan nilai baru kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //METHOD LAINNYA
    //mendambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatKul(MataKuliah newMatKul) {
        this.listMatKul.add(newMatKul);
    }

    //mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS() {
        int jumlahSKS = 0;
        for (int i = 0; i < this.listMatKul.size(); i++) {
            jumlahSKS += this.listMatKul.get(i).getSks();
        }
        return jumlahSKS;
    }

    //mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul() {
        return this.listMatKul.size();
    }

    //menampilkan NIM, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("Mahasiswa ini punya NIM: " + this.nim + ", bernama: " + this.nama + ", dan berasal dari prodi: " + this.prodi);
    }

    //menampilkan NIM, nama, prodi, daftar mata kuliah yang diambil, data dosen wali,
    // serta data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
        System.out.println("Daftar mata kuliah yang diambil: ");
        for (int i = 0; i < this.listMatKul.size(); i++) {
            System.out.println("ID MatKul: " + this.listMatKul.get(i).getIdMatKul() + " | Nama MatKul: " + this.listMatKul.get(i).getNama() + " | Jumlah SKS: " + this.listMatKul.get(i).getSks());
        }
        System.out.println("Data dosen wali: ");
        System.out.println("NIP: " + this.dosenWali.getNip() + " | Nama: " + this.dosenWali.getNama() + " | Prodi: " + this.dosenWali.getProdi());
        System.out.println("Data kendaraan: ");
        System.out.println("Nomor Plat: " + this.kendaraan.getNoPlat() + " | Jenis: " + this.kendaraan.getJenis());
    }
} //end class Mahasiswa