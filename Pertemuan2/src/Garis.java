/*Nama File     : Garis.java
  Deskripsi     : berisi atribut dan method dalam class Garis
  Pembuat       : Annis Fakhiroh Akbar
  Tanggal       : 27 Februari 2026 */
public class Garis {
    /*******************ATRIBUT***********************/
    private Titik point1;
    private Titik point2;
    private static int counterGaris = 0;

    /********************METHOD***********************/
    //konstruktor untuk membuat garis dengan P0(0,0) dan P1(1,1)
    public Garis() {
        this.point1 = new Titik();
        this.point2 = new Titik(1,1);
        counterGaris++;
    }

    //konstruktor untuk membuat garis dengan nilai P0 dan P1 tertentu
    public Garis(Titik P0,Titik P1) {
        this.point1 = new Titik(P0.getAbsis(),P0.getOrdinat());
        this.point2 = new Titik(P1.getAbsis(),P1.getOrdinat());
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    //mengembalikan nilai P0
    public Titik getPoint1() {
        return new Titik(this.point1.getAbsis(),this.point1.getOrdinat());
    }

    //mengembalikan nilai P1
    public Titik getPoint2() {
        return new Titik(this.point2.getAbsis(),this.point2.getOrdinat());
    }

    //mengeset P0 dengan nilai baru titik x
    public void setPoint1(Titik x) {
        this.point1 = new Titik(x.getAbsis(),x.getOrdinat());
    }

    //mengeset P1 dengan nilai baru titik y
    public void setPoint2(Titik y) {
        this.point2 = new Titik(y.getAbsis(),y.getOrdinat());
    }

    //mengembalikan panjang garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(this.point1.getAbsis()-this.point2.getAbsis(), 2) + Math.pow(this.point1.getOrdinat()-this.point2.getOrdinat(), 2));
    }

    //mengembalikan gradien garis
    public double getGradien() {
        double deltaY = this.point2.getOrdinat()-this.point1.getOrdinat();
        double deltaX = this.point2.getAbsis()-this.point1.getAbsis();
        if (deltaX == 0) {
            System.out.println("Error: Division by zero."); //menandakan pembagian dengan 0, tidak terdefinisi
            return -999; 
        } else {
            return deltaY/deltaX;
        }
    }

    //mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        double xTengah = (this.point2.getAbsis()-this.point1.getAbsis())/2;
        double yTengah = (this.point2.getOrdinat()-this.point1.getOrdinat())/2;
        return new Titik(this.point1.getAbsis()+xTengah,this.point1.getOrdinat()+yTengah);
    }

    //mengecek kesejajaran dua buah garis
    public boolean isSejajar(Garis G1) {
        if (this.getGradien() == G1.getGradien()) {
            return true;
        } else {
            return false;
        }
    }

    //mengecek tegak lurus antara dua buah garis
    public boolean isTegakLurus(Garis G1) {
        if (this.getGradien()*G1.getGradien() == -1) {
            return true;
        } else {
            return false;
        }
    }

    //mencetak koordinat garis
    public void printGaris() {
        System.out.println("Garis memiliki (" + this.point1.getAbsis() + "," + this.point1.getOrdinat() + ") dan (" + this.point2.getAbsis() + "," + this.point2.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk string
    public String persGaris() {
        double m = this.getGradien();
        double c = this.point1.getOrdinat() - m*this.point1.getAbsis();
        if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        } else if (c > 0) {
            return "y = " + m + "x + " + c;
        } else {
            return "y = " + m + "x";
        }
    }
} //end class Garis