package projects.sistemaDeAnalisisDeDatos;

public class MainAnalisis {
    public static void main(String[] args) {
        AnalizadorDatos analizador = new AnalizadorDatos();

        double[] datos = {1.2, 2.3, 1.2, 3.4, 2.1, 1.2, 4.5, 3.4};

        System.out.println("=== Sistema de Análisis de Datos ===");
        System.out.println("Datos: " + java.util.Arrays.toString(datos));

        // Probar diferentes estrategias
        analizador.setEstrategia(new AnalisisPromedio());
        analizador.analizar(datos);

        analizador.setEstrategia(new AnalisisMediana());
        analizador.analizar(datos);

        analizador.setEstrategia(new AnalisisModa());
        analizador.analizar(datos);
    }
}
