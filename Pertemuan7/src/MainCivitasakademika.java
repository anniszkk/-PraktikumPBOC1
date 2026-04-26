/*Nama File     : MainCivitasakademika.java
  Deskripsi     : MainCivitasakademika merupakan mainclass untuk menjalankan kelas Seminar, Dosen, dan MahasiswaNo4
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class MainCivitasakademika {
    public static void main(String[] args) {
        System.out.println("------Pembuatan objek Seminar------");
        Seminar seminar1 = new Seminar();
        System.out.println();

        System.out.println("------Pembuatan 2 objek Dosen dan 5 objek Mahasiswa------");
        Dosen dosen1 = new Dosen("Dr. Yusuf","068294");
        Dosen dosen2 = new Dosen("Dr. Siti", "109837");
        MahasiswaNo4 mahasiswa1 = new MahasiswaNo4("Andi","240601241301");
        MahasiswaNo4 mahasiswa2 = new MahasiswaNo4("Budi", "240601241302");
        MahasiswaNo4 mahasiswa3 = new MahasiswaNo4("Caca", "240601241303");
        MahasiswaNo4 mahasiswa4 = new MahasiswaNo4("Dedi", "240601241304");
        MahasiswaNo4 mahasiswa5 = new MahasiswaNo4("Elis", "240601241305");
        System.out.println();

        System.out.println("------Pengujian prosedur registrasi------");
        seminar1.registrasi(dosen1);
        seminar1.registrasi(dosen2);
        seminar1.registrasi(mahasiswa1);
        seminar1.registrasi(mahasiswa2);
        seminar1.registrasi(mahasiswa3);
        seminar1.registrasi(mahasiswa4);
        seminar1.registrasi(mahasiswa5);
        System.out.println();

        System.out.println("------Pengujian fungsi countPeserta------");
        System.out.println("Jumlah Peserta: " + seminar1.countPeserta());
        System.out.println();

        System.out.println("------Pengujian prosedur tampilPeserta------");
        seminar1.tampilPeserta();
        System.out.println();

        System.out.println("------Pengujian fungsi countMahasiswa------");
        System.out.println("Jumlah Mahasiswa: " + seminar1.countMahasiswa());
        System.out.println();

        System.out.println("------Pengujian prosedur setWali------");
        mahasiswa1.setWali(dosen1);
        mahasiswa2.setWali(dosen2);
        mahasiswa3.setWali(dosen1);
        mahasiswa4.setWali(dosen2);
        System.out.println();

        System.out.println("------Pengujian prosedur tampilDataMahasiswa------");
        mahasiswa1.tampilDataMahasiswa();
        mahasiswa2.tampilDataMahasiswa();
        mahasiswa3.tampilDataMahasiswa();
        mahasiswa4.tampilDataMahasiswa();
        mahasiswa5.tampilDataMahasiswa();
    }
}