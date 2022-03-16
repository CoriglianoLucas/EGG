package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {
        System.out.println("introducir nombre");
        String nombre = scan.next();

        System.out.println("introducir apodo");
        String apodo = scan.next();

        System.out.println("introducir tipo");
        String tipo = scan.next();

        return new Mascota(nombre, apodo, tipo);

    }

}
