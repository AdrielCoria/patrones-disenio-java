package sistemaBusquedaLibros;

public class ColeccionLibros implements IAgregado {

    private Libro[] libros;

    public ColeccionLibros(Libro[] libros) {
        this.libros = libros;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorLibro(this.libros);
    }
}
