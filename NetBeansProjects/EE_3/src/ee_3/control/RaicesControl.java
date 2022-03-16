package ee_3.control;

import ee_3.entidades.Raices;
import java.util.Scanner;

public class RaicesControl {

    Scanner scan = new Scanner(System.in);

    public Raices crearEcuacion() {
        System.out.println("Ingrese el valor de a");
        int a = scan.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = scan.nextInt();
        System.out.println("Ingrese el valor de c");
        int c = scan.nextInt();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r) {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        double disc = (b * b) - 4 * a * c;
        System.out.println("El discriminante es (b^2)-4*a*c = " + disc);
        return disc;
    }

    public boolean tieneRaices(Raices r) {
        RaicesControl rc = new RaicesControl();
        double disc = rc.getDiscriminante(r);
        boolean raices;
        if (disc >= 0) {
            raices = true;
        } else {
            raices = false;
        }
        System.out.println("Tiene raices: " + raices);
        return raices;
    }

    public boolean tieneRaiz(Raices r) {
        RaicesControl rc = new RaicesControl();
        double disc = rc.getDiscriminante(r);
        boolean raices;
        if (disc == 0) {
            raices = true;
        } else {
            raices = false;
        }
        System.out.println("Tiene una sola raiz: " + raices);
        return raices;
    }

    public void obtenerRaices(Raices r) {
        RaicesControl rc = new RaicesControl();
        boolean raices = rc.tieneRaices(r);
        if (raices) {
            double a = r.getA();
            double b = r.getB();
            double c = r.getC();
            double x1 = ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
            double x2 = ((-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else {
            System.out.println("La ecuacion no tiene dos raices");
        }
    }

    public void obtenerRaiz(Raices r) {
        RaicesControl rc = new RaicesControl();
        boolean raices = rc.tieneRaiz(r);
        if (raices) {
            double a = r.getA();
            double b = r.getB();
            double c = r.getC();
            double x1 = ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
            System.out.println("x = " + x1);
        } else {
            System.out.println("La ecuacion no tiene una sola raiz");
        }
    }

    public void metodoCalcular(Raices r) {
        RaicesControl rc = new RaicesControl();
        rc.obtenerRaices(r);
        rc.obtenerRaiz(r);

    }

}
