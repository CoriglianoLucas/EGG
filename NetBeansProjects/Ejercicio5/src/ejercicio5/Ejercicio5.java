/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.Cuenta;

/**
 *
 * @author corig
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta();
        c1 = c1.crearCuenta();
        c1.ingresar(c1);
        c1.consultarSaldo(c1);
        c1.retirar(c1);
        c1.consultarSaldo(c1);
        c1.extraccionRapida(c1);
        c1.consultarDatos(c1);
    }
    
}
