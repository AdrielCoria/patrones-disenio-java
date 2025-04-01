package sistemaDeNotificacionDeVuelos;

public interface ISujetoVuelo {
    void registrarObservador(IObservadorVuelo observador);
    void eliminarObservador(IObservadorVuelo observador);
    void notificarObservador();
}
