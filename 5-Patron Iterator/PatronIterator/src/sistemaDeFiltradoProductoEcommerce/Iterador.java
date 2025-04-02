package sistemaDeFiltradoProductoEcommerce;

public interface Iterador {

    Object elementoActual();

    boolean haFinalizado();

    void primero();

    void siguiente();

    boolean cumpleFiltro(String filtro);
}
