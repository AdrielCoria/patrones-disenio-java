package reproductorMultimedia;

public class Reproductor {

    private EstadoReproductor estado;
    private String cancionActual;

    public Reproductor() {
        this.estado = new Detenido();
        this.cancionActual = "Imposible - James Arthur";
    }

    public void reproducir() {
        System.out.println("Intento reproducir: " + cancionActual);
        estado.reproducir(this);
    }

    public void pausar() {
        estado.pausar(this);
    }

    public void detener() {
        estado.detener(this);
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
        System.out.println("Estado cambiado a: " + estado.getEstado());
    }

    public String getEstadoActual(){
        return this.estado.getEstado();
    }


}
