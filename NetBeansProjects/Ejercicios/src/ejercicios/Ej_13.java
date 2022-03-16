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
public class Ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite, contador = 0;
        
        do {
            System.out.println("Ingrese el valor limite");
            limite = leer.nextInt();
        } while (limite <= 0);
        
        do {            
            System.out.println("Ingrese valores hasta llegar al limite");
            contador += leer.nextInt();
        } while (contador<limite);
        
        System.out.println(contador + " supero el limite de " + limite);
    }
    
}
