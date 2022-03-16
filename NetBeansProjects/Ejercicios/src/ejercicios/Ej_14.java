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
public class Ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, acu = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                acu += num;
            }
            
        }
        System.out.println("La suma total es: " + acu);
        
    }
    
}
