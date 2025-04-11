package SistemaDePagosBancarios;

public interface IAdaptadorPago {
    void procesarPago(String idCliente, double monto);
    String consultarEstado(String idTransaccion);
}
