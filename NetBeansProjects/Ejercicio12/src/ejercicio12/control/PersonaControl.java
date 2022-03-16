/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.control;

import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author corig
 */
public class PersonaControl {

    Scanner scan = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(scan.nextLine());
        System.out.println("Ingrese el anio de nacimiento");
        int anio = scan.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = scan.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = scan.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p.setNacimiento(fecha);
        return p;
    }

    public void calcularEdad(Persona p) {
        Date fechaActual = new Date();

        int mesActual = fechaActual.getMonth() + 1;
        int anioActual = fechaActual.getYear() + 1900;
        Date fecha = p.getNacimiento();
        int mes = fecha.getMonth() + 1;
        int anio = fecha.getYear() + 1900;

        int diferencia = anioActual - anio;

        if (diferencia != 0) {
            if (mesActual <= mes) {
                diferencia--;
            }
        } else {
            diferencia--;
        }

        System.out.println("Tiene " + diferencia + " anios");
    }
    
    public void menorQue(Persona p, int anio){
        Date fecha = p.getNacimiento();
        int anioNacimiento = fecha.getYear() + 1900;
        boolean menor;
        
        if(anioNacimiento>anio){
            menor = true;
            System.out.println("Es Menor: "+menor);
        }else if(anioNacimiento<anio){
            menor = false;
            System.out.println("Es Menor: "+menor);
        }else{
            System.out.println("Tienen la misma edad");
        }
    }

}
