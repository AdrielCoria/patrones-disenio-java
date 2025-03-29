package sistemaSemaforoInteligente;

public class Rojo implements EstadoSemafo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Verde());
    }

    @Override
    public String mostrar() {
        return "Rojo";
    }

    @Override
    public int getDuracion() {
        return 20;
    }
}
