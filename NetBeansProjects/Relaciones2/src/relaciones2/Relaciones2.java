package relaciones2;

import java.util.ArrayList;
import relaciones2.entidades.Juego;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.Revolver;

public class Relaciones2 {

    public static void main(String[] args) {
        Revolver r = new Revolver();
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        juego.llenarJuego(jugadores, r);
        juego.ronda(jugadores, r);
        
        
    }

}
