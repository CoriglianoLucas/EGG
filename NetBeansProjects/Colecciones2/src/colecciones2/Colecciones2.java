package colecciones2;

import colecciones2.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        Alumno s = new Alumno();
        int[] notas = new int[3];
        ArrayList<Alumno> alumnos = new ArrayList();
        while (!salir) {
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scan.next();
            a.setNombre(nombre);
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese una nota");
                int nota = scan.nextInt();
                notas[i] = nota;
            }
            a.setNotas(notas);
            alumnos.add(a);

            System.out.println("quiere agregar a otro alumno? si/no");
            String decision = scan.next();
            if (decision.equals("si")) {
                salir = false;
            } else if (decision.equals("no")) {
                salir = true;
            }

        }
        System.out.println(alumnos);
        int resultado = s.notaFinal(alumnos);
        System.out.println(resultado);
    }

}
