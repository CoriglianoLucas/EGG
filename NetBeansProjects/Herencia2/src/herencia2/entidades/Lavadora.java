package herencia2.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Lavadora crearLavadora(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Lavadora l = new Lavadora();
        Electrodomestico e = new Electrodomestico();
        e = e.crearElectrodomestico();
        l.setColor(e.getColor());
        l.setConsumo(e.getConsumo());
        l.setPeso(e.getPeso());
        l.setPrecio(e.getPrecio());
        System.out.println("ingrese la carga de la lavadora");
        l.setCarga(scan.nextInt());
        l.precioFinal(l);
        
        return l;
    }
    
    //@Override
    public void precioFinal(Lavadora l){
        int prec = l.getPrecio();
        if(l.getCarga()>30){
            prec += 500;
        }
        l.setPrecio(prec);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
}
