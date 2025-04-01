package projects.sistemaDeAnalisisDeDatos;

public class AnalizadorDatos {

    private EstrategiaAnalisis estrategia;

    public void setEstrategia(EstrategiaAnalisis estrategia) {
        this.estrategia = estrategia;
    }

    public void analizar(double[] datos) {
        if(estrategia == null){
            System.out.println("No se ha seleccionado una estrategía de análisis.");
            return;
        }
        estrategia.analizarDatos(datos);
    }
}
