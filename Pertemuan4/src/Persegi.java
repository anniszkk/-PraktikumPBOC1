/*Nama File     : Persegi.java
  Deskripsi     : berisi atribut dan method dalam class Persegi
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 13 Maret 2026 */

public class Persegi extends BangunDatar {
    /************ATRIBUT****************/
    private double sisi;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat persegi tanpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    //konstruktor untuk membuat persegi dengan nilai sisi, warna, dan border tertentu
    public Persegi (double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
        // this.warna = warna;
        // this.border = border;
        // this.jmlSisi = 4;
    }

    //SELEKTOR
    //mengembalikan panjang sisi persegi
    public double getSisi() {
        return sisi;
    }

    //MUTATOR
    //mengeset sisi dengan nilai baru panjang sisi
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    //METHOD LAINNYA
    //mengembalikan luas persegi
    public double getLuas() {
        return sisi*sisi;
    }

    //mengembalikan keliling persegi
    public double getKeliling() {
        return 4*sisi;
    }

    //mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return sisi*Math.sqrt(2);
    }

    //menampilkan jumlah sisi, warna, border, dan panjang sisi yang dimiliki persegi
    @Override
    public void printInfo() {
        super.printInfo();
        // System.out.println("Jumlah sisi: " + getJmlSisi());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar() {
    //     return;
    // }
} //end class Persegi