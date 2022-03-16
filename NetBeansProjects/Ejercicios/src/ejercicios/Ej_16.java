/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class Ej_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcta = 0, incorrecta = 0;

        do {
            System.out.println("Ingrese una cadena de 5 caracteres x...o");
            cadena = leer.next();

            System.out.println(cadena.substring(0, 1));
            System.out.println(cadena.substring(4, 5));

            if (cadena.length() == 5 && cadena.substring(0, 1).equals("x") && cadena.substring(4, 5).equals("o")) {
                correcta++;
            } else {
                incorrecta++;
            }

        } while (!cadena.equals("$$$$$"));

        System.out.println("Correctas: " + correcta + "\nIncorrectas: " + incorrecta);

        //cadena.length()!= 5 || !cadena.substring(0, 1).equals("x") || !cadena.substring(3, 4).equals("o")
    }

}
