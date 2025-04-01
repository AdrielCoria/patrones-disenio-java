package sistemaDeNotificacionDeVuelos;

public class Aerolinea implements IObservadorVuelo{
    @Override
    public void actulizar(String numeroVuelo, String estado, String hora) {
        System.out.printf("Aerolínea notificada - Vuelo %s: %s\n", numeroVuelo, estado);
    }
}
