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
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero y luego el segundo");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);    
        } else if (num1 < num2){
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los numeros son iguales");
        }
        
    }
    
}
