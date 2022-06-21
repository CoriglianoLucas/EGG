package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {
    
    private ProductoDAO dao;
    
    public ProductoServicio(){
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del producto");
            }
            
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCodigoFabricante(codigoFabricante);
        dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(String nombre,double nuevoPrecio) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del producto");
            }

            Producto producto = buscarProductoPorNombre(nombre);
            producto.setPrecio(nuevoPrecio);
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(String nombre) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del producto");
            }
         
        dao.eliminarProducto(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorNombre(String nombre) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del producto");
            }
        Producto producto = dao.buscarProductoPorNombre(nombre);
        return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirProductos() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
}
