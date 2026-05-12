/*Nama File     : Anabul.java
  Deskripsi     : Anabul merupakan superclass untuk kelas Kucing, Anjing, dan Burung
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class Anabul {
    /************ATRIBUT****************/
    private String Nama;
    private String panggilan;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    //SELEKTOR
    //mengembalikan Nama Anabul
    public String getNama() {
        return "Nama: " + Nama;
    }

    public String getPanggilan() {
        return "Panggilan: " + panggilan;
    }

    //MUTATOR
    //mengubah Nama panggilan Anabul
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Anabul
    public void Gerak() {

    }

    //menampilkan jenis suara Anabul
    public void Bersuara() {

    }
} // end class Anabul