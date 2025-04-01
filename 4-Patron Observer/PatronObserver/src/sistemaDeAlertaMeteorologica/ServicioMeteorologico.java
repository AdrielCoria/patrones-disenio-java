package sistemaDeAlertaMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class ServicioMeteorologico implements SujetoClima{

    private List<ObservadorClima> observadores = new ArrayList<>();
    private String alerta;
    private String ubicacion;
    private String severidad;


    public void setAlerta(String alerta, String ubicacion, String severidad) {
        this.alerta = alerta;
        this.ubicacion = ubicacion;
        this.severidad = severidad;

        notificarObservadores();
    }

    @Override
    public void registrarObservador(ObservadorClima observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(ObservadorClima observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObservadores() {
        for(ObservadorClima observador: observadores){
            observador.actualizar(alerta, ubicacion, severidad);
        }
    }
}
