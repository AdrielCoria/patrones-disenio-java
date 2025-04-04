package controladorDeImpresion;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Simulador de Controlador de Impresión ===");

        ControladorImpresora impresora = ControladorImpresora.getInstancia();

        // Agregar documentos a imprimir
        impresora.agregarDocumento("Documento1.pdf");
        impresora.agregarDocumento("ReporteFinal.docx");
        impresora.agregarDocumento("Factura1234.pdf");

        // Verificar que no se pueden crear múltiples instancias
        ControladorImpresora mismaImpresora = ControladorImpresora.getInstancia();
        mismaImpresora.agregarDocumento("Contrato.docx");

        System.out.println("\n¿Es la misma impresora? " + (impresora == mismaImpresora));

        // Esperar a que termine la impresión
        Thread.sleep(7000);
    }
}
