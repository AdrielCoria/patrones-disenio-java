package projects.sistemaDeProcesamientoDePago;

public class PagoTransferencia implements MetodoPago{

    private String cuentaBancaria;

    public PagoTransferencia(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando transferencia a cuenta %s por $%.2f\n",
                cuentaBancaria.substring(5), monto);
        // Lógica real de procesamiento...
    }
}
