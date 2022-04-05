package colecciones6.entidades;

import java.util.HashMap;

public class Producto {
    
    private HashMap<String, Integer> productos = new HashMap();

    public Producto() {
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }
    
    

}
