/*Nama File     : Tanggal.java
  Deskripsi     : berisi atribut dan method dalam class Tanggal
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

import java.util.ArrayList;

public class Tanggal {
    /************ATRIBUT****************/
    private int hari;
    private int bulan;
    private int tahun;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat tanggal tanpa parameter
    public Tanggal() {

    }

    //konstruktor untuk membuat tanggal dengan nilai hari, bulan, dan tahun tertentu
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    //SELEKTOR
    //mengembalikan hari dari tanggal dalam format angka
    public int getHari() {
        return hari;
    }

    //mengembalikan bulan dari tanggal dalam format angka
    public int getBulan() {
        return bulan;
    }

    //mengembalikan tahun dari tanggal dalam format angka
    public int getTahun() {
        return tahun;
    }

    //MUTATOR
    //mengeset hari dengan nilai baru hari dalam format angka
    public void setHari(int hari) {
        this.hari = hari;
    }

    //mengeset bulan dengan nilai baru bulan dalam format angka
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }


    //mengeset tahun dengan nilai baru tahun dalam format angka
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    //METHOD LAINNYA
    //mengembalikan bulan dalam penulisan dieja (huruf)
    public String getNamaBulan() {
        ArrayList<String> namaBulan = new ArrayList<>();
        namaBulan.add("");        
        namaBulan.add("Januari");  
        namaBulan.add("Februari"); 
        namaBulan.add("Maret");
        namaBulan.add("April");
        namaBulan.add("Mei");
        namaBulan.add("Juni");
        namaBulan.add("Juli");
        namaBulan.add("Agustus");
        namaBulan.add("September");
        namaBulan.add("Oktober");
        namaBulan.add("November");
        namaBulan.add("Desember");
        if (bulan >= 1 && bulan <= 12) {
            return namaBulan.get(bulan); 
        }
        return "-not month-";
    }

    //mengembalikan list yang berisi [tahun,bulan] yang merupakan selisih antara dua tanggal, tanggal yg lebih besar ditaruh sebagai inputan
    public ArrayList<Integer> hitungSelisih(Tanggal kedua) {
        int selisihHari = kedua.hari - this.hari;
        int selisihBulan = kedua.bulan - this.bulan;
        int selisihTahun = kedua.tahun - this.tahun;
        if (selisihHari < 0) {
            selisihBulan--;
        }
        if (selisihBulan < 0) {
            selisihTahun--;
            selisihBulan += 12;
        }
        ArrayList<Integer> hasil = new ArrayList<>();
        hasil.add(selisihTahun); 
        hasil.add(selisihBulan); 
        return hasil;
    }

    //menampilkan tanggal dalam format contoh dd <Januari> yyyy
    public String printTanggal() {
        return hari + " " + getNamaBulan() + " " + tahun;
    }
} //end class Tanggal