package loggerDeAplicacion;

public class MainLogger {
    public static void main(String[] args) {
        LoggerAplicacion logger = LoggerAplicacion.getInstancia();

        logger.log("Aplicación iniciada");
        logger.log("Cargando configuración del sistema");

        // En otra parte del sistema
        LoggerAplicacion mismoLogger = LoggerAplicacion.getInstancia();
        mismoLogger.log("Procesando datos de usuario");

        // Al final de la aplicación
        logger.cerrar();
    }
}
