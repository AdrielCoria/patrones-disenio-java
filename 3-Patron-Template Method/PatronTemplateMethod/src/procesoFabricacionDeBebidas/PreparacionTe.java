package procesoFabricacionDeBebidas;

public class PreparacionTe extends PreparacionBebida {
    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando bolsita de té");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando limón");
    }

    protected void agregarEndulzante() {
        System.out.println("Agregando miel");
    }
}
