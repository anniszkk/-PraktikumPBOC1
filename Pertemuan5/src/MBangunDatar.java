/*Nama File     : MBangunDatar.java
  Deskripsi     : berisi atribut dan method dalam class BangunDatar
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 Maret 2026 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS PERSEGI------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Persegi P1 = new Persegi();
        BangunDatar P2 = new Persegi(5, "pink", "hitam");
        P1.printInfo();
        P2.printInfo();
        System.out.println();
        System.out.println("2. Cek mutator untuk persegi P1 yang belum punya data");
        P1.setWarna("kuning");
        P1.setBorder("biru");
        P1.setSisi(2);
        P1.printInfo();
        System.out.println();
        System.out.println("3. Cek selektor untuk persegi P2");
        System.out.println("Persegi P2 punya jumlah sisi: " + P2.getJmlSisi());
        System.out.println("Persegi P2 punya warna: " + P2.getWarna());
        System.out.println("Persegi P2 punya border: " + P2.getBorder());
        System.out.println("Persegi P2 punya panjang sisi: " + ((Persegi)P2).getSisi());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu:");
        System.out.println("Luas persegi: " + ((Persegi)P2).getLuas());
        System.out.println("Keliling persegi: " + ((Persegi)P2).getKeliling());
        System.out.println("Panjang diagonal persegi: " + ((Persegi)P2).getDiagonal());
        P1.zoomIn();
        System.out.println("Sekarang P2 punya panjang sisi sebesar: " + P1.getSisi());
        P1.zoomOut();
        System.out.println("Sekarang P2 punya panjang sisi sebesar: " + P1.getSisi());
        P1.zoom(50);
        System.out.println("Sekarang P2 punya panjang sisi sebesar: " + P1.getSisi());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS LINGKARAN------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Lingkaran L1 = new Lingkaran();
        BangunDatar L2 = new Lingkaran(7, "pink", "hitam");
        L1.printInfo();
        L2.printInfo();
        System.out.println();
        System.out.println("2. Cek mutator untuk lingkaran L1 yang belum punya data");
        L1.setWarna("kuning");
        L1.setBorder("biru");
        L1.setJari(7);
        L1.printInfo();
        System.out.println();
        System.out.println("3. Cek selektor untuk lingkaran L2");
        System.out.println("Lingkaran L2 punya jumlah sisi: " + L2.getJmlSisi());
        System.out.println("Lingkaran L2 punya warna: " + L2.getWarna());
        System.out.println("Lingkaran L2 punya border: " + L2.getBorder());
        System.out.println("Lingkaran L2 punya jari-jari: " + ((Lingkaran)L2).getJari());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu:");
        System.out.println("Luas lingkaran: " + ((Lingkaran)L2).getLuas());
        System.out.println("Keliling lingkaran : " + ((Lingkaran)L2).getKeliling());
        L1.zoomIn();
        System.out.println("Sekarang L2 punya jari-jari sebesar: " + L1.getJari());
        L1.zoomOut(); 
        System.out.println("Sekarang L2 punya jari-jari sebesar: " + L1.getJari());
        L1.zoom(50);
        System.out.println("Sekarang L2 punya jari-jari sebesar: " + L1.getJari());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS BANGUNDATAR------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        // BangunDatar BD1 = new BangunDatar();
        // BangunDatar BD2 = new BangunDatar(5, "hitam", "hijau");
        P2.printInfo();
        L2.printInfo();
        System.out.println();
        System.out.println("2. Cek mutator untuk bangun datar L2");
        L2.setJmlSisi(1);
        L2.setWarna("pink");
        L2.setBorder("hitam");
        L2.printInfo();
        System.out.println();
        System.out.println("3. Cek selektor untuk bangun datar BD2");
        System.out.println("Bangun datar BD2 punya jumlah sisi: " + L2.getJmlSisi());
        System.out.println("Bangun datar BD2 punya warna: " + L2.getWarna());
        System.out.println("Bangun datar BD2 punya border: " + L2.getBorder());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu: ");
        BangunDatar.printCounterBangunDatar();
        System.out.println("Apakah P1 dan L1 punya luas yg sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah P1 dan L1 punya luas yg sama? " + P1.isEqualKeliling(L1));
    }
}