/*Nama File     : MMahasiswa.java
  Deskripsi     : berisi atribut dan method dalam class Dosen
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS DOSEN------------");
        Dosen D1 = new Dosen("1332947583", "Adi Sanjoyo", "Informatika");
        Dosen D2 = new Dosen();
        D1.printDosen();
        D2.printDosen();
        D2.setNip("240134");
        D2.setNama("Binar xixi");
        D2.setProdi("Informatika");
        D2.printDosen();
        System.out.println("Jumlah objek Dosen = " + Dosen.getCounterDosen());

        System.out.println();
        System.out.println("------------TEST UNTUK CLASS MATAKULIAH------------");
        MataKuliah MK1 = new MataKuliah("MIK4678", "PBO", 3);
        MataKuliah MK2 = new MataKuliah("MIK9812", "MBD", 3);
        MataKuliah MK3 = new MataKuliah("MIK5910", "ASA", 3);
        MataKuliah MK4 = new MataKuliah();
        MK1.printMatKul();
        MK2.printMatKul();
        MK3.printMatKul();
        MK4.printMatKul();
        MK4.setIdMatKul("MIK3000");
        MK4.setNama("GTI");
        MK4.setSks(3);
        MK4.printMatKul();
        System.out.println("Jumlah objek MataKuliah = " + MataKuliah.getCounterMatKul());
        
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS KENDARAAN------------");
        Kendaraan K1 = new Kendaraan("A 5687 ZK", "Motor");
        Kendaraan K2 = new Kendaraan();
        K1.printKendaraan();
        K2.printKendaraan();
        K2.setNoPlat("B 6785 AS");
        K2.setJenis("Mobil");
        K2.printKendaraan();
        System.out.println("Jumlah objek Kendaraan = " + Kendaraan.getCounterKendaraan());
        
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS MAHASISWA------------");
        Mahasiswa M1 = new Mahasiswa("24060124120045", "Nissa Akbar", "Ilmu perpustakaan");
        Mahasiswa M2 = new Mahasiswa();
        M1.printMhs();
        M1.printDetailMhs();
        M2.printMhs();
        M2.printDetailMhs();
        M2.setNim("24060124130110");
        M2.setNama("Annis Fakhiroh AKbar");
        M2.setProdi("Informatika");
        M2.addMatKul(MK1);
        M2.addMatKul(MK2);
        M2.addMatKul(MK3);
        M2.setDosenWali(D1);
        M2.setKendaraan(K1);
        M2.printDetailMhs();
        System.out.println("Jumlah SKS yang diambil oleh M2: " + M2.getJumlahSKS());
        System.out.println("Jumlah mata kuliah yang diambil oleh M2: " + M2.getJumlahMatKul());
        System.out.println("Jumlah objek Mahasiswa = " + Mahasiswa.getCounterMhs());
    }
}