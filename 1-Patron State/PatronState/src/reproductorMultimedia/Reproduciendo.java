package reproductorMultimedia;

public class Reproduciendo implements EstadoReproductor {
    @Override
    public void reproducir(Reproductor reproductor) {
        reproductor.setEstado(new Reproduciendo());
    }

    @Override
    public void pausar(Reproductor reproductor) {
        reproductor.setEstado(new Pausado());
    }

    @Override
    public void detener(Reproductor reproductor) {
        reproductor.setEstado(new Detenido());
    }

    @Override
    public String getEstado() {
        return "REPRODUCIENDO";
    }
}
