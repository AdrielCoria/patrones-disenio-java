package procesoDeGeneracionDeReportes;

import java.util.List;

public class GeneradorHTML extends GeneradorReportes {

    @Override
    protected String crearCabecera() {
        return "<html><head><title>Report</title></head><body><h1>Report</h1><ul>";
    }

    @Override
    protected String crearCuerpo(List<String> datos) {
        StringBuilder cuerpo = new StringBuilder();
        for (String dato : datos) {
            cuerpo.append("<li>").append(dato).append("</li>");
        }
        return cuerpo.toString();
    }

    @Override
    protected String crearPie() {
        return "</ul></body></html>";
    }

    @Override
    protected void guardarReporte(String reporte) {
        System.out.println("Guardando reporte en formato HTML...");
        System.out.println(reporte);
        System.out.println("Reporte HTML guardado exitosamente");
    }
}
