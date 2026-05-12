/*Nama File     : MainAnabul.java
  Deskripsi     : MainAnabul merupakan kelas yang berisi method main untuk menguji fungsi-fungsi dalam kelas Piaraan.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class MainAnabul {
    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Buddy");
        anjing1.setPanggilan("Lulu");
        Anjing anjing2 = new Anjing("Max");
        anjing2.setPanggilan("Maxy");
        Kucing kucing1 = new Kucing("Whiskers", 4.5);
        kucing1.setPanggilan("Mimi");
        Burung burung1 = new Burung("Tweety");
        burung1.setPanggilan("Tweet");  
        Anggora anggora1 = new Anggora("Snowball", 3.2);
        anggora1.setPanggilan("Snowy");
        Kembangtelon kembangtelon1 = new Kembangtelon("Fluffy", 2.8);
        kembangtelon1.setPanggilan("Fluff");
        Piaraan piaraan = new Piaraan();
        Piaraan piaraan2 = new Piaraan();
        System.out.println("----Menambahkan Anabul ke dalam Piaraan----");
        try {
            piaraan.enqueueAnabul(anjing1);
            piaraan.enqueueAnabul(kucing1);
            piaraan.enqueueAnabul(burung1);
            piaraan.enqueueAnabul(anggora1);
            piaraan.enqueueAnabul(kembangtelon1);  
            piaraan.showAnabul();
            piaraan.enqueueAnabul(null); 
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();

        System.out.println("----Menampilkan jumlah Anabul dalam Piaraan----");
        System.out.println("Jumlah Anabul dalam Piaraan: " + piaraan.getNbelm());
        System.out.println();
        System.out.println("----Apakah anjing2 adalah member Piaraan?----");
        try {
            System.out.println("Apakah anjing2 adalah member Piaraan? " + piaraan.isMember(anjing2));
            System.out.println("Apakah kucing1 adalah member Piaraan? " + piaraan.isMember(kucing1));
            System.out.println("Apakah null adalah member Piaraan? " + piaraan.isMember(null));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();

        System.out.println("----Mengambil Anabul dari Piaraan (tidak menghapus)----");
        try {
            Anabul anabulPeek = piaraan.getAnabul();
            System.out.println("Anabul di paling depan dari Piaraan: " + anabulPeek.getPanggilan());
            System.out.println("Jumlah Anabul dalam Piaraan setelah getAnabul: " + piaraan.getNbelm());
            System.out.println("Anabul di paling depan dari Piaraan2: " + piaraan2.getAnabul().getPanggilan());
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();

        System.out.println("----Mengambil Anabul dari Piaraan (menghapus)----");
        try {
            Anabul anabulDequeue = piaraan.dequeueAnabul();
            System.out.println("Anabul yang diambil dari Piaraan: " + anabulDequeue.getPanggilan());
            System.out.println("Jumlah Anabul dalam Piaraan setelah dequeueAnabul: " + piaraan.getNbelm());
            System.out.println("Anabul yang diambil dari Piaraan2: " + piaraan2.dequeueAnabul().getPanggilan());
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();

        System.out.println("----Menampilkan Anabul dalam Piaraan saat ini----");
        piaraan.showAnabul();
        piaraan2.showAnabul();
        System.out.println();

        System.out.println("----Menampilkan jumlah Kucing dalam Piaraan----");
        System.out.println("Jumlah Kucing dalam Piaraan: " + piaraan.countKucing());
        System.out.println();

        System.out.println("----Menampilkan jumlah bobot seluruh Kucing dalam Piaraan----");
        System.out.println("Jumlah bobot seluruh Kucing dalam Piaraan: " + piaraan.bobotKucing() + " kg");
        System.out.println();

        System.out.println("----Menampilkan seluruh Anabul dengan nama panggilan dan jenisnya----");
        piaraan.showJenisAnabul();
        piaraan2.showJenisAnabul();
        System.out.println();
    }
} // end class MainAnabul