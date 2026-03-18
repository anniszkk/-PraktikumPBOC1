public class Dosen extends Pegawai{
    private String fakultas;
    private static int counterDosen = 0;

    public Dosen() {
        counterDosen++;
    }

    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + fakultas);
    }
} //end class Dosen
