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
public class Ej_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipomotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor");
        tipomotor = leer.nextInt();
        
        /*
        while (tipomotor<1 || tipomotor>4 ) {            
            System.out.println("Ingrese el tipo de motor (1 a 4)");
        tipomotor = leer.nextInt();
        }
        */
        
        
        switch(tipomotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
    }
    
}
