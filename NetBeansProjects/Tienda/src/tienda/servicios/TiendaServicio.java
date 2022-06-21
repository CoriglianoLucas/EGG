package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;

public class TiendaServicio {

    public TiendaServicio() {
    }
    

    public void listarNombresProductos() throws Exception {
        ProductoServicio s = new ProductoServicio();
        try {
            Collection<Producto> productos = s.listarProductos();
            for (Producto u : productos) {
                System.out.println(u.getNombre());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarNombresPreciosProductos() throws Exception {
        ProductoServicio s = new ProductoServicio();
        try {
            Collection<Producto> productos = s.listarProductos();
            for (Producto u : productos) {
                System.out.println(u.getNombre() + "  $" + u.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarPrecios120a202() throws Exception {
        ProductoServicio s = new ProductoServicio();
        try {
            Collection<Producto> productos = s.listarProductos();
            for (Producto u : productos) {
                if (u.getPrecio() > 120 && u.getPrecio() < 202) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarPortatiles() throws Exception {
        ProductoServicio s = new ProductoServicio();
        try {
            Collection<Producto> productos = s.listarProductos();
            for (Producto u : productos) {
                String[] nombreSplit = u.getNombre().split(" ");
                for (String str1 : nombreSplit) {
                    if (str1.equals("Portatil") || str1.equals("Portátil")) {
                        System.out.println(u.getNombre());
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarMasBarato() throws Exception {
        ProductoServicio s = new ProductoServicio();
        try {
            Collection<Producto> productos = s.listarProductos();
            int i = 0;
            Producto masBarato = new Producto();
            for (Producto u : productos) {
                if (i == 0) {
                    masBarato = u;
                } else if (u.getPrecio() < masBarato.getPrecio()) {
                    masBarato = u;
                }
                i++;
            }
            System.out.println("El mas barato es: " + masBarato.getNombre() + "  $" + masBarato.getPrecio());
        } catch (Exception e) {
            throw e;
        }
    }

    public void IngresarUnProducto() throws Exception {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio s = new ProductoServicio();
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = scan.next();
            System.out.println("Ingrese el precio del producto");
            double precio = scan.nextDouble();
            System.out.println("Ingrese el codifo de fabricante del producto");
            int codigoFabricante = scan.nextInt();
            s.crearProducto(nombre, precio, codigoFabricante);
            System.out.println("Se creo el producto");
        } catch (Exception e) {
            throw e;
        }
    }

    public void IngresarUnFabricante() throws Exception {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        FabricanteServicio s = new FabricanteServicio();
        try {
            System.out.println("Ingrese el nombre del fabricante");
            String nombre = scan.next();
            s.crearFabricante(nombre);
            System.out.println("Se creo el fabricante");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecio() throws Exception {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que quiere modificar");
        String nombre = scan.next();
        System.out.println("Ingrese el nuevo precio del producto");
        double nuevoPrecio = scan.nextDouble();
        ProductoServicio s = new ProductoServicio();
        try {
            s.modificarProducto(nombre, nuevoPrecio);
            System.out.println("Precio Modificado");
        } catch (Exception e) {
            throw e;
        }

    }

}
