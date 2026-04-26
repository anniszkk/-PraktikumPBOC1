/*Nama File     : coercionMain.java
  Deskripsi     : coercionMain merupakan mainclass untuk membuktikan hasil penerapan coercion
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class coercionMain {
    public static void main(String[] args) {
        //Coba char ke int
        int outputCharA = 'a';
        System.out.println("Hasil konversi karakter 'a' ke int: " + outputCharA);

        //Coba double ke int
        double output = 15.5;
        int outputInt = (int) output;
        System.out.println("Hasil konversi double 15.5 ke int: " + outputInt);

        //Coba int ke double
        int y = 25;
        double outputDouble = y;
        System.out.println("Hasil konversi int 25 ke double: " + outputDouble);

        //COba int ke char
        int z = 78;
        char outputCharZ = (char) z;
        System.out.println("Hasil konversi int 78 ke char: " + outputCharZ);

        //Coba char ke double
        char a = 'a';
        double outputDoubleA = a;
        System.out.println("Hasil konversi char 'a' ke double: " + outputDoubleA);

        //a. Polimorfisme nilai integer 65
        int intValue = 65;
        System.out.println("Sebagai integer: " + intValue);
        System.out.println("Sebagai karakter: " + (char) intValue);
        System.out.println("Sebagai real: " + (double) intValue);

        //b. Konversi integer ke real dan kembali menjadi integer
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("Nilai real: " + realValue);
        System.out.println("Kembali ke integer: " + newIntValue);

        //c. Konkatenasi dan penjumlahan string X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y: " + S);
        System.out.println("Penjumlahan X dan Y: " + Z);

        //d. Konkatenasi dan penjumlahan string P dan Q 
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q: " + R);
        System.out.println("Penjumlahan P dan Q: " + D);

        //e. Konversi nilai S menjadi Integer
        Integer A = Integer.parseInt(S);
        System.out.println("Konversi S ke Integer A: " + A);
        System.out.println("Tipe A: " + A.getClass().getSimpleName());

        //f. Konversi nilai A menjadi String
        String T = A.toString();
        System.out.println("Konversi A ke String T: " + T);
        System.out.println("Tipe T: " + T.getClass().getSimpleName());
    }
} //end class coercionMain