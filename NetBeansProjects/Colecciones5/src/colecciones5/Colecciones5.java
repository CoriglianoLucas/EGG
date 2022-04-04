package colecciones5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String pais;
        HashSet<String> paises = new HashSet();
        boolean salir = false;
        while (!salir) {
            System.out.println("ingrese un pais");
            pais = scan.next();
            paises.add(pais);
            System.out.println("quiere agregar a otro pais? si/no");
            String decision = scan.next();
            if (decision.equals("si")) {
                salir = false;
            } else if (decision.equals("no")) {
                salir = true;
            }
        }
        mostrarPais(paises);
        mostrarPaisOrdenado(paises);
        eliminarPais(paises);
    }

    public static void mostrarPais(HashSet<String> paises) {
        System.out.println("Los paises son: ");
        for (String pais : paises) {
            System.out.print("[" + pais + "]");
        }
        System.out.println("");
    }

    public static void mostrarPaisOrdenado(HashSet<String> paises) {
        System.out.println("Los paises ordenados afabeticamente son: ");
        ArrayList<String> paisLista = new ArrayList(paises);
        Collections.sort(paisLista);
        for (String pais : paisLista) {
            System.out.print("[" + pais + "]");
        }
        System.out.println("");
    }

    public static void eliminarPais(HashSet<String> paises) {
        boolean find = false;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el pais que quiere eliminar");
        String pais = scan.next();
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                find = true;
            }
        }
        if (find) {
            System.out.println("el pais: "+pais+" se elimino correctamente");
        } else {
            System.out.println("el pais: "+pais+" no se encontro en la coleccion");
        }
        mostrarPais(paises);
    }

}
