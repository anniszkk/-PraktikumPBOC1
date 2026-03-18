public class Pegawai {
    private String nip;
    private String nama;
    private String tanggalLahir;
    private String tmt;
    private double gajiPokok;
    private static int counterPegawai = 0;
    private final String tanggalSkrng = "18 Maret 2026";

    public Pegawai() {
        counterPegawai++;
    }

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public static void printCounterPegawai() {
        System.out.println("Jumlah objek Pegawai: " + counterPegawai);
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(String tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //METHOD LAINNYA

    // public int masaKerja(String now) {
    //     return now - tmt;
    // }

    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("TMT             : " + tmt);
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("--------------------------------------------------");
    }
} //end class Pegawai