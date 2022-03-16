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
public class Ej_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int d1=0, d2=0, f0=0, f1=0, f2=0, c0=0, c1=0, c2=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {                    
                    System.out.println("ingrese los valores del 1 al 9");
                    matriz[i][j]=scan.nextInt();
                } while (!(matriz[i][j]>=1 && matriz[i][j]<=9));
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Suma diagonales
                if (i==j) {
                    d1 += matriz[i][j];
                }
                if (i+j == 2) {
                    d2 += matriz[i][j];
                }
                //Suma filas
                if (i==0) {
                    f0 += matriz[i][j];
                }
                if (i==1) {
                    f1 += matriz[i][j];
                }
                if (i==2) {
                    f2 += matriz[i][j];
                }
                //Suma columnas
                if (j==0) {
                    c0 += matriz[i][j];
                }
                if (j==1) {
                    c1 += matriz[i][j];
                }
                if (j==2) {
                    c2 += matriz[i][j];
                }
            }           
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
            
            if (d1==d2 && d1==f0 && d1==f1 && d1==f2 && d1==c0 && d1==c1 && d1==c2) {
                System.out.println("Es magica");
            } else {
                System.out.println("No es magica");
            }
    
    }
    
}
