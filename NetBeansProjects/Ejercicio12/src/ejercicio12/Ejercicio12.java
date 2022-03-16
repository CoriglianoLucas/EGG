package ejercicio12;

import ejercicio12.control.PersonaControl;
import ejercicio12.entidades.Persona;

public class Ejercicio12 {

    public static void main(String[] args) {
        PersonaControl pc = new PersonaControl();
        Persona p = pc.crearPersona();
        pc.calcularEdad(p);
        pc.menorQue(p, 2006);
        System.out.println(p.toString());

    }

}
