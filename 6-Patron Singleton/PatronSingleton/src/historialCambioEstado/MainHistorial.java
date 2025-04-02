package historialCambioEstado;

public class MainHistorial {
    public static void main(String[] args) {
        // Crear algunos estados
        Estado estadoInicial = new Estado("Iniciado");
        Estado estadoProceso = new Estado("En Proceso");
        Estado estadoFinalizado = new Estado("Finalizado");

        // Crear gestor de historial
        GestorHistorial historial = new GestorHistorial();

        // Registrar cambios
        historial.registrarNuevoEstado(estadoInicial);

        // Simular tiempo entre cambios
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        historial.finalizarEstadoActual();
        historial.registrarNuevoEstado(estadoProceso);

        try { Thread.sleep(1500); } catch (InterruptedException e) {}

        historial.finalizarEstadoActual();
        historial.registrarNuevoEstado(estadoFinalizado);

        // Mostrar historial
        historial.imprimirHistorial();

        // Verificar singleton
        CambioEstado cambio1 = CambioEstado.getInstancia();
        CambioEstado cambio2 = CambioEstado.getInstancia();
        System.out.println("\n¿Misma instancia de CambioEstado? " + (cambio1 == cambio2));
    }
}
