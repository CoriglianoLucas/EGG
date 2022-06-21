package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    private FabricanteDAO dao;
    
    public FabricanteServicio(){
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del fabricante");
            }
            
        Fabricante fabricante = new Fabricante();
        fabricante.setNombre(nombre);
        dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(String nombre, String nuevoNombre) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del fabricante");
            }
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nuevo nombre del fabricante");
            }
            Fabricante fabricante = buscarFabricantePorNombre(nombre);
            fabricante.setNombre(nuevoNombre);
            dao.modificarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(String nombre) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del fabricante");
            }
         
        dao.eliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception{
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception ("Debe indicar el nombre del fabricante");
            }
        Fabricante fabricante = dao.buscarFabricantePorNombre(nombre);
        return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = listarFabricantes();

            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante u : fabricantes) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
}
