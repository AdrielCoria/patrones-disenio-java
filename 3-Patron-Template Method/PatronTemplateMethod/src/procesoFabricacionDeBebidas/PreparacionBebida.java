package procesoFabricacionDeBebidas;

abstract class PreparacionBebida {

    // Template Method - define el esqueleto del algoritmo / Método Plantilla
    public final void preparar() {
        hervirAguar();
        agregarIngredientePrincipal();
        vertirEnTaza();
        agregarCondimentos();
        if (clienteQuiereEndulzante()) {
            agregarEndulzante();
        }
    }

    // Métodos concretos (implementación común)
    private void hervirAguar() {
        System.out.println("Hirviendo agua...");
    }

    private void vertirEnTaza() {
        System.out.println("Vertiendo en taza");
    }

    // Métodos abstractos (implementación específica)
    protected abstract void agregarIngredientePrincipal();

    protected abstract void agregarCondimentos();

    // Hook (método opcional que puede sobrescribirse)
    protected boolean clienteQuiereEndulzante() {
        return true;
    }

    protected void agregarEndulzante() {
        System.out.println("Agregando azucar");
    }

}
