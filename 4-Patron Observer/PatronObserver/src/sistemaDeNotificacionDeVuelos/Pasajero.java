package sistemaDeNotificacionDeVuelos;

public class Pasajero implements IObservadorVuelo {
    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actulizar(String numeroVuelo, String estado, String hora) {
        System.out.printf("Notificación para %s - Vuelo %s: %s a las %s\n", nombre, numeroVuelo, estado, hora);
    }
}
