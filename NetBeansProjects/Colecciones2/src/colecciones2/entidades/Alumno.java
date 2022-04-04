package colecciones2.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    Scanner scan = new Scanner(System.in);
    private String nombre;
    private int[] notas = new int[3];

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }


    public int notaFinal(ArrayList<Alumno>alumnos){
        System.out.println("ingrese un nombre de alumno para calcular la nota final");
        String nombreAux = scan.next();
        int resultado=0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreAux)) {
                resultado = calculaNotaFinal(alumno);
            }
        }
        return resultado;
    }
    
    public int calculaNotaFinal(Alumno a) {
        int[] notas2 = a.getNotas();
        int resultado;
        int suma = 0;
        for (Integer nota : notas2) {
            suma += nota;
        }
        resultado = suma / 3;

        return resultado;
    }

}
