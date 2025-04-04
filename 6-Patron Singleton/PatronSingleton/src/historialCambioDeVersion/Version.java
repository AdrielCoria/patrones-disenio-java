package historialCambioDeVersion;

import java.util.Date;

public class Version {
    String numero;
    String cambios;
    Date fecha;

    public Version(String numero, String cambios, Date fecha) {
        this.numero = numero;
        this.cambios = cambios;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "[v" + numero + "] " + fecha + "\n   " + cambios + "\n";
    }
}
