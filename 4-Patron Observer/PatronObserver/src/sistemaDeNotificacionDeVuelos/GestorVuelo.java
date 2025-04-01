package sistemaDeNotificacionDeVuelos;

import java.util.ArrayList;
import java.util.List;

public class GestorVuelo implements ISujetoVuelo {

    private List<IObservadorVuelo> observadores = new ArrayList<>();
    private String numeroVuelo;
    private String estado;
    private String hora;

    public void cambiarEstadoVuelo(String nuevoEstado, String nuevaHora) {

        // Implementamos el cambio del estado y modificamos la hora
        this.estado = nuevoEstado;
        this.hora = nuevaHora;

        // Notificamos a todos los observadores suscriptos
        notificarObservador();
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    @Override
    public void registrarObservador(IObservadorVuelo observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(IObservadorVuelo observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservador() {
        for (IObservadorVuelo observador : observadores) {
            observador.actulizar(numeroVuelo, estado, hora);
        }
    }
}
