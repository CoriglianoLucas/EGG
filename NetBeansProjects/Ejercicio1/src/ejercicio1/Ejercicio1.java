/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.LibroServicio;

/**
 *
 * @author corig
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro libro1 = ls.altaLibro();
        ls.mostrarLibro(libro1);
        
    }
    
}
