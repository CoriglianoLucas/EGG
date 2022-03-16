/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicios.CafeteraServicio;

/**
 *
 * @author corig
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = cs.crearCafetera();
        cs.agregarCafe(c1, 100);
        cs.servirTaza(c1, 200);
        cs.llenarCafetera(c1);
        cs.servirTaza(c1, 200);
        cs.vaciarCafetera(c1);
        cs.servirTaza(c1, 200);
        cs.llenarCafetera(c1);
        cs.servirTaza(c1, 200);
        cs.servirTaza(c1, 200);
        cs.servirTaza(c1, 200);
        cs.servirTaza(c1, 200);
    }
    
}
