package sistemaSemaforoInteligente;

public class Semaforo {

    private EstadoSemafo estado;

    public Semaforo() {
        this.estado = new Rojo();
    }

    public void cambiar() {
        System.out.println("Cambiando el estado actual: " + estado.mostrar() + " (" + estado.getDuracion() + " segundos)");
        estado.cambiar(this);
    }

    public void setEstado(EstadoSemafo estado) {
        this.estado = estado;
        System.out.println("Nuevo estado: " + estado.mostrar());
    }

    public String getEstadoActual() {
        return estado.mostrar();
    }
}
