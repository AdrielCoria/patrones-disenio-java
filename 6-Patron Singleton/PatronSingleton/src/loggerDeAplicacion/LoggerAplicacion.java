package loggerDeAplicacion;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerAplicacion {

    private static LoggerAplicacion instancia;
    private FileWriter archivoLog;

    private LoggerAplicacion() {
        try {
            this.archivoLog = new FileWriter("app.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized LoggerAplicacion getInstancia() {
        if (instancia == null) {
            instancia = new LoggerAplicacion();
        }
        return instancia;
    }

    public void log(String mensaje) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        try {
            archivoLog.write("[" + timestamp + "] " + mensaje + "\n");
            archivoLog.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cerrar el logger (importante para liberar recursos)
    public void cerrar() {
        try {
            archivoLog.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
