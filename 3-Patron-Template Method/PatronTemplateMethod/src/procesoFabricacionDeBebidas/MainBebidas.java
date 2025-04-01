package procesoFabricacionDeBebidas;

public class MainBebidas {
    public static void main(String[] args) {
        System.out.println("=== Preparando Café ===");
        PreparacionBebida cafe = new PreparacionCafe();
        cafe.preparar();

        System.out.println("\n=== Preparando Té ===");
        PreparacionBebida te = new PreparacionTe();
        te.preparar();

        System.out.println("\n=== Preparando Chocolate ===");
        PreparacionBebida chocolate = new PreparacionChocolate();
        chocolate.preparar();
    }
}
