/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.entiddades;

/**
 *
 * @author corig
 */
public class Arrays {

    private double a[] = new double[50];
    private double b[] = new double[20];

    public Arrays() {
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Arrays{" + "a=" + a + ", b=" + b + '}';
    }

    public void crearArrays(Arrays clase) {
        double[] aa = new double[clase.getA().length];
        double[] bb = new double[clase.getB().length];
        double aux;
        for (int i = 0; i < clase.getA().length; i++) {
            aa[i] = Math.random() * 10;
        }
        clase.setA(aa);
        System.out.println(clase.toString());
        for (int i = 0; i < clase.getA().length; i++) {
            System.out.print("[" + aa[i] + "]");
        }
        System.out.println("");

        for (int i = 0; i < clase.getA().length; i++) {
            for (int j = 0; j < clase.getA().length - 1; j++) {
                if (aa[j] > aa[j + 1]) {
                    aux = aa[j + 1];
                    aa[j + 1] = aa[j];
                    aa[j] = aux;
                }
            }
        }
        clase.setA(aa);
        for (int i = 0; i < 10; i++) {
            bb[i] = aa[i];
        }
        for (int i = 10; i < 20; i++) {
            bb[i] = 0.5;
        }
        clase.setB(bb);
        for (int i = 0; i < clase.getA().length; i++) {
            System.out.print("[" + aa[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < clase.getB().length; i++) {
            System.out.print("[" + bb[i] + "]");
        }
        System.out.println("");
    }
}
