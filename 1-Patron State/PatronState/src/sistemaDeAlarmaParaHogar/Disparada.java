package sistemaDeAlarmaParaHogar;

public class Disparada implements EstadoAlarma {
    @Override
    public void activar(Alarma alarma) {
        System.out.println("No se puede activar mientras está disparada");
    }

    @Override
    public void desactivar(Alarma alarma) {
        alarma.setEstado(new Desactivada());
    }

    @Override
    public void disparar(Alarma alarma) {
        System.out.println("La alarma ya está disparada");
    }

    @Override
    public String getEstado() {
        return "DISPARADA";
    }
}
