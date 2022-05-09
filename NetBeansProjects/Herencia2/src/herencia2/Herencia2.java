package herencia2;

import herencia2.entidades.Electrodomestico;

public class Herencia2 {

    public static void main(String[] args) {
        
        Electrodomestico e = new Electrodomestico();
        e = e.crearElectrodomestico();
        System.out.println(e.toString());
    }

}
