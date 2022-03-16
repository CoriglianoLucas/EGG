/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaServicio;

/**
 *
 * @author corig
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] mayor = new boolean[4];
        int[] imc = new int[4];
        int debajo = 0, ideal = 0, sobrepeso = 0, mayores = 0, menores = 0;
        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();
        imc[0] = ps.calcularIMC(p1);
        mayor[0] = ps.esMayorDeEdad(p1);

        Persona p2 = ps.crearPersona();
        imc[1] = ps.calcularIMC(p2);
        mayor[1] = ps.esMayorDeEdad(p2);

        Persona p3 = ps.crearPersona();
        imc[2] = ps.calcularIMC(p3);
        mayor[2] = ps.esMayorDeEdad(p3);

        Persona p4 = ps.crearPersona();
        imc[3] = ps.calcularIMC(p4);
        mayor[3] = ps.esMayorDeEdad(p4);

        for (int i = 0; i < 4; i++) {
            if (imc[i] < 0) {
                debajo++;
            } else if (imc[i] == 0) {
                ideal++;
            } else {
                sobrepeso++;
            }
        }

        System.out.println("Personas con bajo peso: " + (debajo * 100 / 4) + "%");
        System.out.println("Personas con peso ideal: " + (ideal * 100 / 4) + "%");
        System.out.println("Personas con sobrepeso: " + (sobrepeso * 100 / 4) + "%");

        for (int i = 0; i < 4; i++) {
            if (mayor[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Personas mayores: " + (mayores * 100 / 4) + "%");
        System.out.println("Personas menores: " + (menores * 100 / 4) + "%");

    }

}
