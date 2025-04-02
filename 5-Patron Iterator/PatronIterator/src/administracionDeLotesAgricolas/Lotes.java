package administracionDeLotesAgricolas;

public class Lotes implements IAgregado {

    private String[] lotes;

    public Lotes(String[] lotes) {
        this.lotes = lotes;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorLote(this.lotes);
    }
}
