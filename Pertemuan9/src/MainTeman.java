public class MainTeman {
    public static void main(String[] args) {
        Teman teman1 = new Teman();
        System.out.println("Jumlah elemen awal: " + teman1.getNbelm());
        try {
            teman1.addNama("Alice");
            teman1.addNama("Bob");
            teman1.addNama("Charlie");
            // teman1.addNama(null);
            teman1.addNama("");
            teman1.showTeman();

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Jumlah elemen setelah ditambahkan: " + teman1.getNbelm());
        
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

        try {
            System.out.println("Apakah 'Bobby' bisa dihapus? " + teman1.delNama("Bobby"));
            System.out.println("Jumlah elemen setelah dihapus: " + teman1.getNbelm());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Apakah 'Binar' bisa dihapus? " + teman1.delNama("Binar"));
            System.out.println("Jumlah elemen setelah dihapus: " + teman1.getNbelm());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Apakah 'Charlie' adalah member? " + teman1.isMember("Charlie"));
            System.out.println("Apakah 'Binar' adalah member? " + teman1.isMember("Binar"));
            System.out.println("Apakah null adalah member? " + teman1.isMember(null));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Ganti nama di indeks 'Bob' dengan 'Binar': " + teman1.gantiNama("Bob", "Binar"));
            teman1.showTeman();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Ganti nama di indeks 'Alice' dengan 'Binar': " + teman1.gantiNama("Alice", "Binar"));
            teman1.showTeman();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Ganti nama di indeks null dengan 'Binar': " + teman1.gantiNama(null, "Binar"));
            teman1.showTeman();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Jumlah nama 'Binar': " + teman1.countNama("Binar"));
            System.out.println("Jumlah nama null: " + teman1.countNama(null));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
