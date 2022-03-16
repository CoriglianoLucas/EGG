/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author corig
 */
public class VendedorServicio {

    Scanner scan = new Scanner(System.in);

    public Vendedor altaVendedor() {
        //instancia un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //lleno los atributos
        System.out.println("ingrese el nombre del vendedor");
        v1.setNombre(scan.next());
        System.out.println("ingrese el DNI del vendedor");
        v1.setDni(scan.nextInt());
        System.out.println("ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(scan.nextDouble());
        System.out.println("ingrese el dia que inicio a trbajar");
        int dia = scan.nextInt();
        System.out.println("ingrese el mes en que inicio a trabajar");
        int mes = scan.nextInt();
        System.out.println("ingrese el año en que inicio a trabajar");
        int anio = scan.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void SueldoMensual(Vendedor v1) {
        System.out.println("Cuales fueron las ventas totales del vendedor");
        Double ventas = scan.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es: "
                + v1.getNombre() + " es de $" + v1.getSueldoMensual());

    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }

    }

}
