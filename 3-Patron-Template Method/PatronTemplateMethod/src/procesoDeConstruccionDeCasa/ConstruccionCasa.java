package procesoDeConstruccionDeCasa;

abstract class ConstruccionCasa {

    // Template Method
    public final void construir() {
        prepararTerreno();
        colocarCimientos();
        construirParedes();
        instalarTecho();
        hacerAcabados();
        if (necesitaInspeccion()) {
            realizarInspeccion();
        }
    }

    // Métodos comunes
    private void prepararTerreno() {
        System.out.println("Preparando el terreno...");
    }

    private void realizarInspeccion() {
        System.out.println("Realizando inspección final");
    }

    // Métodos abstractos
    protected abstract void colocarCimientos();

    protected abstract void construirParedes();

    protected abstract void instalarTecho();

    // Métodos opcionales (hooks)
    protected void hacerAcabados() {
        System.out.println("Haciendo acabados estándar");
    }

    protected boolean necesitaInspeccion() {
        return true;
    }
}
