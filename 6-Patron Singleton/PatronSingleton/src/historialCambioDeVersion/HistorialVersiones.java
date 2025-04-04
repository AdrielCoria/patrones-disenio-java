package historialCambioDeVersion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialVersiones {
    private static HistorialVersiones instancia;
    private List<Version> historial = new ArrayList<>();

    private HistorialVersiones() {
        System.out.println("Historial de versiones inicializado");
    }

    public static synchronized HistorialVersiones getInstancia() {
        if (instancia == null) {
            instancia = new HistorialVersiones();
        }
        return instancia;
    }

    public void registrarVersion(String numero, String cambios) {
        Version nuevaVersion = new Version(numero, cambios, new Date());
        historial.add(nuevaVersion);
        System.out.println("Versión registrada: " + nuevaVersion);
    }

    public void mostrarHistorial() {
        System.out.println("\n=== Historial Completo ===");
        for (Version v : historial) {
            System.out.println(v);
        }
    }


}
