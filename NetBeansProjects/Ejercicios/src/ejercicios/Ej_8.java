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
public class Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la frase");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("la frase es correcta");
        } else {
            System.out.println("la frase es incorrecta");
        }
    }
    
}
