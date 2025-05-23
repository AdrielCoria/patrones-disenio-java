package sistemaDeFiltradoProductoEcommerce;

public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " [" + categoria + "] $" + precio + " (Stock: " + stock + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
