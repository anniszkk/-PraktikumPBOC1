/*Nama File     : Anggora.java
  Deskripsi     : berisi atribut dan method dalam class Anggora
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class Anggora extends Kucing{
    /************ATRIBUT****************/
    private String jenisRambut;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama dan bobot
    public Anggora(String Nama, double bobot) {
        super(Nama, bobot);
        this.jenisRambut = "Rambut Panjang";
    }

    //SELEKTOR
    //mengembalikan jenisRambut
    public String getJenisRambut() {
        return jenisRambut;
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Anggora
    @Override
    public void Gerak() {
        System.out.println("Gerak: Berlari dengan elegan");
    }

    //menampilkan jenis suara Anggora
    @Override
    public void Bersuara() {
        System.out.println("Suara: Meong lembut");
    }
} //end class Anggora