package administradorDeMemoriaCache;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gestor de Caché para Videojuego ===");

        CacheRecursos cache = CacheRecursos.getInstancia();

        // Cargar recursos
        cache.cargarRecurso("textura_personaje", new Object());
        cache.cargarRecurso("modelo_escenario", new Object());
        cache.cargarRecurso("sonido_ambiente", new Object());

        // Intentar cargar otro (debería liberar espacio)
        cache.cargarRecurso("animacion_personaje", new Object());

        // Obtener recursos
        cache.obtenerRecurso("textura_personaje");
        cache.obtenerRecurso("modelo_escenario");

        // Verificar instancia única
        CacheRecursos mismaCache = CacheRecursos.getInstancia();
        mismaCache.obtenerRecurso("sonido_ambiente");

        System.out.println("\n¿Misma instancia de caché? " + (cache == mismaCache));
    }
}
