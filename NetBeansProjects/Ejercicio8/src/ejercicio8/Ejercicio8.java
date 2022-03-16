package ejercicio8;

import ejercicio8.servicios.CadenaServicio;
import ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearFrase();
        cs.mostrarVocales(c1);
        cs.vecesRepetido(c1);
        cs.reemplazar(c1);
        boolean cont = cs.contiene(c1);
        System.out.println(cont);
        System.out.println("Ingrese una frase");
        String frase = scan.next();
        cs.compararLongitud(c1, frase);
        cs.unirFrase(c1, frase);
        cs.invertirFrase(c1);
   
        

    }

}
