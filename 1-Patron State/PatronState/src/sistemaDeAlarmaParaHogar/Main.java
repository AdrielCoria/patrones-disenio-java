package sistemaDeAlarmaParaHogar;

public class Main {

    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        System.out.println("=== Sistema de Alarma para Hogar ===");
        System.out.println("Estado inicial: " + alarma.getEstadoActual());

        alarma.disparar();
        alarma.activar();
        alarma.disparar();
        alarma.activar();
        alarma.desactivar();

    }
}
