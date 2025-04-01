package sistemaDeMonitoreoDeValoresDeBolsa;

public class SistemaReportes implements IObservadorBolsa {
    @Override
    public void actualizar(String simbolo, double precio) {
        System.out.printf("Registro en sistema: %s = $%.2f\n", simbolo, precio);
        // Lógica para guardar en base de datos
    }
}
