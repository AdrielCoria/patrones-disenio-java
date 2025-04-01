package procesoDeConstruccionDeCasa;

public class MainConstruccion {
    public static void main(String[] args) {
        System.out.println("=== Construyendo Casa de Madera ===");
        ConstruccionCasa casaMadera = new CasaMadera();
        casaMadera.construir();

        System.out.println("\n=== Construyendo Casa de Ladrillo ===");
        ConstruccionCasa casaLadrillo = new CasaLadrillo();
        casaLadrillo.construir();

        System.out.println("\n=== Construyendo Casa Prefabricada ===");
        ConstruccionCasa casaPrefab = new CasaPrefabricada();
        casaPrefab.construir();
    }
}
