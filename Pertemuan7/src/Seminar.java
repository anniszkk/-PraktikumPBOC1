/*Nama File     : Seminar.java
  Deskripsi     : berisi atribut dan method dalam class Seminar
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class Seminar {
    /************ATRIBUT****************/
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor tanpa parameter
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    //SELEKTOR
    //mengembalikan banyakPeserta dari Seminar
    public int countPeserta() {
        return banyakPeserta;
    }

    //METHOD LAINNYA
    //menambahkan Peserta ke Seminar
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kuota peserta seminar penuh.");
        }
    }

    //menampilkan daftar Peserta yang terdaftar di Seminar
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        System.out.println("Nomor Peserta | Nama Peserta");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }

    //mengembalikan banyak Mahasiswa yang terdaftar di Seminar
    public int countMahasiswa() {
        int jmlMhs = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaNo4) {
                jmlMhs++;
            }
        }
        return jmlMhs;
    }
} //end class Seminar