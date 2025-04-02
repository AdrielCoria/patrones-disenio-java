package sistemaBusquedaLibros;

public class IteradorLibro implements Iterador {

    private Libro[] libros;
    private int posicion;

    public IteradorLibro(Libro[] libros) {
        this.libros = libros;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return libros[posicion];
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= libros.length;
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public void siguiente() {
        if (!haFinalizado()) posicion++;
    }

    @Override
    public boolean cumpleFiltro(String filtro) {
        Libro libroActual = (Libro) elementoActual(); // Para convertir de object a Libro.
        return libroActual.getTitulo().toLowerCase().contains(filtro.toLowerCase()) || libroActual.getAutor().toLowerCase().contains(filtro.toLowerCase());
    }

    // Método adicional para buscar
    public void buscar(String texto) {
        primero();
        System.out.println("\nResultados para '" + texto + "':");
        while (!haFinalizado()) {
            if (cumpleFiltro(texto)) {
                System.out.println("- " + elementoActual());
            }
            siguiente();
        }
    }

}
