package configuracionGlobal;

public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia;
    private String idioma;
    private String zonaHoraria;
    private String tema;

    private ConfiguracionGlobal() {
        // Valores por defecto
        this.idioma = "Español";
        this.zonaHoraria = "UTC-3";
        this.tema = "Claro";
    }

    public static synchronized ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
