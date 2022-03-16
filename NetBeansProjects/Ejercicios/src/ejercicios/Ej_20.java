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
public class Ej_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        
        rellena(vector);
        
    }
    
    public static void rellena(int vector[]){
        for (int i = 0; i < 100; i++) {
            vector[i]=i;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }
        
    }
    
}
