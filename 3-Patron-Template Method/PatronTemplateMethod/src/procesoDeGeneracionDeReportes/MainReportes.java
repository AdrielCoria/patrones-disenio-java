package procesoDeGeneracionDeReportes;

import java.util.List;

public class MainReportes {
    public static void main(String[] args) {
        List<String> datos = List.of("Dato 1", "Dato 2", "Dato 3", "Dato 4");

        System.out.println("=== Generando Reporte PDF ===");
        GeneradorReportes pdf = new GeneradorPDF();
        pdf.generarReporte(datos);

        System.out.println("\n=== Generando Reporte Excel ===");
        GeneradorReportes excel = new GeneradorExcel();
        excel.generarReporte(datos);

        System.out.println("\n=== Generando Reporte HTML ===");
        GeneradorReportes html = new GeneradorHTML();
        html.generarReporte(datos);
    }
}
