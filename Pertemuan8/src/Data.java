/*Nama File     : Data.java
  Deskripsi     : Data adalah kelas generik yang memiliki larik statis berisi 100 elemen generik.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class Data<T> {
    /************ATRIBUT****************/
    private T[] ruang;
    private int banyak;
    private static final int maxKapasitas = 100;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor tanpa parameter
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[maxKapasitas];
        this.banyak = 0;
    }

    //SELEKTOR
    //mengembalikan nilai isi pada posisi tertentu
    //Validasi posisi agar hanya menerima angka 1 hingga 100
    public T getIsi(int posisi) { 
        if (posisi >= 1 && posisi <= maxKapasitas) {
            return ruang[posisi - 1];
        } else {
            System.out.println("Posisi tidak valid");
            return null;
        }
    }

    //mengembalikan banyaknya elemen yang terisi dalam larik
    public int getSize() {
        return banyak;
    }

    //mengembalikan kapasitas maksimum larik
    public int getMaxKapasitas() {
        return maxKapasitas;
    }

    //MUTATOR
    //mengubah nilai isi pada posisi tertentu
    //Validasi posisi agar hanya menerima angka 1 hingga 100
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= maxKapasitas) {
            if (ruang[posisi - 1] == null && objek != null) {
                banyak++;
                ruang[posisi - 1] = objek;
            } else if (ruang[posisi - 1] != null && objek != null) {
                ruang[posisi - 1] = objek;
            } else if (ruang[posisi - 1] != null && objek == null) {
                banyak--;
                ruang[posisi - 1] = null;
            }
        } else {
            System.out.println("Error: Posisi " + posisi + " di luar batas {1.." + maxKapasitas + "}");
        }
    }
} //end class Data