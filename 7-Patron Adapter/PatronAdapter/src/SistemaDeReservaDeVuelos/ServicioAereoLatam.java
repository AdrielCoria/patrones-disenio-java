package SistemaDeReservaDeVuelos;

public class ServicioAereoLatam {
    public String buscarVuelosLatam(String ciudadOrigen, String ciudadDestino, String fechaSalida) {
        System.out.println("Buscando vuelos LATAM:");
        System.out.println(ciudadOrigen + " -> " + ciudadDestino + " | " + fechaSalida);

        // Simular búsqueda
        return "LATAM-" + (int)(Math.random() * 10000);
    }

    public boolean confirmarReservaLatam(String codigoVuelo, int cantidadPasajeros) {
        System.out.println("Confirmando reserva LATAM:");
        System.out.println("Vuelo: " + codigoVuelo);
        System.out.println("Pasajeros: " + cantidadPasajeros);

        // Simular reserva
        return Math.random() > 0.2; // 80% de éxito
    }
}
