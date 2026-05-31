/*Nama File     : DiskonLambda.java
  Deskripsi     : Program main yang digunakan untuk menghitung diskon menggunakan ekspresi lambda.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 31 Mei 2026 */

//Interface untuk menghitung diskon
interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        IDiskon diskonBertingkat = (harga) -> {
            if (harga >= 100000) {
                return harga - (harga * 0.3); //Diskon 30% untuk harga >= 100rb
            } else if (harga >= 50000) {
                return harga - (harga * 0.15); //Diskon 15% untuk harga >= 50rb
            } else {
                return harga; //tidak ada diskon
            }
        };

        //menampilkan hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));
    }
}