package projects.sistemaDeProcesamientoDePago;

public class MainPagos {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        System.out.println("=== Sistema de Procesamiento de Pagos ===");

        // Configurar diferentes estrategias
        carrito.setMetodoPago(new PagoTarjeta("1234567812345678", "123"));
        carrito.realizarCompra(100.50);

        carrito.setMetodoPago(new PagoPayPal("usuario@example.com"));
        carrito.realizarCompra(75.30);

        carrito.setMetodoPago(new PagoTransferencia("BANK123456789"));
        carrito.realizarCompra(200.00);

    }
}
