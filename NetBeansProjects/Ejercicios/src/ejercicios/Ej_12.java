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
public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        
        do {            
            System.out.println("Ingrese una nota del 1 al 10");
            nota = leer.nextInt();
        } while (nota<1 || nota>10);
        
        
        
        
        
    }
    
}
