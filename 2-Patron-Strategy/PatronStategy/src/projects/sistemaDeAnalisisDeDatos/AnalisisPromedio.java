package projects.sistemaDeAnalisisDeDatos;

public class AnalisisPromedio implements EstrategiaAnalisis{

    @Override
    public void analizarDatos(double[] datos) {
        double suma = 0;
        for(double d: datos) suma+=d;
        double promedio = suma / datos.length;
        System.out.printf("El promedio es: %.2f\n", promedio);
    }
}
