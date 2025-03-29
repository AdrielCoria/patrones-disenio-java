package sistemaSemaforoInteligente;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        System.out.println("=== Simulador de Semáforo ===");
        System.out.println("Estado inicial: " + semaforo.getEstadoActual());

        // Simulación 5 cambios de estados
        for (int i = 0; i <= 5; i++) {
            System.out.println("\nCambio $" + (i + 1));
            semaforo.cambiar();
        }


    }
}
