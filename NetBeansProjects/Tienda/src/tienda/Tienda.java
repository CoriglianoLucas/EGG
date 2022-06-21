package tienda;

import java.util.Scanner;
import tienda.servicios.TiendaServicio;

public class Tienda {

    public static void main(String[] args) throws Exception {
        TiendaServicio tienda = new TiendaServicio();
        Scanner scan = new Scanner(System.in);
        imprimirMenu();
        int opcion = scan.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    tienda.listarNombresProductos();
                    break;
                case 2:
                    tienda.listarNombresPreciosProductos();
                    break;
                case 3:
                    tienda.listarPrecios120a202();
                    break;
                case 4:
                    tienda.listarPortatiles();
                    break;
                case 5:
                    tienda.listarMasBarato();
                    break;
                case 6:
                    tienda.IngresarUnProducto();
                    break;
                case 7:
                    tienda.IngresarUnFabricante();
                    break;
                case 8:
                    tienda.modificarPrecio();
                    break;
            }
            imprimirMenu();
            opcion = scan.nextInt();
        }

    }

    public static void imprimirMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("MENU");
        System.out.println("Seleccione la operacion a realizar");
        System.out.println("(1) Lista el nombre de todos los productos que hay en la tabla producto.");
        System.out.println("(2) Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("(3) Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("(4) Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("(5) Listar el nombre y el precio del producto más barato.");
        System.out.println("(6) Ingresar un producto a la base de datos.");
        System.out.println("(7) Ingresar un fabricante a la base de datos.");
        System.out.println("(8) Editar el precio de un producto con datos a elección.");
        System.out.println("Ingrese el numero 0 para salir");
    }

}
