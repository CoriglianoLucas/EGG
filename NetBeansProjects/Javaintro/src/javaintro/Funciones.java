/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author corig
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = suma(150, 200);
        
        saludo("Lucas Martin");
    }
    
    public static int suma(int a, int b){
        int result = a + b;
    return result;
    }
    
    public static void saludo(String nombre){
        System.out.println("Hola " + nombre + ", como estas?");
    }
    
    
}
