package sistemaDeAlarmaParaHogar;

public class Desactivada implements EstadoAlarma {
    @Override
    public void activar(Alarma alarma) {
        alarma.setEstado(new Activada());
    }

    @Override
    public void desactivar(Alarma alarma) {
        System.out.println("La alarma ya está desactivada");
    }

    @Override
    public void disparar(Alarma alarma) {
        System.out.println("No se puede disparar, la alarma está desactivada.");
    }

    @Override
    public String getEstado() {
        return "DESACTIVADA";
    }
}
