package sistemaBusquedaLibros;

public class Main {
    public static void main(String[] args) {

        Libro[] libros = {
                new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728"),
                new Libro("El principito", "Antoine de Saint-Exupéry", "978-0156013925"),
                new Libro("1984", "George Orwell", "978-0451524935"),
                new Libro("Don Quijote", "Miguel de Cervantes", "978-8424112936")
        };

        ColeccionLibros biblioteca = new ColeccionLibros(libros);
        IteradorLibro iteradorLibro = (IteradorLibro) biblioteca.crearIterador();

        System.out.println("=== Catálogo Completo ===");
        while(!iteradorLibro.haFinalizado()){
            System.out.println(iteradorLibro.elementoActual());
            iteradorLibro.siguiente();
        }

        // Ejemplo de búsqueda como caso de uso:
        iteradorLibro.buscar("Gabriel");
        iteradorLibro.buscar("978-8424112936");


    }
}
