package SistemaDeReservaDeVuelos;

public interface IAdaptadorReserva {
    boolean buscarVuelos(String origen, String destino, String fecha);
    boolean reservarVuelo(String idVuelo, int pasajeros);
}
