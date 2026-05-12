/*Nama File     : MainTeman.java
  Deskripsi     : Main class untuk menguji method-method dalam kelas Teman.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class MainTeman {
    public static void main(String[] args) {
        Teman teman1 = new Teman();
        System.out.println("----Menambahkan teman ke dalam daftar Teman----");
        System.out.println("Jumlah elemen awal: " + teman1.getNbelm());
        try {
            teman1.addNama("Alice");
            teman1.addNama("Bob");
            teman1.addNama("Charlie");
            teman1.showTeman();
            teman1.addNama("");
            teman1.addNama(null);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Menampilkan jumlah teman dalam daftar Teman----");
        System.out.println("Jumlah elemen setelah ditambahkan: " + teman1.getNbelm());
        System.out.println();

        System.out.println("----Menampilkan nama teman berdasarkan indeks----");
        try {
            System.out.println("Nama di indeks 1: " + teman1.getNama(1));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Nama di indeks 5: " + teman1.getNama(5));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Mengubah nama teman berdasarkan indeks----");
        try {
            teman1.setNama(0, "Bobby");
            teman1.showTeman();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            teman1.setNama(5, "Binar");
            teman1.showTeman();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Menghapus teman dari daftar Teman----");
        try {
            System.out.println("Apakah 'Bobby' bisa dihapus? " + teman1.delNama("Bobby"));
            System.out.println("Jumlah elemen setelah dihapus: " + teman1.getNbelm());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Apakah 'Binar' bisa dihapus? " + teman1.delNama("Binar"));
            System.out.println("Jumlah elemen setelah dihapus: " + teman1.getNbelm());
            System.out.println("Apakah null bisa dihapus? " + teman1.delNama(null));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Memeriksa keanggotaan teman dalam daftar Teman----");
        try {
            System.out.println("Apakah 'Charlie' adalah member? " + teman1.isMember("Charlie"));
            System.out.println("Apakah 'Binar' adalah member? " + teman1.isMember("Binar"));
            System.out.println("Apakah null adalah member? " + teman1.isMember(null));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Mengganti nama teman dalam daftar Teman----");
        try {
            System.out.println("Ganti nama 'Bob' dengan 'Binar': " + teman1.gantiNama("Bob", "Binar"));
            teman1.showTeman();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Ganti nama 'Alice' dengan 'Binar': " + teman1.gantiNama("Alice", "Binar"));
            teman1.showTeman();
            System.out.println("Ganti nama null dengan 'Binar': " + teman1.gantiNama(null, "Binar"));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("----Menghitung jumlah nama tertentu dalam daftar Teman----");
        try {
            System.out.println("Jumlah nama 'Binar': " + teman1.countNama("Binar"));
            System.out.println("Jumlah nama null: " + teman1.countNama(null));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
} // end class MainTeman