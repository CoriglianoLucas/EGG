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
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();
        
        String primeraletra = frase.substring(0,1);
        
        System.out.println(primeraletra);
        
        if (frase.substring(0,1).equals("a")) { //frase.startsWith("a") o frase.substring(0,1).equals("a")
            System.out.println("Correcto");  
        } else {
            System.out.println("Incorrecto");
        }
        
        
        
        
    }
    
}
