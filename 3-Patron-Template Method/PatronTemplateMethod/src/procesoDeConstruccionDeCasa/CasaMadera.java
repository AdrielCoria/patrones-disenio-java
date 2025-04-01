package procesoDeConstruccionDeCasa;

public class CasaMadera extends ConstruccionCasa {
    @Override
    protected void colocarCimientos() {
        System.out.println("Colocando cimientos de madera tratada");
    }

    @Override
    protected void construirParedes() {
        System.out.println("Construyendo paredes de troncos");
    }

    @Override
    protected void instalarTecho() {
        System.out.println("Instalando techo de tejas de madera");
    }

    protected void hacerAcabados() {
        System.out.println("Barnizando la madera");
    }
}
