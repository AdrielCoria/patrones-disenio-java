package projects.sistemaDeProcesamientoDePago;

public class CarritoCompras {

    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarCompra(double total){
        if(metodoPago == null){
            System.out.println("No se ha seleccionado un método de pago.");
            return;
        }
        metodoPago.procesarPago(total);
    }
}
