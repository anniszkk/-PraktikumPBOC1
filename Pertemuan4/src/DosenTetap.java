public class DosenTetap extends Dosen{
    private String nidn;
    private final int bup = 65;
    private final double tunjangan = 0.02;
    private static int counterDosenTetap = 0;

    public DosenTetap() {
        counterDosenTetap++;
    }

    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, String tmt, String fakultas, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
        counterDosenTetap++;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // public String tanggalPensiun() {
    //     return tanggalLahir + bup;
    // }

    public double tunjangan(int masaKerja) {
        return tunjangan * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN            : " + nidn);
        System.out.println("Jabatan         : Dosen Tetap");
        // System.out.println("Masa Kerja      : " + this.masaKerja(now));
        // System.out.println("Tanggal Pensiun : " + this.tanggalPensiun(bup));
        // System.out.println("Tunjangan       : " + this.tunjangan(this.masaKerja(now)));
        System.out.println("--------------------------------------------------");
    }
} //end class DosenTetap