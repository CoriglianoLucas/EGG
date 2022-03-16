/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author corig
 */
public class CafeteraServicio {
    
    Scanner scan = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        Cafetera c = new Cafetera();
        System.out.println("ingrese la apacidad maxima de la cafetera");
        c.setCapacidadMaxima(scan.nextInt());
        return c;
    }
    
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("La cafetera se lleno toda");
    }
    
    public void servirTaza(Cafetera c, int taza){
        int actual = c.getCantidadActual();
        if (taza > actual) {
            System.out.println("La taza no se lleno toda, falta: " + (taza-actual));
            if (actual==0) {
                System.out.print("(la cafetera estaba vacia)");
                System.out.println("");
            }
            c.setCantidadActual(0);
        } else {
            System.out.println("Se lleno la taza");
            c.setCantidadActual(actual - taza);
        }
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
    }
    
    public void agregarCafe(Cafetera c, int cantidad){
        int actual =c.getCantidadActual();
        c.setCantidadActual(actual+=cantidad);
        System.out.println("se le agrego a la cafetera: "+ cantidad);
    }
}
