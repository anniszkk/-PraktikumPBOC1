/*Nama File     : MainAnabul.java
  Deskripsi     : MainAnabul merupakan mainclass untuk menjalankan kelas Anabul, Anjing, dan Kucing
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul anabul1 = new Anjing("Hound Dog");
        Anabul anabul2 = new Kucing("British Short Hair");
        Anabul anabul3 = new Burung("Hawks");

        System.out.println("--------------------------");
        System.out.println("Anabul 1: ");
        System.out.println(anabul1.getNama());
        anabul1.Gerak();
        anabul1.Bersuara();

        System.out.println("--------------------------");
        System.out.println("Anabul 2: ");
        System.out.println(anabul2.getNama());
        anabul2.Gerak();
        anabul2.Bersuara();

        System.out.println("--------------------------");
        System.out.println("Anabul 3: ");
        System.out.println(anabul3.getNama());
        anabul3.Gerak();
        anabul3.Bersuara();
    }
}