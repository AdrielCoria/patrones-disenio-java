package projects.sistemaDeFiltradoDeImagenes;

public class FiltroSepia implements FiltroImagen {
    @Override
    public void aplicarFiltro(String nombreImagen) {
        System.out.println("Aplicando filtro Sepia a " + nombreImagen);
        // Lógica real de procesamiento...
    }
}
