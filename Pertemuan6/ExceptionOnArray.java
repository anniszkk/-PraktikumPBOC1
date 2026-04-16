/*Nama File     : ExceptionOnArray.java
  Deskripsi     : Program penggunaan eksepsi menggunakan class library Java
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 16 April 2026 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        System.out.println("------------TEST UNTUK EXCEPTION------------");
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code ...");
        }
    }
}