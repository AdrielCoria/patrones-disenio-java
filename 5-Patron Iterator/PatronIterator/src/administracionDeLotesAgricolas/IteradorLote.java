package administracionDeLotesAgricolas;

public class IteradorLote implements Iterador {

    private String[] lotes;
    private int posicion;

    public IteradorLote(String[] lotes) {
        this.lotes = lotes;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return lotes[posicion];
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= lotes.length;
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public void siguiente() {
        if (!haFinalizado()) {
            posicion++;
        }
    }
}
