package configuracionGlobal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Configuración Global ===");

        // Obtener instancia
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();

        // Mostrar configuración inicial
        System.out.println("\nConfiguración inicial:");
        System.out.println("Idioma: " + config.getIdioma());
        System.out.println("Zona Horaria: " + config.getZonaHoraria());
        System.out.println("Tema: " + config.getTema());

        // Cambiar configuración
        config.setIdioma("inglés");
        config.setZonaHoraria("UTC-5");

        // Obtener la misma instancia en otro módulo
        ConfiguracionGlobal config2 = ConfiguracionGlobal.getInstancia();

        System.out.println("\nVerificando que es la misma instancia:");
        System.out.println("Idioma en config2: " + config2.getIdioma());
        System.out.println("¿Misma instancia? " + (config == config2));
    }
}
