package SistemaDePagosBancarios;

public class AdaptadorPagoBN implements IAdaptadorPago {

    private ServicioPagoBN servicioBN;

    public AdaptadorPagoBN() {
        this.servicioBN = new ServicioPagoBN();
    }

    @Override
    public void procesarPago(String idCliente, double monto) {
        // Adaptar parámetros
        String clienteBN = "CLI-" + idCliente;
        String divisa = "USD";

        // Usar servicio externo
        servicioBN.autorizarPagoBN(clienteBN, monto, divisa);
    }

    @Override
    public String consultarEstado(String idTransaccion) {
        // Adaptar código
        String codigoBN = idTransaccion.replace("ADP-", "BN-");

        // Usar servicio externo
        return servicioBN.verificarEstadoBN(codigoBN);    }
}
