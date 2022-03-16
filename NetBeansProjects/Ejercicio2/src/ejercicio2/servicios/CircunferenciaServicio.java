package ejercicio2.servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner scan = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(scan.nextDouble());
        return c1;
    }

    public void aera(Circunferencia c1) {
        Double area = Math.PI * c1.getRadio() * c1.getRadio();
        System.out.println("El area de la circunferencia es: " + area);
    }

    public void perimetro(Circunferencia c1) {
        Double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }

}
