package relaciones2.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int n;
        do {
            System.out.println("Ingrese la cantidad de jugadores (hasta 6)");
            n = scan.nextInt();
        } while (n > 6);

        for (int i = 1; i <= n; i++) {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre del jugador");
            j.setId(i);
            j.setNombre(scan.next() + " " + i);
            jugadores.add(j);
        }
        return jugadores;
    }

    public void ronda(ArrayList<Jugador> jugadores, Revolver r) {
        r.llenarRevolver(r);
        boolean mojado = false;
        while (!mojado) {
            for (Jugador jugador : jugadores) {
                jugador.disparo(jugador, r);
                if (jugador.isMojado()) {
                    System.out.println("El jugador " + jugador.getNombre() + " fue mojado");
                    mojado = true;
                    break;
                }
            }
        }
    }
}
