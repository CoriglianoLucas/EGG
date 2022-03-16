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
public class Ej_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, und=0, dosd=0, tresd=0, cuatrod=0, cincod=0;
        System.out.println("ingrese el tamaño del vector");
        n = scan.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=(int) (Math.random()*100000);
        }
        
        for (int i = 0; i < n; i++) {
            
            if (vector[i]<=9) {
                und++;
            } else if (vector[i]<=99){
                dosd++;
            }else if (vector[i]<=999){
                tresd++;
            }else if (vector[i]<=9999){
                cuatrod++;
            }else if (vector[i]<=99999){
                cincod++;
            }
                 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(" "+vector[i]+" ");
        }
        
        System.out.println("");
        
        System.out.println("La cantidad de numero de un digito son: " + und);
        System.out.println("La cantidad de numero de dos digito son: " + dosd);
        System.out.println("La cantidad de numero de tres digito son: " + tresd);
        System.out.println("La cantidad de numero de cuatro digito son: " + cuatrod);
        System.out.println("La cantidad de numero de cinco digito son: " + cincod);
    }
    
}
