package sistemaDeFiltradoProductoEcommerce;

public class InventarioProductos implements IAgregado{

    private Producto[] productos;

    public InventarioProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorProducto(this.productos);
    }
}
