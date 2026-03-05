/*Nama File     : MataKuliah.java
  Deskripsi     : berisi atribut dan method dalam class MataKuliah
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

public class MataKuliah {
    /*************ATRIBUT*******************/
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatKul = 0;

    /*************METHOD********************/
    //KONSTRUKTOR
    //konstruktor untuk membuat mata kuliah dengan ID MatKul dan nama dikosongkan, serta sks = 0
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
        counterMatKul++;
    }

    //konstruktor untuk membuat mata kuliah dengan nilai ID MatKul, nama, dan sks tertentu
    public MataKuliah(String idMatKul,String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
        counterMatKul++;
    }

    //SELEKTOR
    //mengembalikan ID mata kuliah
    public String getIdMatKul() {
        return this.idMatKul;
    }

    //mengembalikan nama mata kuliah
    public String getNama() {
        return this.nama;
    } 

    //mengembabalikan jumlah sks mata kuliah
    public int getSks() {
        return this.sks;
    }

    //mengembalikan nilai counterMatKul
    public static int getCounterMatKul() {
        return counterMatKul;
    }

    //MUTATOR
    //mengeset ID MatKul dengan nilai baru string idMatKul
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    //mengeset nama mata kuliah dengan nilai baru string nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset jumlah sks mata kuliah dengan nilai baru sks
    public void setSks(int sks) {
        this.sks = sks;
    }

    //METHOD LAINNYA
    //mencetak data mata kuliah
    public void printMatKul() {
        System.out.println("Mata kuliah ini punya idMatKul = " + this.idMatKul + ", Nama = " + this.nama + ", dan jumlah sks = " + this.sks);
    }
} // end class MataKuliah