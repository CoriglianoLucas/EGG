package colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        boolean countRemove = false;
        boolean salir = false;
        while (!salir) {
            System.out.println("ingrese una raza de perro");
            String r = scan.next();
            razas.add(r);
            System.out.println("Quiere agregar otra raza?? si / no");
            String decision = scan.next();
            if (decision.equals("si")) {
                salir = false;
            } else if (decision.equals("no")) {
                salir = true;
            }
        }
        for (String raza : razas) {
            System.out.print("[" + raza + "]");
        }
        System.out.println("");

        System.out.println("ingrese una raza a eliminar");
        String raza = scan.next();

        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(raza)) {
                it.remove();
                countRemove = true;
            }
        }
        if (!countRemove) {
            System.out.println("No se encontro esa raza");
        }
        Collections.sort(razas);
        System.out.println(razas);
    }

}
