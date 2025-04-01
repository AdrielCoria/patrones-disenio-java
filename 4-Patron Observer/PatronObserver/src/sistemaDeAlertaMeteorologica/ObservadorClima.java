package sistemaDeAlertaMeteorologica;

public interface ObservadorClima {

    void actualizar(String alerta, String ubicacion, String severidad);
}
