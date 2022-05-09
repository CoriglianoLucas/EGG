package herencia2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    
    protected int pulgadas;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador) {
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Televisor(int pulgadas, boolean sintonizador, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public Televisor crearTelevisor(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Televisor t = new Televisor();
        Electrodomestico e = new Electrodomestico();
        e = e.crearElectrodomestico();
        t.setColor(e.getColor());
        t.setConsumo(e.getConsumo());
        t.setPeso(e.getPeso());
        t.setPrecio(e.getPrecio());
        System.out.println("ingrese cuantas pulgadas tiene el televisor");
        t.setPulgadas(scan.nextInt());
        System.out.println("El televisor tiene sintonizador TDT si/no");
        String respuesta = scan.next();
        if(respuesta.equals("si")){
            t.setSintonizador(true);
        }else{
            t.setSintonizador(false);
        }
        t.precioFinal(t);
        return t;
    }
    
    public void precioFinal(Televisor t){
        int prec = t.getPrecio();
        if (t.getPulgadas()>40) {
            prec = prec*13/10;
        }
        if (t.isSintonizador()){
            prec += 500;
        }
        t.setPrecio(prec);
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
    
}
