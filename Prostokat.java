package WSIZ.KLASY;

import static java.lang.Math.sqrt;

public class Prostokat {
    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int a;
    int b;
    public double pole(){

        double pole;
pole = a*b;
        System.out.println("Pole prostokota wynosi : " + pole);
        return pole;
    }
    public double obj(){
        double obj;
        obj=2*(a+b);
        System.out.println("Objętość wynosi: "+obj);
        return  obj;
    }
    public double przk(){
        double przk;
        przk=sqrt((a^2)+(b^2));
        System.out.println("Dlugosc przekatnej to : "+przk);
        return przk;
    }
}
