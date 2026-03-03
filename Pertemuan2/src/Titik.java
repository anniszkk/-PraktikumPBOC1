/*Nama File     : Titik.java
  Deskripsi     : berisi atribut dan method dalam class Titik
  Pembuat       : Annis Fakhiroh Akbar
  Tanggal       : 26 Februari 2026 */

public class Titik {
    /*******************ATRIBUT***********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /********************METHOD***********************/
    //konstruktor untuk membuat titik (0,0)
    // Titik() {
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
        counterTitik++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }

    //menentukan nilai kuadran dari tiitk
  public int getKuadran() {
    if (this.absis > 0 && this.ordinat > 0) {
      return 1;
    }
    else if (this.absis < 0 && this.ordinat > 0) {
      return 2;
    }
    else if (this.absis < 0 && this.ordinat < 0) {
      return 3;
    }
    else if (this.absis > 0 && this.ordinat < 0) {
      return 4;
    } else {
        return 0; // //jika titik adalah (0,0)
    }
  } 

  //mengembalikan jarak titik dari pusat (0,0)
  public double getJarakPusat() {
    return Math.sqrt(this.absis*this.absis + this.ordinat*this.ordinat);
  } 

  //mengembalikan jarak antara dua titik
  public double getJarak(Titik T) {
    return Math.sqrt(Math.pow(this.absis - T.getAbsis(),2) + Math.pow(this.ordinat - T.getOrdinat(),2));
  }

  //merefleksikan titik
  public void refleksiX() {
    this.ordinat = this.ordinat*-1;
  } 

  //merefleksikan titik terhadap sumbu Y
  public void refleksiY() {
    this.absis = this.absis*-1;
  }

  //mengembalikan titik baru yang sudah direfleksikan dengan sumbu X
  public Titik getRefleksiX() {
    Titik Z = new Titik(this.absis,this.ordinat*-1);
    return Z;
  }

  //mengembalikan titik baru yang sudah direfleksikan dengan sumbu Y
  public Titik getRefleksiY() {
    Titik Z = new Titik(this.absis*-1,this.ordinat);
    return Z;
  } 
} //end class Titik
