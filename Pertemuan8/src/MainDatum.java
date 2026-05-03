/*Nama File     : MainDatum.java
  Deskripsi     : MainDatum merupakan mainclass untuk menjalankan kelas Datum
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class MainDatum {
    public static void main(String[] args) {
        // Membuat objek Datum dengan tipe data Integer
        System.out.println("--- Aplikasi Datum dengan Tipe Data Integer ---");
        Datum<Integer> datumInteger = new Datum<>(42);
        System.out.println("Isi Datum Integer: " + datumInteger.getIsi());
        datumInteger.setIsi(100);
        System.out.println("Isi Datum Integer setelah diubah: " + datumInteger.getIsi());
        System.out.println();

        // Membuat objek Datum dengan tipe data String
        System.out.println("--- Aplikasi Datum dengan Tipe Data String ---");
        Datum<String> datumString = new Datum<>("Toothless and Hiccup");
        System.out.println("Isi Datum String: " + datumString.getIsi());
        datumString.setIsi("Gobber");
        System.out.println("Isi Datum String setelah diubah: " + datumString.getIsi());
        System.out.println();

        // Membuat objek Datum dengan tipe data Double
        System.out.println("--- Aplikasi Datum dengan Tipe Data Double ---");
        Datum<Double> datumDouble = new Datum<>(3.14);
        System.out.println("Isi Datum Double: " + datumDouble.getIsi());
        datumDouble.setIsi(2.718);
        System.out.println("Isi Datum Double setelah diubah: " + datumDouble.getIsi());
        System.out.println();

        //Membuat objek Datum dengan tipe data Anabul
        System.out.println("--- Aplikasi Datum dengan Tipe Data Anabul ---");
        Anabul anabul1 = new Kucing("Whiskers", 4.5);
        Datum<Anabul> datumAnabul = new Datum<>(anabul1);
        System.out.println("Isi Datum Anabul (Kucing): " + datumAnabul.getIsi().getNama() + ", Bobot: " + ((Kucing) datumAnabul.getIsi()).getBobot() + " kg");
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        System.out.println();

        Anabul anabul2 = new Anjing("Rex");
        datumAnabul.setIsi(anabul2);
        System.out.println("Isi Datum Anabul (Anjing): " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        System.out.println();

        Anabul anabul3 = new Burung("Tweety");
        datumAnabul.setIsi(anabul3);
        System.out.println("Isi Datum Anabul (Burung): " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        System.out.println();
        
        Anabul anabul4 = new Anggora("MewMew", 5.0);
        datumAnabul.setIsi(anabul4);
        System.out.println("Isi Datum Anabul (Anggora): " + datumAnabul.getIsi().getNama() + ", Bobot: " + ((Anggora) datumAnabul.getIsi()).getBobot() + " kg");
        System.out.println("Jenis Rambut: " + ((Anggora) datumAnabul.getIsi()).getJenisRambut());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        System.out.println();

        Anabul anabul5 = new Kembangtelon("Kembang", 3.0);
        datumAnabul.setIsi(anabul5);
        System.out.println("Isi Datum Anabul (Kembangtelon): " + datumAnabul.getIsi().getNama() + ", Bobot: " + ((Kembangtelon) datumAnabul.getIsi()).getBobot() + " kg");
        System.out.println("Jenis Rambut: " + ((Kembangtelon) datumAnabul.getIsi()).getJenisRambut());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        System.out.println();
    }
} //end class MainDatum