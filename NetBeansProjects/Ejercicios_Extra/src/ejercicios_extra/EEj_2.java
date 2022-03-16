/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extra;

/**
 *
 * @author corig
 */
public class EEj_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1, b=2, c=3, d=4, aux;
        
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
        
    }
    
}
