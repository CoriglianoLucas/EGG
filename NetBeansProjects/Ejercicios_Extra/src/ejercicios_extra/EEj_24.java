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
public class EEj_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese un numero de fibonacci");
        n = scan.nextInt();
        
        calculafibonacci(n);
        
        
    }
    
    public static void calculafibonacci(int n){
        int cant=0, r=0, ra=1;
        
        
        
        while (r!=n && ra!=n) {     
            r += ra;
            System.out.println(r);
            cant++;
            if (r==n) {
                break;
            }
            
            ra += r;
            System.out.println(ra);
            cant++;
            if (ra==n) {
                break;
            }
            
            
        }
        cant++;
        
        int vector[] = new int[cant];
        
        System.out.println("cant: "+(cant));
        
        r=0;
        ra=1;
        vector[0]=1;
        for (int i = 1; i < cant; i++) {
            r += ra;
            vector[i]=r;
            if (r==n) {
                break;
            }
            i++;
            ra += r;
            vector[i]=ra;
            if (ra==n) {
                break;
            }
        }
        
        for (int i = 0; i < cant; i++) {
            System.out.print(" "+vector[i]+" ");
        }
        
        
    }
    
   
}
