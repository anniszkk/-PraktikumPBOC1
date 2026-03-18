public class DosenTamu extends Dosen {
    private String nidk;
    private String tanggalBerakhirKontrak;
    private final double tunjangan = 0.025;
    private static int counterDosenTamu = 0;

    public DosenTamu() {
        counterDosenTamu++;
    }

    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, String tmt, String fakultas, double gajiPokok, String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
        counterDosenTamu++;
    }

    // public int bup(String now) {
    //     return tanggalBerakhirKontrak - now;
    // }

    public String tanggalPensiun(int bup) {
        return getTanggalLahir() + bup;
    }

    public double tunjangan() {
        return tunjangan * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("Jabatan         : Dosen Tamu");
        // System.out.println("Tanggal Pensiun    : " + this.tanggalPensiun(this.bup(now)) + " bulan");
        System.out.println("Tunjangan       : 2,5% x " + this.tunjangan());
        System.out.println("--------------------------------------------------");
    }
} //end class DosenTamu