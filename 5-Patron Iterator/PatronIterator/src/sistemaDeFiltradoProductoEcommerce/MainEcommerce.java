package sistemaDeFiltradoProductoEcommerce;

public class MainEcommerce {
    public static void main(String[] args) {
        Producto[] productos = {
                new Producto("iPhone 13", "Celulares", 999.99, 10),
                new Producto("Samsung Galaxy", "Celulares", 799.99, 5),
                new Producto("Laptop HP", "Computación", 1200.00, 8),
                new Producto("Tablet Lenovo", "Computación", 299.99, 15),
                new Producto("Smartwatch", "Accesorios", 199.99, 20)
        };

        InventarioProductos inventario = new InventarioProductos(productos);
        IteradorProducto iterador = (IteradorProducto) inventario.crearIterador();

        System.out.println("=== Todos los productos ===");
        while (!iterador.haFinalizado()) {
            System.out.println(iterador.elementoActual());
            iterador.siguiente();
        }

        // Casos de uso reales
        iterador.filtrarPorPrecio(800.00);

        System.out.println("\n === Buscar en Celulares ===");
        iterador.primero();
        while (!iterador.haFinalizado()) {
            if (iterador.cumpleFiltro("Celulares")) {
                System.out.println("- " + iterador.elementoActual());
            }
            iterador.siguiente();
        }

    }
}
