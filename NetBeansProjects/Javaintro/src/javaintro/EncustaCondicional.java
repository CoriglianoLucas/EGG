/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class EncustaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula del 1 al 5");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            
            switch(opinion){
            
            case 1:
            case 2: 
                    System.out.println("La peli es mala");
                    break;
            case 3: 
                    System.out.println("La peli es buena");
                    break;
            case 4:
                    System.out.println("La peli es muy buena");
                    break;
            case 5:
                    System.out.println("La peli es escelente");
                    break;
            }
            
        } else if(opinion<0) {
            System.out.println("la peli no te gusto nada");
        } else if(opinion==0){
            System.out.println("cero la peli no te gusto");
        } else{
            System.out.println("wow la peli te gusto demasiado");
        }
    }
    
}
