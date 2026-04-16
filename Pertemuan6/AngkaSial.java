/*Nama File     : AngkaSial.java
  Deskripsi     : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 16 April 2026 */

public class AngkaSial {
    /**********METHOD*******************/
    //METHOD LAINNYA
    //mengecek apakah angka yang dimasukkan adalah angka sial atau bukan
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } else {
            System.out.println(angka + " bukan angka sial");
        }
    }

    public static void main(String[] args) {
        System.out.println("------------TEST UNTUK EXCEPTION------------");
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
} //end class AngkaSial

//Baris 16, System.out.println(angka + " bukan angka sial"); akan dieksekusi jika angka yang dimasukkan tidak sama dengan 13.
//Baris 27, catch (AngkaSialException ase) akan dieksekusi jika angka yang dimasukkan adalah 13, karena pada method cobaAngka terdapat klausa 'throws AngkaSialException'.
//getMessage() akan mengembalikan pesan yang sudah didefinisikan pada kelas Exception, yaitu "jangan memasukkan angka 13 karena angka sial !!!".
//dan akan menampilkan output "hati-hati memasukkan angka !!!" setelah pesan dari getMessage().
//Hal ini karena pada blok try terdapat pemanggilan as.cobaAngka(13);, yang akan memanggil method cobaAngka.
//method cobaAngka() akan melempar exception AngkaSialException() jika angka yang dimasukkan adalah 13. 
//Sehingga, program akan menagkap exception tersebut dan menampilkan pesan yang sudah didefinisikan pada kelas Exception. 
//Lalu baris pada blok catch akan dieksekusi.


//baris dengan kode as.cobaAngka(12); tidak akan dieksekusi karena baris kode sebelumnya yaitu as.cobaAngka(13); akan melempar exception AngkaSialException() yang akan ditangkap oleh blok catch.
//sehingga program akan langsung mengeksekusi blok catch dan berhenti pada baris kode tersebut.
//Sehingga, output yang dihasilkan ketika program dijalankan adalah :
//10 bukan angka sial
//jangan memasukkan angka 13 karena angka sial !!!
//hati-hati memasukkan angka !!!