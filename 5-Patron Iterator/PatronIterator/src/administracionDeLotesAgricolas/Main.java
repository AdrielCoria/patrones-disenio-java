package administracionDeLotesAgricolas;

public class Main {
    public static void main(String[] args) {
        String[] lotes = {"Lote 1 - Trigo", "Lote 2 - Soja", "Lote 3 - Maíz", "Lote 4 - Girasol"};

        Lotes listaLotes = new Lotes(lotes);
        Iterador iterador = listaLotes.crearIterador();

        System.out.println("=== Recorrido de Lotes Agrícolas ===");
        while (!iterador.haFinalizado()){
            System.out.println(iterador.elementoActual());
            iterador.siguiente();
        }

        System.out.println("\n=== Reinicio del Iterador ===");
        iterador.primero();
        System.out.println("Primer elemento: " + iterador.elementoActual());
        iterador.siguiente();
        System.out.println("Segundo elemento: " + iterador.elementoActual());
    }
}
