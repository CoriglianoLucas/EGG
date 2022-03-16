/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

import java.util.Scanner;

/**
 *
 * @author corig
 */
public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    Scanner scan = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        System.out.println("ingrese un numero de cuenta");
        c.setNumeroCuenta(scan.nextInt());
        System.out.println("ingrese el DNI");
        c.setDni(scan.nextLong());
        System.out.println("ingrese un saldo");
        c.setSaldo(scan.nextDouble());
        return c;
    }

    public void ingresar(Cuenta c) {
        double saldoActual = c.getSaldo();
        System.out.println("Cuanto dinero desea ingresar?");
        double dinero = scan.nextDouble();
        saldoActual += dinero;
        c.setSaldo(saldoActual);
    }

    public void retirar(Cuenta c) {
        double saldoActual = c.getSaldo();
        System.out.println("Cuanto dinero desea retirar?");
        double dinero = scan.nextDouble();
        saldoActual -= dinero;
        if (saldoActual < 0.0) {
            saldoActual = 0.0;
        }
        c.setSaldo(saldoActual);
    }

    public void extraccionRapida(Cuenta c) {
        System.out.println("Cuanto dinero desea retirar?");
        double dinero = scan.nextDouble();
        if (dinero > c.getSaldo() * 0.2) {
            System.out.println("no pude sacr mas del %20 del saldo");
        } else {
            double saldoActual = c.getSaldo();
            saldoActual -= dinero;
            if (saldoActual < 0.0) {
                saldoActual = 0.0;
            }
            c.setSaldo(saldoActual);
        }
    }
    
    public void consultarSaldo(Cuenta c){
        System.out.println("su saldo es de: $"+c.getSaldo());
    }
    
    public void consultarDatos(Cuenta c){
        System.out.println("Numero de cuenta: "+c.getNumeroCuenta());
        System.out.println("DNI: "+c.getDni());
        System.out.println("Saldo: $"+c.getSaldo());
    }

}
