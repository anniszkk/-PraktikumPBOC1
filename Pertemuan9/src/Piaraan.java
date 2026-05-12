/*Nama File     : Piaraan.java
  Deskripsi     : Piaraan merupakan kelas yang merepresentasikan daftar anabul dengan berbagai operasi seperti menambah, menghapus, dan memeriksa keanggotaan anabul.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /************ATRIBUT****************/
    private int nbelm;
    private Queue<Anabul> Lanabul;
    
    //KONSTRUKTOR
    //Konstruktor tanpa parameter
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    //i. getNbelm(), yaitu mengembalikan jumlah anabul yang ada dalam antrian
    public int getNbelm() {
        return this.nbelm;
    }

    //ii. enqueueAnabul(anabul), yaitu menambahkan anabul ke dalam antrian
    public void enqueueAnabul(Anabul anabul) {
        if (anabul != null) {
            this.Lanabul.add(anabul);
            this.nbelm++;
        } else {
            throw new IllegalArgumentException("Error: Anabul tidak boleh null");
        }
    }

    //iii. isMember(anabul), yaitu memeriksa apakah anabul ada dalam antrian
    public boolean isMember(Anabul anabul) {
        if (anabul != null) {
            return this.Lanabul.contains(anabul);
        } else {
            throw new IllegalArgumentException("Error: Anabul tidak boleh null");
        }
    }

    //iv. getAnabul(), yaitu mengembalikan anabul yang berada di depan antrian tanpa menghapusnya dari antrian
    public Anabul getAnabul() {
        if (this.nbelm > 0) {
            return this.Lanabul.peek();
        } else {
            throw new IllegalStateException("Error: Piaraan kosong");
        }
    }

    //v. dequeueAnabul(), yaitu mengembalikan anabul yang berada di depan antrian dan menghapusnya dari antrian
    public Anabul dequeueAnabul() {
        if (this.nbelm > 0) {
            this.nbelm--;
            return this.Lanabul.poll();
        } else {
            throw new IllegalStateException("Error: Piaraan kosong");
        }
    }

    //c. showAnabul(), yaitu menampilkan daftar anabul yang ada dalam antrian
    public void showAnabul() {
        if (this.nbelm > 0) {
            int nomor = 1;
            System.out.println("Daftar Anabul dalam Piaraan:");
            for (Anabul anabul : this.Lanabul) {
                System.out.println(nomor + ". " + anabul.getPanggilan());
                nomor++;
            }
        } else {
            System.out.println("Piaraan kosong");
        }
    }

    //d. countKucing(), yaitu menghitung jumlah kucing dalam antrian
    public int countKucing() {
        int count = 0;
        for (Anabul anabul : this.Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    //e. bobotKucing(), yaitu menghitung total bobot kucing dalam antrian
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul anabul : this.Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    //f. showJenisAnabul(), yaitu menampilkan nama dan jenis semua anabul dalam antrian
    public void showJenisAnabul() {
        if (this.nbelm > 0) {
            int nomor = 1;
            System.out.println("Nama dan Jenis Anabul dalam Piaraan:");
            for (Anabul anabul : this.Lanabul) {
                String jenis = anabul.getClass().getSimpleName();
                System.out.println(nomor + ". " + anabul.getPanggilan() + " (" + jenis + ")");
                nomor++;
            }
        } else {
            System.out.println("Error: Piaraan kosong");
        }
    }
} // end class Piaraan