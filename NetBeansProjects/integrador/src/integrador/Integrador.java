
package integrador;

import integrador.entidades.Persona;


public class Integrador {


    public static void main(String[] args) {
        Persona p1 = new Persona();
        String nombre = null;
        
        try{
            if(!nombre.equals(null)){
                p1.setNombre(nombre);
            }
        }
        catch(Exception e){
            System.out.println("aaaaaaaaaaa");
        }
        
    }
    
}
