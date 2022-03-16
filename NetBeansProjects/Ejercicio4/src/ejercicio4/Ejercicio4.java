/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Rectangulo;

/**
 *
 * @author corig
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec = new Rectangulo();
        rec = rec.crearRectangulo();
        rec.calcularArea(rec);
        rec.calcularPerimetro(rec);
        rec.mostrarRectangulo(rec);
    }

}
