package procesoFabricacionDeBebidas;

public class PreparacionCafe extends PreparacionBebida {
    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando café molido");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando crema");
    }

    protected boolean clienteQuiereEndulzante() {
        // Preguntar al cliente si quiere endulzante
        return true; // Simulamos que dice que sí
    }
}
