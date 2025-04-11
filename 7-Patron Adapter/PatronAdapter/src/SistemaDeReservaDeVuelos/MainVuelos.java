package SistemaDeReservaDeVuelos;

public class MainVuelos {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Reservas con Adapter ===");

        // Crear adaptador
        IAdaptadorReserva adaptador = new AdaptadorVuelosLatam();

        // Buscar vuelos
        System.out.println("\nBuscando vuelos...");
        boolean encontrado = adaptador.buscarVuelos("BUE", "MIA", "15/08/2023");
        System.out.println("Vuelos encontrados: " + encontrado);

        // Reservar vuelo
        System.out.println("\nReservando vuelo...");
        boolean reservado = adaptador.reservarVuelo("ADP-1234", 2);
        System.out.println("Reserva exitosa: " + reservado);
    }
}
