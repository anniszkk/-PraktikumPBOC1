/*Nama File     : BangunDatar.java
  Deskripsi     : berisi atribut dan method dalam class BangunDatar
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 13 Maret 2026 */

public class BangunDatar {
    /************ATRIBUT****************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;
    // private int jmlSisi;
    // private String warna;
    // private String border;
    // private static int counterBangunDatar = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat bangun datar tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    //konstruktor untuk membuat bangun datar dengan nilai jmlSisi, warna, dan border tertentu
    public BangunDatar (int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //SELEKTOR
    //mengembalikan jumlah sisi bangun datar
    public int getJmlSisi() {
        return jmlSisi;
    }

    //mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    //mengembalikan warna border bangun datar
    public String getBorder() {
        return border;
    }

    //mengembalikan jumlah objek bangun datar (dalam bentuk prosedur)
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }

    //MUTATOR
    //mengeset jmlSisi dengan nilai baru jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    //mengeset warna dengan nilai baru string warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //mengeset border dengan nilai baru string border
    public void setBorder(String border) {
        this.border = border;
    }

    //METHOD LAINNYA
    //menampilkan jumlah sisi, warna, dan border yang dimiliki bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: "+ border);
    }
} //end class BangunDatar