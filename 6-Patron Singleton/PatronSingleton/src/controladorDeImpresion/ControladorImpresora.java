package controladorDeImpresion;

import java.util.LinkedList;
import java.util.Queue;

public class ControladorImpresora {

    private static ControladorImpresora instancia;
    private Queue<String> colaImpresion = new LinkedList<>();
    private boolean imprimiendo = false;

    private ControladorImpresora() {
        System.out.println("Controlador de impresora inicializado");
    }


    public static synchronized ControladorImpresora getInstancia() {
        if (instancia == null) {
            instancia = new ControladorImpresora();
        }
        return instancia;
    }

    public void agregarDocumento(String documento) {
        System.out.println("Agregando a cola: " + documento);
        colaImpresion.add(documento);
        if (!imprimiendo) {
            imprimirSiguiente();
        }
    }

    private void imprimirSiguiente() {
        if (!colaImpresion.isEmpty()) {
            imprimiendo = true;
            String doc = colaImpresion.poll();
            System.out.println("Imprimiendo: " + doc);
            // Simular tiempo de impresión
            new Thread(() -> {
                try {
                    Thread.sleep(2000); // Simula 2 segundos de impresión
                } catch (InterruptedException e) {}
                System.out.println("Finalizada impresión: " + doc);
                imprimiendo = false;
                imprimirSiguiente(); // Procesar siguiente documento
            }).start();
        }
    }



}
