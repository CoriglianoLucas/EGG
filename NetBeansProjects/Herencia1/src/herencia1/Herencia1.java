package herencia1;

import herencia1.entidades.Animal;
import herencia1.entidades.Caballo;
import herencia1.entidades.Gato;
import herencia1.entidades.Perro;

public class Herencia1 {

    public static void main(String[] args) {
        Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa","Croquetas",10,"Chihuhua");
        gato.Alimentarse();
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        
    }

}
