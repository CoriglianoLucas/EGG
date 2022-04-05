package colecciones6;

import colecciones6.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colecciones6 {

    public static void main(String[] args) {
        Producto p = new Producto();
        introducirElemento(p);
        modificarPrecio(p);
        eliminarProducto(p);
        mostrarProductos(p);
    }

    public static void introducirElemento(Producto p) {
        boolean salir = false;
        while (!salir) {
            HashMap<String, Integer> productos = p.getProductos();
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.println("ingrese el nombre del producto");
            String nombre = scan.next();
            System.out.println("ingrese el precio del producto");
            int precio = scan.nextInt();
            productos.put(nombre, precio);
            p.setProductos(productos);

            System.out.println("quiere agregar a otro producto? si/no");
            String decision = scan.next();
            if (decision.equals("si")) {
                salir = false;
            } else if (decision.equals("no")) {
                salir = true;
            }
        }
        System.out.println("");
    }

    public static void modificarPrecio(Producto p) {
        HashMap<String, Integer> productos = p.getProductos();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el nombre del producto para cambiarle el precio");
        String nombre = scan.next();
        System.out.println("ingrese el nuevo precio");
        int precio = scan.nextInt();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto= " + entry.getKey() + ", Precio= " + entry.getValue());
            if (entry.getKey().equals(nombre)) {
                productos.replace(entry.getKey(), entry.getValue(), precio);
                System.out.println("Precio modificado");
                System.out.println("Producto= " + entry.getKey() + ", Precio= " + entry.getValue());
            }
        }
        p.setProductos(productos);
        System.out.println("");
    }

    public static void eliminarProducto(Producto p) {
        HashMap<String, Integer> productos = p.getProductos();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el nombre del producto a eliminar");
        String nombre = scan.next();
        productos.remove(nombre);
        System.out.println("Producto eliminado");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto= " + entry.getKey() + ", Precio= " + entry.getValue());
        }
        p.setProductos(productos);
    }
    
    public static void mostrarProductos(Producto p){
        HashMap<String, Integer> productos = p.getProductos();
        System.out.println("La lista de productos: ");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto= " + entry.getKey() + ", Precio= " + entry.getValue());
        }
    }
}
