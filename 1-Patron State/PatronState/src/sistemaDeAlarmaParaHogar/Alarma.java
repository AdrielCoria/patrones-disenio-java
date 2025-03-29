package sistemaDeAlarmaParaHogar;

public class Alarma {

    private EstadoAlarma estado;

    public Alarma() {
        this.estado = new Desactivada();
    }

    public void activar() {
        estado.activar(this);
    }

    public void desactivar() {
        estado.desactivar(this);
    }

    public void disparar() {
        System.out.println("Intento de disparar alarma....");
        estado.disparar(this);
    }

    public void setEstado(EstadoAlarma estado) {
        this.estado = estado;
        System.out.println("Estado de alarma: " + estado.getEstado());


        if (estado.getEstado().equals("DISPARADA")) {
            System.out.println("¡ALARMAA! ¡ALARMAA! ¡INTRUSO DETECTADO!");
        }
    }

    public String getEstadoActual() {
        return estado.getEstado();
    }
}
