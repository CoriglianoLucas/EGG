package relaciones2.entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver(Revolver r) {
        int random = (int) (Math.random() * 6) + 1;
        r.setPosicionActual(random);
        System.out.println("el tambor del revolver esta en la posicion: " + random);
        random = (int) (Math.random() * 6) + 1;
        System.out.println("el agua esta en la posicion: " + random);
        r.setPosicionAgua(random);
    }

    public boolean mojar(Revolver r) {
        boolean disparo;
        if (r.getPosicionActual() == r.getPosicionAgua()) {
            disparo = true;
            System.out.println("Disparo acertado");
        } else {
            System.out.println("Disparo fallido");
            disparo = false;
        }
        return disparo;
    }
    
    public void siguienteChorro(Revolver r){
        int actual = r.getPosicionActual();
        actual ++;
        if (actual==7) {
            actual = 1;
        }
        System.out.println("el tambor del revolver esta en la posicion: " + actual);
        r.setPosicionActual(actual);
    }
    
    

}
