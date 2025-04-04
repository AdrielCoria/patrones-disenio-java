package historialCambioDeVersion;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Sistema de Historial de Versiones ===");

        HistorialVersiones historial = HistorialVersiones.getInstancia();

        // Registrar algunas versiones
        historial.registrarVersion("1.0.0", "Versión inicial del proyecto");
        Thread.sleep(1000); // Simular tiempo entre versiones

        historial.registrarVersion("1.1.0", "Nuevas funcionalidades:\n- Login de usuarios\n- Dashboard principal");
        Thread.sleep(1500);

        historial.registrarVersion("1.2.0", "Corrección de bugs:\n- Fix #123: Error en cálculo\n- Fix #124: Problema de rendimiento");

        // Mostrar historial completo
        historial.mostrarHistorial();

        // Verificar instancia única
        HistorialVersiones mismoHistorial = HistorialVersiones.getInstancia();
        mismoHistorial.registrarVersion("1.2.1", "Hotfix para problema crítico");

        System.out.println("¿Misma instancia? " + (historial == mismoHistorial));
    }
}
