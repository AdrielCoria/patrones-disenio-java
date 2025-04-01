package sistemaDeMonitoreoDeValoresDeBolsa;

import java.util.ArrayList;
import java.util.List;

public class BolsaValores implements ISujetoBolsa{

    private List<IObservadorBolsa> observadores = new ArrayList<>();
    private String simbolo;
    private double precio;

    public void setPrecio(String simbolo, double nuevoPrecio){
        this.simbolo = simbolo;
        this.precio = nuevoPrecio;


        notificarObservadores();
    }

    @Override
    public void registrarObservador(IObservadorBolsa observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(IObservadorBolsa observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for(IObservadorBolsa observador: observadores){
            observador.actualizar(simbolo, precio);
        }
    }
}
