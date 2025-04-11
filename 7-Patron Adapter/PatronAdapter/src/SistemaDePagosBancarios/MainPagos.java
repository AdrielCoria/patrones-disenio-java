package SistemaDePagosBancarios;

public class MainPagos {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Pagos con Adapter ===");

        // Crear adaptador
        IAdaptadorPago adaptador = new AdaptadorPagoBN();

        // Procesar pago
        System.out.println("\nProcesando pago...");
        adaptador.procesarPago("12345", 150.75);

        // Consultar estado
        System.out.println("\nConsultando estado...");
        String estado = adaptador.consultarEstado("ADP-123456789");
        System.out.println("Estado del pago: " + estado);
    }
}
