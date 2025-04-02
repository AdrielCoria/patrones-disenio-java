package historialCambioEstado;

import java.util.ArrayList;
import java.util.List;

public class GestorHistorial {
    private List<CambioEstado> historial;

    public GestorHistorial() {
        this.historial = new ArrayList<>();
    }

    public void registrarNuevoEstado(Estado estado) {
        CambioEstado cambio = CambioEstado.getInstancia();
        cambio.registrarCambio(estado);
        historial.add(cambio);
    }

    public void finalizarEstadoActual() {
        if (!historial.isEmpty()) {
            CambioEstado ultimo = historial.get(historial.size() - 1);
            ultimo.finalizarEstado();
        }
    }

    public void imprimirHistorial() {
        System.out.println("\n=== Historial de Cambios ===");
        for (CambioEstado cambio : historial) {
            System.out.println(cambio);
        }
    }

}
