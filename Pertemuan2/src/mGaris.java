/*Nama File     : Garis.java
  Deskripsi     : berisi atribut dan method dalam class Garis
  Pembuat       : Annis Fakhiroh Akbar
  Tanggal       : 27 Februari 2026 */

public class mGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,5); //Membuat objek titik T2 (3,5)
        Garis G1 = new Garis();
        Garis G2 = new Garis(T1,T2);
        G1.printGaris();
        G2.printGaris();
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());
        G1.setPoint1(T2);
        G1.printGaris();
        G2.setPoint2(T1);
        G2.printGaris();
        System.out.println("Panjang garis G1 adalah = " + G1.getPanjang());
        System.out.println("Gradien garis G1 adalah = " + G1.getGradien());
        T1 = G1.getTitikTengah();
        T1.printTitik();
        System.out.println("Apakah G1 sejajar dengan G2 = " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2 = " + G1.isTegakLurus(G2));
        System.out.println("Persamaan garis G1 adalah = " + G1.persGaris());
    }
}
