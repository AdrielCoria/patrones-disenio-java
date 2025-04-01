package sistemaDeNotificacionDeVuelos;

public interface IObservadorVuelo {

    // Implementación PUSH
    void actulizar(String numeroVuelo, String estado, String hora);
}
