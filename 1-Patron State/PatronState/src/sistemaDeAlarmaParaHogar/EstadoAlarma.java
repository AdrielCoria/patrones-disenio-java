package sistemaDeAlarmaParaHogar;

public interface EstadoAlarma {

    void activar(Alarma alarma);

    void desactivar(Alarma alarma);

    void disparar(Alarma alarma);

    String getEstado();
}
