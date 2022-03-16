package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner scan = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion op = new Operacion();
        System.out.println("ingrese el primer numero");
        op.setNumero1(scan.nextDouble());
        System.out.println("ingrese el primer numero");
        op.setNumero2(scan.nextDouble());

        return op;
    }

    public Double sumar(Operacion op) {
        Double suma = op.getNumero1() + op.getNumero2();
        return suma;
    }

    public Double restar(Operacion op) {
        Double resta = op.getNumero1() - op.getNumero2();
        return resta;
    }

    public Double multiplicar(Operacion op) {
        Double multi;
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            multi = 0.0;
            System.out.println("Error");
        } else {
            multi = op.getNumero1() * op.getNumero2();
        }

        return multi;
    }

    public Double dividir(Operacion op) {
        Double divicion;
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            divicion = 0.0;
            System.out.println("Error");
        } else {
            divicion = op.getNumero1() / op.getNumero2();
        }

        return divicion;
    }
}
