/*Nama File     : Asersi2.java
  Deskripsi     : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 16 April 2026 */

class Lingkaran {
    /************ATRIBUT****************/
    private double jariJari;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //konstruktor untuk membuat lingkaran dengan jari-jari tertentu
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    //METHOD LAINNYA
    //mengembalikan keliling lingkaran
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
} //end class Lingkaran

public class Asersi2 {
    public static void main(String[] args) {
        System.out.println("------------TEST UNTUK ASERSI------------");
        double jariJari = 0;
        assert (jariJari > 0) : "Jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari); //pembuatan objek lingkaran dengan jari-jari nol
        double kelilingLingkaran = l.hitungKeliling(); //method untuk menghitung keliling lingkaran
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}

//Secara konsep, terdapat kesalahan dalam kode di atas. 
//Saat kode dijalankan, jika jariJari di assign dengan nilai 0 maka program akan tetap berjalan tanpa menghasilkan error, namun hasil perhitungan keliling lingkaran akan menjadi 0.
//Hal ini tidak sesuai dengan asersi yang telah didefinisikan pada kode tersebut, dimana jariJari tidak boleh bernilai nol.
//Karena saat eksekusi kode, harus mengaktifkan asersi, maka perlu menambahkan -ea pada saat eksekusi program.
//Sehingga, jika jariJari di assign dengan nilai 0, maka program akan berhenti dan menghasilkan error dengan pesan "Jari-jari tidak boleh nol".
//Solusi dari kesalahan konsep tersebut adalah penggunaan if else statement untuk mengecek nilai jariJari sebelum membuat objek lingkaran. 
//Hal ini akan lebih memudahkan user, karena tidak perlu mengaktifkan asersi pada saat eksekusi program.
//Contoh perbaikan kodenya adalah sebagai berikut:
//public class Asersi2 {
//     public static void main(String[] args) {
//         double jariJari = 0;
//         if (jariJari > 0) {
//             Lingkaran l = new Lingkaran(jariJari); //pembuatan objek lingkaran dengan jari-jari nol
//             double kelilingLingkaran = l.hitungKeliling(); //method untuk menghitung keliling lingkaran
//             System.out.println("Keliling lingkaran: " + kelilingLingkaran);
//         } else {
//             System.out.println("Jari-jari tidak boleh nol");
//         }
//     }
// }