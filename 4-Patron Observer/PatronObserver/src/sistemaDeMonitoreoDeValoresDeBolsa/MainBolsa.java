package sistemaDeMonitoreoDeValoresDeBolsa;

public class MainBolsa {
    public static void main(String[] args) {
        BolsaValores bolsa = new BolsaValores();

        // Crear observadores con sus intereses
        Inversor inversor1 = new Inversor("Carlos", "AAPL", 150.0);
        Inversor inversor2 = new Inversor("Ana", "GOOGL", 2500.0);
        SistemaReportes reportes = new SistemaReportes();

        // Registrar observadores
        bolsa.registrarObservador(inversor1);
        bolsa.registrarObservador(inversor2);
        bolsa.registrarObservador(reportes);

        System.out.println("=== Sistema de Monitoreo de Bolsa ===");

        // Actualizar precios
        bolsa.setPrecio("AAPL", 145.50);
        bolsa.setPrecio("GOOGL", 2510.75); // Debe alertar a Ana
        bolsa.setPrecio("AAPL", 152.30);   // Debe alertar a Carlos

        // Eliminar un observador
        bolsa.eliminarObservador(reportes);
        System.out.println("\nSistema de reportes desactivado\n");

        bolsa.setPrecio("MSFT", 305.20); // No hay alertas configuradas para MSFT
    }
}
