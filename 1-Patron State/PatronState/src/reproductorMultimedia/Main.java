package reproductorMultimedia;

public class Main {
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();

        System.out.println("=== Control de Reproductor Multimedia");
        System.out.println("Estado Inicial: " + reproductor.getEstadoActual());

        // Secuencia de prueba
        reproductor.reproducir();
        reproductor.pausar();
        reproductor.reproducir();
        reproductor.detener();
        reproductor.pausar();

    }
}
