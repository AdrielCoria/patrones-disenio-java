package projects.sistemaDeProcesamientoDePago;

public class PagoPayPal implements MetodoPago {

    private String email;

    public PagoPayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago con PayPal (%s) por $%.2f\n", email, monto);
    }
}
