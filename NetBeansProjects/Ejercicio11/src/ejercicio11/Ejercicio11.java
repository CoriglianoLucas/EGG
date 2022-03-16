package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();
        System.out.println("Ingrese el anio");
        int anio = scan.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();

        int diaActual = fechaActual.getDate();
        int mesActual = fechaActual.getMonth() + 1;
        int anioActual = fechaActual.getYear() + 1900;

        int diferencia = anioActual - anio;

        if (diferencia != 0) {
            if (mesActual <= mes) {
                diferencia--;
            }
        } else {
            diferencia--;
        }
        
        System.out.println("Hay "+diferencia+" anios de diferencias");

    }

}
