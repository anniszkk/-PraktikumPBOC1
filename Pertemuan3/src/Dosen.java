/*Nama File     : Dosen.java
  Deskripsi     : berisi atribut dan method dalam class Dosen
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

public class Dosen {
    /*************ATRIBUT*******************/
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;

    /*************METHOD********************/
    //KONSTRUKTOR
    //konstruktor untuk membuat dosen dengan NIP, nama, dan prodi dikosongkan
    public Dosen() {
       this.nip = "";
       this.nama = "";   
       this.prodi = "";
       counterDosen++; 
    }

    //konstruktor untuk membuat dosen dengan nilai NIP, nama, dan prodi tertentu
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }

    //SELEKTOR
    //mengembalikan NIP dari dosen
    public String getNip() {
        return this.nip;
    }

    //mengembalikan nama dari dosen
    public String getNama() {
        return this.nama;
    }

    //mengembalikan nama prodi dari dosen
    public String getProdi() {
        return this.prodi;
    }

    //mengembalikan nilai counterDosen
    public static int getCounterDosen() {
        return counterDosen;
    }

    //MUTATOR
    //mengeset NIP dengan nilai baru string nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mengeset Nama dengan nilai baru string nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset Prodi dengan nilai baru string prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    //METHOD LAINNYA
    //mencetak data dosen
    public void printDosen() {
        System.out.println("Dosen punya NIP = " + this.nip + ", Nama = " + this.nama + ", dan Prodi = " + this.prodi);
    }
} //end class Dosen