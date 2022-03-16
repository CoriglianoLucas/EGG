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
public class Ej_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros que quiere convertir");
        euros = leer.nextFloat();
        System.out.println("Ingrese a que moneda quiere convertir (libras, $, yenes)");
        moneda = leer.next();
        
        conversor(euros,moneda);
    }
    
    public static void conversor(float euros, String moneda){
    float resultado, cambio;
    
    switch(moneda){
        //case moneda.equals("libras"):
        case "libras":
            resultado = (float) (euros * 0.86);
            System.out.println(euros + " € = "+ resultado +" libras");
            break;
        case "$":
            resultado = (float) (euros * 1.28611);
            System.out.println(euros + " € = "+ resultado +" $");
            break;
        case "yenes":
            resultado = (float) (euros * 129.852);
            System.out.println(euros + " € = "+ resultado +" yenes");
            break;
        default:
            System.out.println("Ingrese una moneda valida(libras, $, yenes)");
            break;
    
    }
   
    
    
    }
    
    
}
