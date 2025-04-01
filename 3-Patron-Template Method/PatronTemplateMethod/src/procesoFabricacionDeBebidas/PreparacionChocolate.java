package procesoFabricacionDeBebidas;

public class PreparacionChocolate extends PreparacionBebida {
    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando cacao en polvo");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando canela");
    }

    protected boolean clienteQuiereEndulzante() {
        // El chocolate ya es dulce, no necesita más endulzante
        return false;
    }
}
