package projects.sistemaDeAnalisisDeDatos.hash;

import java.util.HashMap;
import java.util.Map;

public class View {
    public static void main(String[] args) {

        Map<String, Integer> mapaEdades = new HashMap<>();

        // agregar elementos al HashMap
        mapaEdades.put("Juan", 25);
        mapaEdades.put("María", 30);
        mapaEdades.put("Carlos", 28);

        // Obtener un valor usando una clave
        int edadJuan = mapaEdades.get("Juan");
        System.out.println("Edad de Juan: " + edadJuan); // Salida: Edad de Juan: 25

        // Verificar si una clave existe
        boolean existeMaria = mapaEdades.containsKey("María");
        System.out.println("¿María está en el mapa? " + existeMaria); // Salida: true

        // Verificar si un valor existe
        boolean existeEdad28 = mapaEdades.containsValue(28);
        System.out.println("¿Existe alguien con 28 años? " + existeEdad28); // Salida: true

        // Eliminar un elemento
        mapaEdades.remove("Carlos");
        System.out.println("Mapa después de eliminar a Carlos: " + mapaEdades);

        // Iterar sobre las claves y valores
        System.out.println("--- Todas las entradas ---");
        for (Map.Entry<String, Integer> entrada : mapaEdades.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
        }

        // Tamaño del HashMap
        System.out.println("Tamaño del mapa: " + mapaEdades.size());

        // Limpiar el HashMap
        mapaEdades.clear();
        System.out.println("Mapa después de clear(): " + mapaEdades);

    }
}
