/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extra;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class EEj_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String sopa[][]= new String[20][20];
        String palabra;
        String numeros = "123456789";
        int largo, f, c, t, e;
        
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra");
                palabra = scan.next();
                largo = palabra.length();
            } while (!(largo>=3 && largo<=5));
            
            f = (int) (Math.random()*16);
            c = (int) (Math.random()*16);
            t=0;
            
                for (int j = 0; j < largo; j++) {
                    sopa[f][c]= palabra.substring(t, t+1);
                    t++;
                    c++;
                }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j]==null) {
                    e = (int)(Math.random()*9);
                    sopa[i][j]= numeros.substring(e, e+1);
                }
            }
           
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" "+sopa[i][j]+" ");    
            }
            System.out.println("");
        }
        
        
        
    }
    
}
