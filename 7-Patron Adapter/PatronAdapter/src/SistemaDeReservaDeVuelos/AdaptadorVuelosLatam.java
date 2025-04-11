package SistemaDeReservaDeVuelos;

public class AdaptadorVuelosLatam implements IAdaptadorReserva{
    private ServicioAereoLatam servicioLatam;

    public AdaptadorVuelosLatam() {
        this.servicioLatam = new ServicioAereoLatam();
    }

    @Override
    public boolean buscarVuelos(String origen, String destino, String fecha) {
        // Adaptar parámetros
        String ciudadOrigen = convertirCiudad(origen);
        String ciudadDestino = convertirCiudad(destino);
        String fechaSalida = convertirFecha(fecha);

        // Usar servicio externo
        String idVuelo = servicioLatam.buscarVuelosLatam(ciudadOrigen, ciudadDestino, fechaSalida);
        return idVuelo != null;
    }

    @Override
    public boolean reservarVuelo(String idVuelo, int pasajeros) {
        // Adaptar código
        String codigoLatam = idVuelo.replace("ADP-", "LATAM-");

        // Usar servicio externo
        return servicioLatam.confirmarReservaLatam(codigoLatam, pasajeros);
    }

    // Métodos de ayuda para adaptación
    private String convertirCiudad(String ciudad) {
        return ciudad.toUpperCase();
    }

    private String convertirFecha(String fecha) {
        return fecha.replace("/", "-"); // Formato LATAM usa guiones
    }
}
