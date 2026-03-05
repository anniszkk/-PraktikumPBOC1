public class MataKuliah {
    /*************ATRIBUT*******************/
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatKul = 0;

    /*************METHOD********************/
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
        counterMatKul++;
    }

    public MataKuliah(String idMatKul,String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
        counterMatKul++;
    }

    public String getIdMatKul() {
        return this.idMatKul;
    }

    public String getNama() {
        return this.nama;
    } 

    public int getSks() {
        return this.sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public static int getCounterMatKul() {
        return counterMatKul;
    }

    public void printMatKul() {
        System.out.println("Mata kuliah ini punya idMatKul = " + this.idMatKul + ", Nama = " + this.nama + ", dan jumlah sks = " + this.sks);
    }
}
