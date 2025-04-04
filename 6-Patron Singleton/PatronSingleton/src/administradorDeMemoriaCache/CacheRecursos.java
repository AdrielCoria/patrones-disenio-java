package administradorDeMemoriaCache;

import java.util.HashMap;
import java.util.Map;

public class CacheRecursos {
    private static CacheRecursos instancia;
    private Map<String, Object> cache = new HashMap<>();
    private int capacidadMaxima;

    private CacheRecursos() {
        System.out.println("Inicializando caché de recursos...");
    }

    public static synchronized CacheRecursos getInstancia() {
        if (instancia == null) {
            instancia = new CacheRecursos();
        }
        return instancia;
    }

    public void cargarRecurso(String clave, Object recurso) {
        if (cache.size() >= capacidadMaxima) {
            System.out.println("Caché llena - liberando espacio...");
            liberarCache();
        }
        System.out.println("Cargando en caché: " + clave);
        cache.put(clave, recurso);
    }

    public Object obtenerRecurso(String clave) {
        Object recurso = cache.get(clave);
        if (recurso != null) {
            System.out.println("Recurso obtenido de caché: " + clave);
        } else {
            System.out.println("Recurso no encontrado en caché: " + clave);
        }
        return recurso;
    }

    private void liberarCache() {
        if (!cache.isEmpty()) {
            String primeraClave = cache.keySet().iterator().next();
            System.out.println("Liberando: " + primeraClave);
            cache.remove(primeraClave);
        }
    }

}
