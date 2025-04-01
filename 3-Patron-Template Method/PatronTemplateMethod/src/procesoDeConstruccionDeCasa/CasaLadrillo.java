package procesoDeConstruccionDeCasa;

public class CasaLadrillo extends ConstruccionCasa {
    @Override
    protected void colocarCimientos() {
        System.out.println("Colocando cimientos de hormigón");
    }

    @Override
    protected void construirParedes() {
        System.out.println("Construyendo paredes de ladrillo");
    }

    @Override
    protected void instalarTecho() {
        System.out.println("Instalando techo de tejas cerámicas");
    }

    protected boolean necesitaInspeccion() {
        return false; // Las casas de ladrillo no necesitan inspección adicional
    }
}
