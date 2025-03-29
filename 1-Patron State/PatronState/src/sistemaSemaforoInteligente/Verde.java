package sistemaSemaforoInteligente;

public class Verde implements EstadoSemafo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setEstado(new Amarillo());
    }

    @Override
    public String mostrar() {
        return "Verde";
    }

    @Override
    public int getDuracion() {
        return 30;
    }
}
