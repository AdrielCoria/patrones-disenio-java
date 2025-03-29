package sistemaSemaforoInteligente;

public interface EstadoSemafo {

    public void cambiar(Semaforo semaforo);
    public String mostrar();
    public int getDuracion();
}
