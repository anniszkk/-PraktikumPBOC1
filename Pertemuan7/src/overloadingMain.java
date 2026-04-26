/*Nama File     : overloadingMain.java
  Deskripsi     : Aplikasi untuk mendemonstrasikan penggunaan overloading pada kelas Mahasiswa
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class overloadingMain {
    public static void main(String[] args) {
        System.out.println("Contoh aplikasi semua varian operator kelas Mahasiswa");

        //c. Konstuktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1: ");
        m1.cetak();

        //d. Konstruktor dengan tiga parameter
        Mahasiswa m2 = new Mahasiswa("24060124130110","Annis","Informatika");
        System.out.println("Mahasiswa 2: ");
        m2.cetak();

        //e. Konstruktor cloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3: ");
        m3.cetak();

        System.out.println("\nContoh aplikasi semua varian operator setProgramStudi");
        //Varian pertama: tanpa parameter
        System.out.println("Mengubah program studi m1 (tanpa parameter)");
        m1.setProgramStudi();
        m1.cetak();

        //Varian kedua: satu parameter string
        System.out.println("Mengubah program studi m1 (parameter string: 'Teknik Informatika')");
        m1.setProgramStudi("Teknik Informatika");
        m1.cetak();

        //Varian ketiga: parameter objek Mahasiswa
        System.out.println("Mengubah program studi m1 (mengambil dari mahasiswa 2)");
        m1.setProgramStudi(m2);
        m1.cetak();
    }
}