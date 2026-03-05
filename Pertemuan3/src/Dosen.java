public class Dosen {
    /*************ATRIBUT*******************/
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;

    /*************METHOD********************/
    public Dosen() {
       this.nip = "";
       this.nama = "";   
       this.prodi = "";
       counterDosen++; 
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }

    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public static int getCounterDosen() {
        return counterDosen;
    }

    public void printDosen() {
        System.out.println("Dosen punya NIP = " + this.nip + ", Nama = " + this.nama + ", dan Prodi = " + this.prodi);
    }
}
