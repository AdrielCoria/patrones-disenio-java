package sistemaDeMonitoreoDeValoresDeBolsa;

public interface IObservadorBolsa {
    void actualizar(String simbolo, double precio);
}
