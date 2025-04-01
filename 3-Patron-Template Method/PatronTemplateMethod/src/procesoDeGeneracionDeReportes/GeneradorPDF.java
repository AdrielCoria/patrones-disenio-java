package procesoDeGeneracionDeReportes;

import java.util.List;

public class GeneradorPDF extends GeneradorReportes {
    @Override
    protected String crearCabecera() {
        return "PDF Report Header\n=================";
    }

    @Override
    protected String crearCuerpo(List<String> datos) {
        StringBuilder cuerpo = new StringBuilder();
        for (String dato : datos) {
            cuerpo.append("- ").append(dato).append("\n");
        }
        return cuerpo.toString();
    }

    @Override
    protected String crearPie() {
        return "=================\nPDF Report Footer";
    }

    @Override
    protected void guardarReporte(String reporte) {
        System.out.println("Guardando reporte en formato PDF...");
        System.out.println(reporte);
        System.out.println("Reporte PDF guardado exitosamente");
    }

    protected boolean necesitaEnvio() {
        return true;
    }

    protected void enviarReporte(String reporte) {
        System.out.println("Enviando reporte PDF por email...");
    }
}
