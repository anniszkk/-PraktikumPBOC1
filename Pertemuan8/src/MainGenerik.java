/*Nama File     : MainGenerik.java
  Deskripsi     : MainGenerik merupakan mainclass untuk menjalankan kelas OperatorGenerik
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class MainGenerik {
    public static void main(String[] args) {
        System.out.println("--- APLIKASI PROSEDUR TUKAR GENERIK ---");
        OperatorGenerik operator = new OperatorGenerik();
        System.out.println(" --- Aplikasi dengan Tipe Data Integer ---");
        Datum<Integer> datumInteger1 = new Datum<>(10);
        Datum<Integer> datumInteger2 = new Datum<>(20);
        System.out.println("Isi Datum Integer 1 sebelum ditukar: " + datumInteger1.getIsi());
        System.out.println("Isi Datum Integer 2 sebelum ditukar: " + datumInteger2.getIsi());
        operator.Tukar(datumInteger1, datumInteger2);
        System.out.println("Isi Datum Integer 1 setelah ditukar: " + datumInteger1.getIsi());
        System.out.println("Isi Datum Integer 2 setelah ditukar: " + datumInteger2.getIsi());
        System.out.println();

        System.out.println(" --- Aplikasi dengan Tipe Data String ---");
        Datum<String> datumString1 = new Datum<>("Toothless");
        Datum<String> datumString2 = new Datum<>("Hiccup");
        System.out.println("Isi Datum String 1 sebelum ditukar: " + datumString1.getIsi());
        System.out.println("Isi Datum String 2 sebelum ditukar: " + datumString2.getIsi());
        operator.Tukar(datumString1, datumString2);
        System.out.println("Isi Datum String 1 setelah ditukar: " + datumString1.getIsi());
        System.out.println("Isi Datum String 2 setelah ditukar: " + datumString2.getIsi());
        System.out.println();

        System.out.println(" --- Aplikasi dengan Tipe Data Anabul ---");
        Anabul anabul1 = new Kucing("Whiskers", 4.5);
        Anabul anabul2 = new Anjing("Rex");
        Datum<Anabul> datumAnabul1 = new Datum<>(anabul1);
        Datum<Anabul> datumAnabul2 = new Datum<>(anabul2);
        System.out.println("Isi Datum Anabul 1 sebelum ditukar: " + datumAnabul1.getIsi().getNama());
        System.out.println("Isi Datum Anabul 2 sebelum ditukar: " + datumAnabul2.getIsi().getNama());
        operator.Tukar(datumAnabul1, datumAnabul2); 
        System.out.println("Isi Datum Anabul 1 setelah ditukar: " + datumAnabul1.getIsi().getNama());
        System.out.println("Isi Datum Anabul 2 setelah ditukar: " + datumAnabul2.getIsi().getNama());
        System.out.println();

        System.out.println(" --- Aplikasi dengan Tipe Data Anabul (Kucing) ---");
        Anabul kucing1 = new Anggora("MewMew", 5.0);
        Anabul kucing2 = new Kembangtelon("Fluffy", 3.0);
        Datum<Anabul> datumKucing1 = new Datum<>(kucing1);
        Datum<Anabul> datumKucing2 = new Datum<>(kucing2);
        System.out.println("Isi Datum Kucing 1 sebelum ditukar: " + datumKucing1.getIsi().getNama() + ", Bobot: " + ((Anggora) datumKucing1.getIsi()).getBobot() + " kg");      
        System.out.println("Isi Datum Kucing 2 sebelum ditukar: " + datumKucing2.getIsi().getNama() + ", Bobot: " + ((Kembangtelon) datumKucing2.getIsi()).getBobot() + " kg");
        operator.Tukar(datumKucing1, datumKucing2);
        System.out.println("Isi Datum Kucing 1 setelah ditukar: " + datumKucing1.getIsi().getNama() + ", Bobot: " + ((Kembangtelon) datumKucing1.getIsi()).getBobot() + " kg");
        System.out.println("Isi Datum Kucing 2 setelah ditukar: " + datumKucing2.getIsi().getNama() + ", Bobot: " + ((Anggora) datumKucing2.getIsi()).getBobot() + " kg");
        System.out.println();

        System.out.println(" --- APLIKASI FUNGSI BOBOT2 ---");
        Kucing kucing3 = new Anggora("Snowball", 4.0);
        Kucing kucing4 = new Kembangtelon("Nugget", 3.0);
        Datum<Kucing> datumKucing3 = new Datum<>(kucing3);
        Datum<Kucing> datumKucing4 = new Datum<>(kucing4);
        System.out.println("Bobot Kucing 1: " + datumKucing3.getIsi().getBobot() + " kg");
        System.out.println("Bobot Kucing 2: " + datumKucing4.getIsi().getBobot() + " kg");
        double bobotTotal = operator.Bobot2(datumKucing3, datumKucing4);
        System.out.println("Bobot Total: " + bobotTotal + " kg");
        System.out.println();

        Kucing kucing5 = new Kucing("Wayen", 4.5);
        Kucing kucing6 = new Kucing("Mittens", 5.5);
        Datum<Kucing> datumKucing5 = new Datum<>(kucing5);
        Datum<Kucing> datumKucing6 = new Datum<>(kucing6);
        System.out.println("Bobot Kucing 1: " + datumKucing5.getIsi().getBobot() + " kg");
        System.out.println("Bobot Kucing 2: " + datumKucing6.getIsi().getBobot() + " kg");
        double bobotTotal2 = operator.Bobot2(datumKucing5, datumKucing6);
        System.out.println("Bobot Total 2: " + bobotTotal2 + " kg");
    }
} //end class MainGenerik