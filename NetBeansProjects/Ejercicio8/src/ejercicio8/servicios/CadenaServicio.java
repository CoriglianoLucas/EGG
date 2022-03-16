package ejercicio8.servicios;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        Cadena cadena = new Cadena();
        System.out.println("Ingrese la frase");
        String frase = scan.next();
        cadena.setFrase(frase);
        cadena.setLongitud(frase.length());
        return cadena;
    }
    
    public void mostrarVocales(Cadena cadena){
        String frase = cadena.getFrase();
        int contador=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = frase.substring(i, i+1);
            if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
                contador++;
                System.out.println("Vocal: "+letra);
            }
            
        }
        System.out.println("La cantidad de vocales es: "+contador);
    }

    public Cadena invertirFrase(Cadena cadena) {
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase();
        char[] ch = frase.toCharArray();
        int i = 0;
        int end = ch.length - 1;
        char temp;
        while (end > i) {
            temp = ch[i];
            ch[i] = ch[end];
            ch[end] = temp;
            end--;
            i++;
        }
        frase = new String(ch);
        System.out.println("La frase invertida es: "+frase);
        cadena.setFrase(frase);
        return cadena;
    }

    public void vecesRepetido(Cadena cadena) {
        System.out.println("ingrese una letra");
        String letra = scan.next();
        char[] letrax = letra.toCharArray();
        char[] ch = cadena.getFrase().toCharArray();
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letrax[0] == ch[i]) {
                contador++;
            }
        }
        System.out.println("El caracter ´" + letra + "´ se repite " + contador + " veces");
    }
    
    public void compararLongitud(Cadena cadena, String frase){
        int longitud1 = cadena.getLongitud();
        int longitud2 = frase.length();
        if (longitud1==longitud2) {
            System.out.println("Las frases tienen la misma longitud");
        } else if(longitud1>longitud2){
            System.out.println("La frase -"+cadena.getFrase()+"- es mas larga");
        }else{
            System.out.println("La frase -"+frase+"- es mas larga");
        }
    }
    
    public Cadena unirFrase(Cadena cadena, String frase){
        String frase1 = cadena.getFrase();
        String frase2 = frase;
        String frase3 = frase1.concat(frase2);
        System.out.println("La nueva frase es: "+frase3);
        cadena.setFrase(frase3);
        return cadena;
    }
    
    public void reemplazar(Cadena cadena) {
        System.out.println("ingrese una letra para remplzar la a");
        String letra = scan.next();
        String letraaa = "a";
        char[] a = letraaa.toCharArray();
        char[] letrax = letra.toCharArray();
        char[] ch = cadena.getFrase().toCharArray();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (a[0] == ch[i]) {
                ch[i]=letrax[0];
            }
        }
        String frase = new String(ch);
        System.out.println("La frase resultante es: "+frase);
    }
    
    public boolean contiene(Cadena cadena){
        boolean contiene=false;
        System.out.println("ingrese una letra para saber si esta en la frase");
        String letra = scan.next();
        char[] letra1 = letra.toCharArray();
        char[] frase = cadena.getFrase().toCharArray();
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i+1).equals(letra)) {
                contiene=true;
            }
        }
        
        return contiene;
    }

}
