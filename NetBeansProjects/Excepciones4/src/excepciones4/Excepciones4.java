package excepciones4;

import java.util.Scanner;

public class Excepciones4 {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.println("ingrese una cadena para transformar a numero");
            String cadena = scan.next();
            int numero = Integer.parseInt(cadena);
            System.out.println("ingrese dos numeros para hacer la division");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int division = num1 / num2;

        } catch (NumberFormatException e) {
            
            System.out.println("error esa cadena no puede convertirse a entero");
        } catch (ArithmeticException e) {
            System.out.println("error en la division, no se pude dividir por 0");
        }
        System.out.println("termino el programa");
    }

}
