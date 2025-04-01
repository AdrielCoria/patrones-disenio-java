package projects.sistemaDeFiltradoDeImagenes;

public class EditorImagenes {

    private FiltroImagen filtro;

    public void setFiltro(FiltroImagen filtro) {
        this.filtro = filtro;
    }

    public void aplicarFiltroActual(String nombreImagen) {
        if(filtro == null){
            System.out.println("No se ha seleccionado ningún filtro");
            return;
        }
        filtro.aplicarFiltro(nombreImagen);
    }
}
