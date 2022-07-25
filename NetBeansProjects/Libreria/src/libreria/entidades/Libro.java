package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro {

    @Id
    protected long isbn;
    protected String titulo;
    protected int anio;
    protected int ejemplares;
    protected int ejemplaresPrestados;
    protected int ejemplaresRestantes;
    protected boolean alta;
    protected Autor autor;
    protected Editorial editorial;

}
