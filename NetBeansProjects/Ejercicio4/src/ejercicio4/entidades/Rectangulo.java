/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    
    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();
        System.out.println("ingrese la base del rectangulo");
        rec.setBase(scan.nextInt());
        System.out.println("ingrese la altura del rectangulo");
        rec.setAltura(scan.nextInt());
        
        return rec;
    }
    
    public void calcularArea(Rectangulo rec) {
        int area = rec.getAltura() * rec.getBase();
        System.out.println("El area es: " + area);
    }
    
    public void calcularPerimetro(Rectangulo rec) {
        int perimetro = (rec.getBase() + rec.getAltura()) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }
    
    public void mostrarRectangulo(Rectangulo rec) {
        for (int i = 0; i < rec.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < rec.getAltura() - 2; i++) {
            for (int k = 0; k < 2; k++) {
                System.out.print("*");
                for (int j = 0; j < rec.getBase() - 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < rec.getBase(); i++) {
            System.out.print("*");
        }
        
    }
    
}
