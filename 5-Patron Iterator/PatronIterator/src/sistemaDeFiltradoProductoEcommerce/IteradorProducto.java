package sistemaDeFiltradoProductoEcommerce;

public class IteradorProducto implements Iterador {

    private Producto[] productos;
    private int posicion;

    public IteradorProducto(Producto[] productos) {
        this.productos = productos;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return productos[posicion];
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= productos.length;
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public void siguiente() {
        if (!haFinalizado()) posicion++;
    }

    @Override
    public boolean cumpleFiltro(String filtro) {
        Producto producto = (Producto) elementoActual();
        return producto.getNombre().toLowerCase().contains(filtro.toLowerCase()) ||
                producto.getCategoria().toLowerCase().contains(filtro.toLowerCase());
    }

    // Método adicional para filtrar por precio máximo
    public void filtrarPorPrecio(double precioMax) {
        primero();
        System.out.println("\nProductos bajo $" + precioMax + ": ");
        while (!haFinalizado()) {
            Producto producto = (Producto) elementoActual();
            if (producto.getPrecio() <= precioMax && producto.getStock() > 0) {
                System.out.println("- " + producto);
            }
            siguiente();
        }
    }


}
