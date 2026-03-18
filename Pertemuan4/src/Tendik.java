public class Tendik extends Pegawai {
    private String bidang;
    private final int bup = 55;
    private final double tunjangan = 0.01;
    private static int counterTendik = 0;

    public Tendik() {
        counterTendik++;
    }

    public Tendik(String nip, String nama, String tanggalLahir, String tmt, String bidang, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
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
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        // System.out.println("Tanggal Pensiun : " + this.tanggalPensiun(bup));
        // System.out.println("Tunjangan       : 1% x " + this.tunjangan(this.masaKerja(now)));
        System.out.println("--------------------------------------------------");
    }

}// end class Tendik