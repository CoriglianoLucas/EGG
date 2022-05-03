package relaciones2.entidades;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public void disparo(Jugador j, Revolver r){
        boolean disparo = r.mojar(r);
        j.setMojado(disparo);
        if (!disparo) {
            r.siguienteChorro(r);
        }
        
    }
    
}
