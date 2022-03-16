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
public class Ej_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, nb, cont=0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=(int) (Math.random()*10);
        }
        
        System.out.println("Ingrese el numero a buscar");
        nb = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            if (vector[i]==nb) {
                System.out.println("El numero se encuetra en la posicion: " +i);
                cont++;
            }
        }
        
        if (cont==0) {
            System.out.println("El numero "+nb+" no se encontro");
        } else {
            System.out.println("El numero "+nb+" se encotro "+cont+" veces");
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
    
}
