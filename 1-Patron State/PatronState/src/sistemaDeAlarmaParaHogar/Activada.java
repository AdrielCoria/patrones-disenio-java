package sistemaDeAlarmaParaHogar;

public class Activada implements EstadoAlarma {
    @Override
    public void activar(Alarma alarma) {
        System.out.println("La alarma ya está activada.");
    }

    @Override
    public void desactivar(Alarma alarma) {
        alarma.setEstado(new Desactivada());
    }

    @Override
    public void disparar(Alarma alarma) {
        alarma.setEstado(new Disparada());
    }

    @Override
    public String getEstado() {
        return "ACTIVADA";
    }
}
