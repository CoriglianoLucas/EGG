package herencia2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e') {
            letra = 'f';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        if (!color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")) {
            color = "blanco";
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = new Electrodomestico();
        e.setPrecio(1000);
        System.out.println("ingrese el color del electrodomestico");
        e.setColor(comprobarColor(scan.next()));
        System.out.println("ingrese el consumo del electrodomestico");
        e.setConsumo(comprobarConsumoEnergetico(scan.next().charAt(0)));
        System.out.println("ingrese el peso del electrodomestico");
        e.setPeso(scan.nextInt());
        precioFinal(e);
        return e;
    }

    public void precioFinal(Electrodomestico e) {
        int prec = e.getPrecio();
        char letra = e.getConsumo();
        int p = e.getPeso();
        switch (letra) {
            case 'a':
                prec += 1000;
            case 'b':
                prec += 800;
            case 'c':
                prec += 600;
            case 'd':
                prec += 500;
            case 'e':
                prec += 300;
            case 'f':
                prec += 100;
        }
        if (p >= 1 && p <= 19) {
            prec += 100;
        } else if (p >= 20 && p <= 49) {
            prec += 500;
        } else if (p >= 50 && p <= 79) {
            prec += 800;
        } else if (p >= 80) {
            prec += 1000;
        }
        e.setPrecio(prec);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
    
}
