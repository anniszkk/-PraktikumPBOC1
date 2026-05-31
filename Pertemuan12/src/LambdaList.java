/*Nama File     : LambdaList.java
  Deskripsi     : Implementasi lambda pada List, digunakan sebagai parameter pada method.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 31 Mei 2026 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();

        // Menambahkan nama mahasiswa ke ArrayList
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}