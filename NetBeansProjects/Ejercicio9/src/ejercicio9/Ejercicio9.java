package ejercicio9;

import ejercicio9.entidades.Matematica;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        double num1 = Math.random() * 100;
        System.out.println("El primer numero es: " + num1);
        m.setNumero1(num1);
        double num2 = Math.random() * 100;
        System.out.println("El segundo numero es: " + num2);
        m.setNumero2(num2);
        System.out.println("El mayor es: "+m.devolverMayor(m));
        System.out.println("El menor elevado al mayor: "+m.calcularPotencia(m));
        System.out.println("La raiz cuadrada del menor es: "+m.calculaRaiz(m));
        
    }

}
