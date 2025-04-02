package gestionConfiguracion;

public class GestorConfiguracion {

    private static GestorConfiguracion instancia;
    private String configuracionServidor;
    private String configuracionDB;

    private GestorConfiguracion() {
        this.configuracionServidor = "servidor.produccion.com";
        this.configuracionDB = "jdbc:mysql://localhost:3306/app_db";
    }

    public static synchronized GestorConfiguracion getInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public String getConfiguracionServidor() {
        return configuracionServidor;
    }

    public void setConfiguracionServidor(String configuracionServidor) {
        this.configuracionServidor = configuracionServidor;
    }

    public String getConfiguracionDB() {
        return configuracionDB;
    }

    public void setConfiguracionDB(String configuracionDB) {
        this.configuracionDB = configuracionDB;
    }
}
