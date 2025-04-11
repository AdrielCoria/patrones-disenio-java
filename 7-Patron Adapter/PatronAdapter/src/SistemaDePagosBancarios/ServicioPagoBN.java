package SistemaDePagosBancarios;

public class ServicioPagoBN {
    public String autorizarPagoBN(String clienteBN, double importe, String divisa) {
        System.out.println("Autorizando pago en Banco Nacional:");
        System.out.println("Cliente: " + clienteBN);
        System.out.println("Importe: " + importe + " " + divisa);

        // Simular lógica de pago
        String codigo = "BN-" + System.currentTimeMillis();
        System.out.println("Pago autorizado. Código: " + codigo);
        return codigo;
    }

    public String verificarEstadoBN(String codigoBN) {
        // Simular verificación
        return Math.random() > 0.3 ? "APROBADO" : "RECHAZADO";
    }
}
