package gestionConfiguracion;

public class MainConfiguracion {

    public static void main(String[] args) {

        // Obtener la instancia singleton
        GestorConfiguracion config = GestorConfiguracion.getInstancia();

        System.out.println("Configuracion Inicial");
        System.out.println("Servidor: " + config.getConfiguracionServidor());
        System.out.println("DB: " + config.getConfiguracionDB());

        // Modificar configuración
        config.setConfiguracionServidor("corp.adriel.com");

        // Obtener la misma instancia nuevamente
        GestorConfiguracion mismaConfig = GestorConfiguracion.getInstancia();
        System.out.println("\nConfiguración despues del cambio:");
        System.out.println("Servidor: " + config.getConfiguracionServidor());
        System.out.println("DB: " + config.getConfiguracionDB());


    }
}
