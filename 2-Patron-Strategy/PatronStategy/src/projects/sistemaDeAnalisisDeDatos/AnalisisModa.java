package projects.sistemaDeAnalisisDeDatos;

import java.util.HashMap;
import java.util.Map;

public class AnalisisModa implements EstrategiaAnalisis {
    @Override
    public void analizarDatos(double[] datos) {

        Map<Double, Integer> frecuencia = new HashMap<>();

        // frecuencia = { 5.5=0 , }
        for (double d : datos) {
            frecuencia.put(d, frecuencia.getOrDefault(d, 0) + 1);
        }

        double moda = datos[0];
        int maxFrecuencia = 1;

        for(Map.Entry<Double, Integer> entry: frecuencia.entrySet()){
            if(entry.getValue() > maxFrecuencia){
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        System.out.printf("La moda es: %.2f (aparece %d veces)\n", moda, maxFrecuencia);

    }
}
