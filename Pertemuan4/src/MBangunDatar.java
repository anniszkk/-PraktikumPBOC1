public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar BD1 = new BangunDatar();
        BD1.printInfo();
        System.out.println();
        BD1.setJmlSisi(5);
        BD1.setWarna("pink");
        BD1.setBorder("hitam");
        BD1.printInfo();
        BangunDatar.printCounterBangunDatar();
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(5, "pink", "hitam");
        P1.printInfo();
        P2.printInfo();
        P1.setSisi(2);
        P1.printInfo();
        System.out.println("Panjang sisi: " + P2.getSisi());
        System.out.println("Luas persegi: " + P2.getLuas());
        System.out.println("Keliling persegi: " + P2.getKeliling());
        System.out.println("Panjang diagonal persegi: " + P2.getDiagonal());
        System.out.println();
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(7, "pink", "hitam");
        L1.printInfo();
        L2.printInfo();
        L1.setJari(7);
        L1.printInfo();
        System.out.println("Luas lingkaran: " + L2.getLuas());
        System.out.println("Keliling lingkaran : " + L2.getKeliling());

    }
}
