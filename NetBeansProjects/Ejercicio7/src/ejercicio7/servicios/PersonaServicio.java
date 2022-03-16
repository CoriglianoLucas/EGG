/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author corig
 */
public class PersonaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese el nombre");
        p.setNombre(scan.next());
        System.out.println("ingrese la edad");
        p.setEdad(scan.nextInt());
        do {            
            System.out.println("Ingrese el sexo (h,m,o)");
        p.setSexo(scan.next());
        } while (!(p.getSexo().equals("h")||p.getSexo().equals("m")||p.getSexo().equals("o")));
        System.out.println("Ingrese el peso");
        p.setPeso(scan.nextInt());
        System.out.println("Ingrese la altura");
        p.setAltura(scan.nextDouble());
        return p;
    }

    public int calcularIMC(Persona p) {
        int resultado;
        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean mayor;
        mayor = p.getEdad() >= 18;
        return mayor;
    }

}
