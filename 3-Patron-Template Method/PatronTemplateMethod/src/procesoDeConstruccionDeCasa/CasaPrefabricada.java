package procesoDeConstruccionDeCasa;

public class CasaPrefabricada extends ConstruccionCasa {
    @Override
    protected void colocarCimientos() {
        System.out.println("Colocando base prefabricada");
    }

    @Override
    protected void construirParedes() {
        System.out.println("Ensamblando paneles prefabricados");
    }

    @Override
    protected void instalarTecho() {
        System.out.println("Colocando techo prefabricado");
    }

    protected void hacerAcabados() {
        System.out.println("Ajustando módulos prefabricados");
    }
}
