package projects.sistemaDeAnalisisDeDatos;

import java.util.Arrays;

public class AnalisisMediana implements EstrategiaAnalisis {
    @Override
    public void analizarDatos(double[] datos) {
        Arrays.sort(datos);
        double mediana;

        if (datos.length % 2 == 0) {
            mediana = (datos[datos.length / 2] + datos[datos.length / 2 - 1]) / 2;
        } else {
            mediana = datos[datos.length / 2];
        }
        System.out.printf("La mediana es: %.2f\n", mediana);

    }
}
