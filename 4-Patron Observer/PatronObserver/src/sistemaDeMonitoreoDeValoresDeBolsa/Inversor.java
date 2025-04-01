package sistemaDeMonitoreoDeValoresDeBolsa;

public class Inversor implements IObservadorBolsa{

    private String nombre;
    private String simboloInteres;
    private double precioLimite;

    public Inversor(String nombre, String simboloInteres, double precioLimite) {
        this.nombre = nombre;
        this.simboloInteres = simboloInteres;
        this.precioLimite = precioLimite;
    }

    @Override
    public void actualizar(String simbolo, double precio) {
        if (simbolo.equals(simboloInteres) && precio >= precioLimite) {
            System.out.printf("Alerta para %s: %s alcanzó $%.2f\n", nombre, simbolo, precio);
        }
    }
}
