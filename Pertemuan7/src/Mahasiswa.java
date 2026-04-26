/*Nama File     : Mahasiswa.java
  Deskripsi     : kelas Mahasiswa untuk mendemonstrasikan ad-hoc polymorphism (overloading)
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class Mahasiswa {
    /************ATRIBUT****************/
    private String NIM;
    private String Nama;
    private String Programstudi;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    //d. Konstruktor dengan tiga parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    //e. Konstruktor cloning (copy constructor)
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    //SELEKTOR
    //mengembalikan NIM Mahasiswa
    public String getNIM() {
        return NIM;
    }

    //mengembalikan Nama Mahasiswa
    public String getNama() {
        return Nama;
    }

    //mengembalikan Programstudi Mahasiswa
    public String getProgramstudi() {
        return Programstudi;
    }

    //MUTATOR
    //mengeset NIM dengan nilai baru NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    //mengeset Nama dengan nilai baru Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    //mengeset Programstudi
    //Varian pertama: tanpa parameter
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    //Varian kedua: satu parameter string
    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    //Varian ketiga: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.getProgramstudi();
    }

    //METHOD LAINNYA
    //menampilkan NIM, Nama, dan Programstudi yang dimiliki Mahasiswa
    public void cetak() {
        System.out.println("NIM             : " + NIM);
        System.out.println("Nama            : " + Nama);
        System.out.println("Program Studi   : " + Programstudi);
        System.out.println("-----------------------------");
    }
} // end class Mahasiswa