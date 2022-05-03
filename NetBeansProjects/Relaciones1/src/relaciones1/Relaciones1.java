package relaciones1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import relaciones1.entidades.Perro;
import relaciones1.entidades.Persona;

public class Relaciones1 {

    public static void main(String[] args) {
        ArrayList<Perro> Perros = new ArrayList();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perros = crearPerro(Perros);
        mostrarPerros(Perros);
        Perros = crearPerro(Perros);
        mostrarPerros(Perros);
        persona1 = crearPersona(Perros);
        System.out.println(persona1.toString());
        persona2 = crearPersona(Perros);
        System.out.println(persona2.toString());
    }

    public static Persona crearPersona(ArrayList<Perro> Perros) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        System.out.println("ingrese el nombre de la persona");
        p.setNombre(scan.next());
        System.out.println("ingrese el apellido de la persona");
        p.setApellido(scan.next());
        System.out.println("ingrese la edad de la persona");
        p.setEdad(scan.nextInt());
        System.out.println("ingrese el DNI de la persona");
        p.setDni(scan.nextInt());
        System.out.println("Ahora elija el perro que quiere adoptar");
        Iterator<Perro> it = Perros.iterator();
        while (it.hasNext()) {
            Perro aux = it.next();
            System.out.println("[" + aux + "]");
            System.out.println("Quiere adoptar este?");
            String decision = scan.next();
            if (decision.equals("si")) {
                p.setPerro(aux);
                it.remove();
                break;
            }
        }
        return p;
    }

    public static ArrayList crearPerro(ArrayList<Perro> Perros) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Perro p = new Perro();
        System.out.println("ingrese el nombre del perro");
        p.setNombre(scan.next());
        System.out.println("ingrese la raza del perro");
        p.setRaza(scan.next());
        System.out.println("ingrese la edad del perro");
        p.setEdad(scan.nextInt());
        System.out.println("ingrese el tamaño del perro");
        p.setTamanio(scan.next());
        Perros.add(p);
        return Perros;
    }

    public static void mostrarPerros(ArrayList<Perro> Perros) {
        for (Perro Perro1 : Perros) {
            System.out.print("[" + Perro1 + "]");
        }
        System.out.println("");
    }

}
