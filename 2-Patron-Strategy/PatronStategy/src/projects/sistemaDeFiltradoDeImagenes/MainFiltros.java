package projects.sistemaDeFiltradoDeImagenes;

public class MainFiltros {
    public static void main(String[] args) {

        EditorImagenes editor = new EditorImagenes();
        System.out.println("=== Editor de Imágenes ===");

        // Probar diferentes estrategias
        editor.setFiltro(new FiltroBlancoNegro());
        editor.aplicarFiltroActual("vacaciones.jpg");

        editor.setFiltro(new FiltroSepia());
        editor.aplicarFiltroActual("retrato.png");

        editor.setFiltro(new FiltroAltoContraste());
        editor.aplicarFiltroActual("paisaje.webp");

    }
}
