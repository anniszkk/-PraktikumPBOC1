/*Nama File     : Kembangtelon.java
  Deskripsi     : berisi atribut dan method dalam class Kembangtelon
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class Kembangtelon extends Kucing {
    /************ATRIBUT****************/
    private String jenisRambut;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama dan bobot
    public Kembangtelon(String Nama, double bobot) {
        super(Nama, bobot);
        this.jenisRambut = "Rambut Pendek";
    }

    //SELEKTOR
    //mengembalikan jenisRambut
    public String getJenisRambut() {
        return jenisRambut;
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Kembangtelon
    @Override
    public void Gerak() {
        System.out.println("Gerak: Meloncat dengan cepat");
    }

    //menampilkan jenis suara Kembangtelon
    @Override
    public void Bersuara() {
        System.out.println("Suara: Meong keras");
    }
} //end class Kembangtelon