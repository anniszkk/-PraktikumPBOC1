/*Nama File     : MMahasiswa.java
  Deskripsi     : berisi atribut dan method dalam class Mahasiswa
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS DOSEN------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Dosen D1 = new Dosen("1332947583", "Adi Sanjoyo", "Informatika");
        Dosen D2 = new Dosen();
        D1.printDosen();
        D2.printDosen();
        System.out.println();
        System.out.println("2. Cek mutator untuk dosen D2 yang belum punya data");
        D2.setNip("240134");
        D2.setNama("Binar xixi");
        D2.setProdi("Informatika");
        D2.printDosen();
        System.out.println();
        System.out.println("3. Cek selektor untuk dosen D1");
        System.out.println("Dosen D1 ini punya NIP: " + D1.getNip());
        System.out.println("Dosen D1 ini punya nama: " + D1.getNama());
        System.out.println("Dosen D1 ini berasal dari prodi: " + D1.getProdi());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu getCounterDosen");
        System.out.println("Jumlah objek Dosen = " + Dosen.getCounterDosen());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS MATAKULIAH------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        MataKuliah MK1 = new MataKuliah("MIK4678", "PBO", 3);
        MataKuliah MK2 = new MataKuliah("MIK9812", "MBD", 3);
        MataKuliah MK3 = new MataKuliah("MIK5910", "ASA", 3);
        MataKuliah MK4 = new MataKuliah();
        MK1.printMatKul();
        MK2.printMatKul();
        MK3.printMatKul();
        MK4.printMatKul();
        System.out.println();
        System.out.println("2. Cek mutator untuk mata kuliah MK4 yang belum punya data");
        MK4.setIdMatKul("MIK3000");
        MK4.setNama("GTI");
        MK4.setSks(3);
        MK4.printMatKul();
        System.out.println();
        System.out.println("3. Cek selektor untuk mata kuliah MK1");
        System.out.println("Matakuliah MK1 punya ID: " + MK1.getIdMatKul());
        System.out.println("Matakuliah MK1 punya nama: " + MK1.getNama());
        System.out.println("Matakuliah MK1 punya sks: " + MK1.getSks());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu getCounterMatKul");
        System.out.println("Jumlah objek MataKuliah = " + MataKuliah.getCounterMatKul());
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS KENDARAAN------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Kendaraan K1 = new Kendaraan("A 5687 ZK", "Motor");
        Kendaraan K2 = new Kendaraan();
        K1.printKendaraan();
        K2.printKendaraan();
        System.out.println();
        System.out.println("2. Cek mutator untuk kendaraan K2 yang belum punya data");
        K2.setNoPlat("B 6785 AS");
        K2.setJenis("Mobil");
        K2.printKendaraan();
        System.out.println();
        System.out.println("3. Cek selektor untuk kendaraan K1");
        System.out.println("Kendaraan K1 punya nomor plat: " + K1.getNoPlat());
        System.out.println("Kendaraan K1 berjenis: " + K1.getJenis());
        System.out.println();
        System.out.println("4. Cek method lainnya, yaitu getCounterKendaraan");
        System.out.println("Jumlah objek Kendaraan = " + Kendaraan.getCounterKendaraan());
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS MAHASISWA------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Mahasiswa M1 = new Mahasiswa("24060124120045", "Nissa Akbar", "Ilmu Perpustakaan");
        Mahasiswa M2 = new Mahasiswa();
        M1.printMhs();
        M1.printDetailMhs();
        System.out.println();
        M2.printMhs();
        M2.printDetailMhs();
        System.out.println();
        System.out.println("2. Cek mutator untuk mahasiswa M2 yang belum punya data");
        M2.setNim("24060124130110");
        M2.setNama("Annis Fakhiroh AKbar");
        M2.setProdi("Informatika");
        M2.addMatKul(MK1);
        M2.addMatKul(MK2);
        M2.addMatKul(MK3);
        M2.setDosenWali(D1);
        M2.setKendaraan(K1);
        M2.printDetailMhs();
        System.out.println();
        System.out.println("3. Cek selektor untuk mahasiswa M1");
        System.out.println("Mahasiswa M1 punya NIM: " + M1.getNim());
        System.out.println("Mahasiswa M1 punya nama: " + M1.getNama());
        System.out.println("Mahasiswa M1 berasal dari prodi: " + M1.getProdi());
        System.out.println();
        System.out.println("4. Cek method lainnya: ");
        System.out.println("a. Fungsi untuk menghitung jumlah sks yang diambil seorang mahasiswa");
        System.out.println("Jumlah SKS yang diambil oleh M2: " + M2.getJumlahSKS());
        System.out.println("b. Fungsi untuk menghitung jumlah mata kuliah yang diambil seorang mahasiswa");
        System.out.println("Jumlah mata kuliah yang diambil oleh M2: " + M2.getJumlahMatKul());
        System.out.println("c. Fungsi untuk menghitung jumlah objek Mahasiswa yang telah dibuat");
        System.out.println("Jumlah objek Mahasiswa = " + Mahasiswa.getCounterMhs());
    }
}