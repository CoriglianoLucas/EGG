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
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tempc;
        int tempf;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Centigrados");
        tempc = leer.nextInt();
        tempf = 32 + (9*tempc/5);
        System.out.println("La temperatura en grados Fahrenheit es: " + tempf);
                
                
    }
    
}
