package sistemaDeAlertaMeteorologica;

public class UsuarioApp implements ObservadorClima {

    private String nombre;
    private String ciudadInteres;

    public UsuarioApp(String nombre, String ciudadInteres) {
        this.nombre = nombre;
        this.ciudadInteres = ciudadInteres;
    }

    @Override
    public void actualizar(String alerta, String ubicacion, String severidad) {
        if (ubicacion.equalsIgnoreCase(ciudadInteres)) {
            System.out.printf("Alerta para %s en %s: %s (Severidad: %s)\n", nombre, ubicacion, alerta, severidad);
        }
    }
}
