/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class Drk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int e = 0;
        boolean[] v2 = new boolean[6];
        int[] v1 = new int[6];
        
        for (int i = 0; i < 6; i++) {
           // v1[i] = (int)(Math.random()*100);
            System.out.println("Ingresa un valor");
           v1[i] = scan.nextInt();
        }
        
        for (int i = 0; i < 6; i++) {
            //System.out.println("[" + v1[i] + "]");
            System.out.print(" " + v1[i] + " ");
            
        }
  
        for (int i = 0; i < 6; i++) {
            
            if (v2[v1[i]-1] == false) {
                v2[v1[i]-1] = true;
            } else {
                e = i;
                break;
                
            }
        }
        System.out.println("El primer numero repetido es: " + v1[e]);

    }
    
}
