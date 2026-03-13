/*Nama File     : Lingkaran.java
  Deskripsi     : berisi atribut dan method dalam class Lingkaran
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 13 Maret 2026 */

public class Lingkaran extends BangunDatar{
    /************ATRIBUT****************/
    private double jari;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat lingkaran tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    //konstruktor untuk membuat lingkaran dengan nilai jari, warna, dan border tertentu
    public Lingkaran(double jari, String warna, String border) {
        super(1,warna,border);
        this.jari = jari;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    //SELEKTOR
    //mengembalikan panjang jari-jari lingkaran
    public double getJari() {
        return jari;
    }
    
    //MUTATOR
    //mengeset jari dengan nilai baru panjang jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    //METHOD LAINNYA
    //mengembalikan luas lingkaran
    public double getLuas() {
        return Math.PI*jari*jari;
    }

    //mengembalikan keliling lingkaran
    public double getKeliling() {
        return 2*Math.PI*jari;
    }

    //menampilkan jumlah sisi, warna, border, dan panjang jari-jari yang dimiliki lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        // System.out.println("Jumlah sisi: " + getJmlSisi());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
    }
} //end class Lingkaran