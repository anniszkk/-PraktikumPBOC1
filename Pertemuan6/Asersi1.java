/*Nama File     : Asersi1.java
  Deskripsi     : Program untuk menunjukkan asersi 
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 16 April 2026 */

public class Asersi1{
    public static void main(String[] args) {
        System.out.println("------------TEST UNTUK ASERSI------------");
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}