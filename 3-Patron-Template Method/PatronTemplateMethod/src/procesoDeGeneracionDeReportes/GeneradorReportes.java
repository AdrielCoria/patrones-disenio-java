package procesoDeGeneracionDeReportes;

import java.util.List;

public abstract class GeneradorReportes {
    // Template Method
    public final void generarReporte(List<String> datos) {
        validarDatos(datos);
        String cabecera = crearCabecera();
        String cuerpo = crearCuerpo(datos);
        String pie = crearPie();
        String reporteCompleto = formatearReporte(cabecera, cuerpo, pie);
        guardarReporte(reporteCompleto);
        if (necesitaEnvio()) {
            enviarReporte(reporteCompleto);
        }
    }

    // Método común
    private void validarDatos(List<String> datos) {
        if (datos == null || datos.isEmpty()) {
            throw new IllegalArgumentException("Datos no válidos");
        }
        System.out.println("Validación de datos exitosa");
    }

    // Métodos abstractos
    protected abstract String crearCabecera();

    protected abstract String crearCuerpo(List<String> datos);

    protected abstract String crearPie();

    protected abstract void guardarReporte(String reporte);

    // Métodos opcionales (hooks)
    protected String formatearReporte(String cabecera, String cuerpo, String pie) {
        return cabecera + "\n" + cuerpo + "\n" + pie;
    }

    protected boolean necesitaEnvio() {
        return false;
    }

    protected void enviarReporte(String reporte) {
        // Implementación por defecto vacía
    }
}
