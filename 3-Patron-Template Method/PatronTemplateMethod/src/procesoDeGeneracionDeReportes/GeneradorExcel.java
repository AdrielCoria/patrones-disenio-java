package procesoDeGeneracionDeReportes;

import java.util.List;

public class GeneradorExcel extends GeneradorReportes {
    @Override
    protected String crearCabecera() {
        return "Excel Report Header\n------------------";
    }

    @Override
    protected String crearCuerpo(List<String> datos) {
        StringBuilder cuerpo = new StringBuilder();
        int i = 1;
        for (String dato : datos) {
            cuerpo.append(i++).append("\t").append(dato).append("\n");
        }
        return cuerpo.toString();
    }

    @Override
    protected String crearPie() {
        return "------------------\nExcel Report Footer";
    }

    @Override
    protected void guardarReporte(String reporte) {
        System.out.println("Guardando reporte en formato Excel...");
        System.out.println(reporte);
        System.out.println("Reporte Excel guardado exitosamente");
    }

    protected String formatearReporte(String cabecera, String cuerpo, String pie) {
        return cabecera + "\n" + cuerpo.replace("\n", "\t\n") + "\n" + pie;
    }
}
