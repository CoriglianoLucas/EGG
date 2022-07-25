package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editorial {

    @Id
    protected int id;
    protected String nombre;
    protected boolean alta;

}
