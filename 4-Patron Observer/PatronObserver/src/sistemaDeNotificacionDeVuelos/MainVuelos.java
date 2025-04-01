package sistemaDeNotificacionDeVuelos;

public class MainVuelos {
    public static void main(String[] args) {


        GestorVuelo gestor = new GestorVuelo();
        gestor.setNumeroVuelo("AR1234");

        // Crear observadores
        Pasajero pasajero1 = new Pasajero("Juan Pérez");
        Pasajero pasajero2 = new Pasajero("María Gómez");
        Aerolinea aerolinea = new Aerolinea();

        // Registrar observadores
        gestor.registrarObservador(pasajero1);
        gestor.registrarObservador(pasajero2);
        gestor.registrarObservador(aerolinea);

        System.out.println("=== Sistema de Notificaciones de Vuelos ===");

        // Cambiar estados y notificar
        gestor.cambiarEstadoVuelo("ABORDAJE", "10:30");
        gestor.cambiarEstadoVuelo("DEMORADO", "11:15");

        // Eliminar un observador
        gestor.eliminarObservador(pasajero2);
        System.out.println("\nMaría Gómez ha sido eliminada del vuelo\n");

        gestor.cambiarEstadoVuelo("CANCELADO", "12:00");

    }
}
