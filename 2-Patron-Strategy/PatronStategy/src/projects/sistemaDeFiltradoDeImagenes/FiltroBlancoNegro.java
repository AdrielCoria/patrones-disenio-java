package projects.sistemaDeFiltradoDeImagenes;

public class FiltroBlancoNegro implements FiltroImagen{

    @Override
    public void aplicarFiltro(String nombreImagen) {
        System.out.println("Aplicando filtro Blanco y Negro a " + nombreImagen);
        // Lógica real de procesamiento...
    }
}
