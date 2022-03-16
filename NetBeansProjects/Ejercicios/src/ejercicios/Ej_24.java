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
public class Ej_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, cont=0;
        
        System.out.println("ingrese el tamaño de la matriz");
        n = scan.nextInt();
        
        int matriz[][] = new int[n][n];
        int matriz2[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese un numero para la matriz");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[j][i] = -matriz[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz2[i][j] == matriz[i][j]) {
                        cont++;
                } else {
                        System.out.println("Esta matriz no es antisimetrica");
                        break;
                }
            }
        }
        
        if (cont==n*n) {
            System.out.println("Esta matriz es antisimetrica");
        }
        
    
    }
    
}
