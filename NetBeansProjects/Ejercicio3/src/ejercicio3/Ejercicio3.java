package ejercicio3;

import ejercicio3.entidades.Operacion;
import ejercicio3.servicios.OperacionServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op = os.crearOperacion();
        System.out.println("La suma es: ");
        Double suma = os.sumar(op);
        System.out.println(suma);

        System.out.println("La resta es: ");
        Double resta = os.restar(op);
        System.out.println(resta);

        System.out.println("La multiplicacion es: ");
        Double multiplicacion = os.multiplicar(op);
        System.out.println(multiplicacion);

        System.out.println("La division es: ");
        Double division = os.dividir(op);
        System.out.println(division);

    }

}
