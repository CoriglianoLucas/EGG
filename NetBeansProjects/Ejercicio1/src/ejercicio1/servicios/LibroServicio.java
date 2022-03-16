/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.servicios;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author corig
 */
public class LibroServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Libro altaLibro() {
        Libro lib = new Libro();
        System.out.println("ingrese el codigo ISBN del libro");
        lib.setIsbn(scan.nextInt());
        System.out.println("ingrese el titulo del libro");
        lib.setTitulo(scan.next());
        System.out.println("ingrese el autor del libro");
        lib.setAutor(scan.next());
        System.out.println("ingrese el numero de paginas del libro");
        lib.setNumPaginas(scan.nextInt());

        return lib;

    }

    public void mostrarLibro(Libro libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Numero de paginas: " + libro.getNumPaginas());
        System.out.println("ISBN: " + libro.getIsbn());
    }

}
