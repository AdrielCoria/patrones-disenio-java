package projects.sistemaDeProcesamientoDePago;

public class PagoTarjeta implements MetodoPago {

    private String numeroTarjeta;
    private String cvv;

    public PagoTarjeta(String numeroTarjeta, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago con tarjeta %s por $%.2f\n", numeroTarjeta.substring(12), monto);
        // lógica real de procesamiento....
    }
}
