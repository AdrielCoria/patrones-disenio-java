package sistemaDeMonitoreoDeValoresDeBolsa;

public interface ISujetoBolsa {

    void registrarObservador(IObservadorBolsa observador);

    void eliminarObservador(IObservadorBolsa observador);

    void notificarObservadores();
}
