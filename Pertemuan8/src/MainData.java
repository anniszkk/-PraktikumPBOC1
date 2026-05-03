/*Nama File     : MainData.java
  Deskripsi     : MainData merupakan mainclass untuk menjalankan kelas Data
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class MainData {
    public static void main(String[] args) {
        System.out.println("--- APLIKASI KELAS DATA ---");
        // Membuat objek Data dengan tipe data Integer
        System.out.println("--- Aplikasi Data dengan Tipe Data Integer ---");
        Data<Integer> dataInteger = new Data<>();
        System.out.println("Kapasitas Data Integer: " + dataInteger.getMaxKapasitas());
        System.out.println("Jumlah Data Integer saat ini: " + dataInteger.getSize());
        System.out.println();

        //mengisi beberapa elemen pada dataInteger
        dataInteger.setIsi(1, 10);
        dataInteger.setIsi(2, 20);
        dataInteger.setIsi(4, 40);
        dataInteger.setIsi(5, 30);
        System.out.println("Jumlah Data Integer setelah diisi: " + dataInteger.getSize());
        System.out.println("Isi Data Integer pada posisi 1: " + dataInteger.getIsi(1));
        System.out.println("Isi Data Integer pada posisi 2: " + dataInteger.getIsi(2));
        System.out.println("Isi Data Integer pada posisi 3: " + dataInteger.getIsi(3));
        System.out.println("Isi Data Integer pada posisi 4: " + dataInteger.getIsi(4));
        System.out.println("Isi Data Integer pada posisi 5: " + dataInteger.getIsi(5));
        System.out.println("Isi Data Integer pada posisi 101: " + dataInteger.getIsi(101));
        dataInteger.setIsi(5, 50);
        System.out.println("Isi Data Integer pada posisi 5 setelah diubah: " + dataInteger.getIsi(5));
        dataInteger.setIsi(2, null);
        System.out.println("Jumlah Data Integer setelah posisi 2 dihapus: " + dataInteger.getSize());
        System.out.println("Isi Data Integer pada posisi 2 setelah dihapus: " + dataInteger.getIsi(2));
        System.out.println("Isi Data Integer pada posisi 101: ");
        dataInteger.setIsi(101, 60);
        System.out.println();

        System.out.println("--- Aplikasi Data dengan Tipe Data String ---");
        Data<String> dataString = new Data<>();
        System.out.println("Kapasitas Data String: " + dataString.getMaxKapasitas());
        System.out.println("Jumlah Data String saat ini: " + dataString.getSize());
        System.out.println();
        dataString.setIsi(1, "Toothless");
        dataString.setIsi(2, "Hiccup");
        dataString.setIsi(4, "Gobber");
        dataString.setIsi(5, "Snowball");   
        System.out.println("Jumlah Data String setelah diisi: " + dataString.getSize());
        System.out.println("Isi Data String pada posisi 1: " + dataString.getIsi(1));
        System.out.println("Isi Data String pada posisi 2: " + dataString.getIsi(2));
        System.out.println("Isi Data String pada posisi 3: " + dataString.getIsi(3));
        System.out.println("Isi Data String pada posisi 4: " + dataString.getIsi(4));
        System.out.println("Isi Data String pada posisi 5: " + dataString.getIsi(5));
        System.out.println("Isi Data String pada posisi 101: " + dataString.getIsi(101));
        dataString.setIsi(5, "Fluffy");
        System.out.println("Isi Data String pada posisi 5 setelah diubah: " + dataString.getIsi(5));
        dataString.setIsi(2, null);
        System.out.println("Jumlah Data String setelah posisi 2 dihapus: " + dataString.getSize());
        System.out.println("Isi Data String pada posisi 2 setelah dihapus: " + dataString.getIsi(2));
        System.out.println("Isi Data String pada posisi 101: ");
        dataString.setIsi(101, "Nugget");
        System.out.println();

        System.out.println("--- Aplikasi Data dengan Tipe Data Anabul ---");
        Data<Anabul> dataAnabul = new Data<>();
        Anabul anabul1 = new Kucing("Whiskers", 4.5);
        Anabul anabul2 = new Anjing("Rex");
        Anabul anabul3 = new Burung("Tweety");
        Anabul anabul4 = new Anggora("MewMew", 5.0);
        Anabul anabul5 = new Kembangtelon("Kembang", 3.0);
        dataAnabul.setIsi(1, anabul1);
        dataAnabul.setIsi(2, anabul2);
        dataAnabul.setIsi(3, anabul3);
        dataAnabul.setIsi(4, anabul4);
        dataAnabul.setIsi(5, anabul5);
        System.out.println("Jumlah Data Anabul setelah diisi: " + dataAnabul.getSize());
        System.out.println("Isi data Anabul: ");
        for (int i = 1; i <= dataAnabul.getMaxKapasitas(); i++) {
            if (dataAnabul.getIsi(i) != null) { 
                if (dataAnabul.getIsi(i) instanceof Kucing) {
                    System.out.println("Isi Data Anabul pada posisi " + i + ": " + dataAnabul.getIsi(i).getNama() + ", Bobot: " + ((Kucing) dataAnabul.getIsi(i)).getBobot() + " kg");
                    if (dataAnabul.getIsi(i) instanceof Anggora) {
                        System.out.println("Jenis Rambut: " + ((Anggora) dataAnabul.getIsi(i)).getJenisRambut());
                    } else if (dataAnabul.getIsi(i) instanceof Kembangtelon) {
                        System.out.println("Jenis Rambut: " + ((Kembangtelon) dataAnabul.getIsi(i)).getJenisRambut());
                    }
                } else {
                    System.out.println("Isi Data Anabul pada posisi " + i + ": " + dataAnabul.getIsi(i).getNama());
                }
                dataAnabul.getIsi(i).Gerak();
                dataAnabul.getIsi(i).Bersuara();
                System.out.println();
            }
        }
        System.out.println("Isi Data Anabul pada posisi 101: " + dataAnabul.getIsi(101));
        dataAnabul.setIsi(5, null);
        System.out.println("Jumlah Data Anabul setelah posisi 5 dihapus: " + dataAnabul.getSize());
        System.out.println("Isi Data Anabul pada posisi 5 setelah dihapus: " + dataAnabul.getIsi(5));
        System.out.println("Isi Data Anabul pada posisi 101: ");
        dataAnabul.setIsi(101, anabul5);
        System.out.println();
    }
} //end class MainData