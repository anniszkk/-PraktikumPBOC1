/*Nama File     : Titik.java */
/*Deskripsi     : berisi atribut dan method dalam class Titik */
/*Pembuat       : Annis Fakhiroh Akbar */
/*Tanggal       : 19 Februari 2026 */

public class Titik{
   /****************ATRIBUT****************/
   double absis;
   double ordinat;

   /****************METHOD****************/
   // konstruktor untuk membuat titik (0, 0)
   Titik(){
       absis = 0;
       ordinat = 0;
   }

   // mengembalikan nilai absis
   double getAbsis(){
       return absis;
   }

   // mengembalikan nilai ordinat
   double getOrdinat(){
       return absis;
   }

   //mengeset absis titik dengan nilai baru x
   void setAbsis(double x){
       absis = x;
   }

   //mengeset ordinat titik dengan nilai baru y
   void setOrdinat(double y){
       absis = y;
   }

   // menggeser nilai absis dan oridnat titik masing-masing sejauh x dan y
   void geser(double x, double y){
       absis = absis + x;
       ordinat = ordinat + y;
   }

   // mencetak koordinat titik
   void printTitik(){
       System.out.println("Titik (" +  absis + "," + ordinat + ")");
   }

   //end class Titik
}
