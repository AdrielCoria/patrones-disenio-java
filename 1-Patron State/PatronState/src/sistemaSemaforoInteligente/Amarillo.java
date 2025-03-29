package sistemaSemaforoInteligente;

public class Amarillo implements EstadoSemafo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Rojo());
    }

    @Override
    public String mostrar() {
        return "Amarillo";
    }

    @Override
    public int getDuracion() {
        return 5;
    }
}
