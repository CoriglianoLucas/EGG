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
public class Ej_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        int num1, num2, r;
        
        
        boolean confirmacion = true ;
        
        
        do {
            
            System.out.println("Ingrese el primer numero y luego el segundo");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        
            System.out.println(" MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elija opcion:");
            int opcion = leer.nextInt();

            
            switch(opcion){
            case 1:
                r = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + r);
                break;
            case 2:
                r = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + r);
                break;
            case 3:
                r = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + r);
                break;
            case 4:
                r = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + r);
                break;
            case 5:
                System.out.println("¿Esta seguro que desea salir del programa?");
                String c = leer.next();
                if (c.equals("s")) {
                    confirmacion = false;
                } else {
                    confirmacion = true;
                }
                
            }
        } while (confirmacion == true);
        
        
        
        
        
    }
    
}
