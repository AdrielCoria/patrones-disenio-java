package sistemaDeAlertaMeteorologica;

public class MediosComunicacion implements ObservadorClima {
    @Override
    public void actualizar(String alerta, String ubicacion, String severidad) {
        System.out.printf("NOTICIA: Alerta meteorológica en %s - %s\n", ubicacion, alerta);
    }
}
