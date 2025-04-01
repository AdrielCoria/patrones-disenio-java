package sistemaDeAlertaMeteorologica;

public class SistemaEmergencias implements ObservadorClima {

    @Override
    public void actualizar(String alerta, String ubicacion, String severidad) {
        if (severidad.equals("Alta")) {
            System.out.printf("EMERGENCIA en %s: %s. Activando protocolos.\n", ubicacion, alerta);
        }
    }
}
