/*Nama File     : OperatorGenerik.java
  Deskripsi     : OperatorGenerik adalah kelas yang dapat digunakan untuk melakukan operasi generik pada berbagai tipe data.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class OperatorGenerik {
    //METHOD GENERIK
    //Metode generik untuk menukar isi dari dua objek Datum dengan tipe data yang sama
    public <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    //Metode generik untuk menghitung bobot total dari dua objek Datum yang berisi Kucing
    public <T extends Kucing> double Bobot2(Datum<T> k1, Datum<T> k2) {
        return k1.getIsi().getBobot() + k2.getIsi().getBobot();
    }
} //end class OperatorGenerik