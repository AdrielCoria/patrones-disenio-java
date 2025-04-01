package projects.sistemaDeAnalisisDeDatos.hash;

import java.util.HashMap;
import java.util.Map;

public class Word {
    public static void main(String[] args) {


        Map<String, Integer> conteoPalabra = new HashMap<>();

        String palabra = "adriel";

//        // Si la palabra no existe, inicializamos en 1, sino incrementamos
//        if(conteoPalabra.containsValue(palabra)){
//            conteoPalabra.put(palabra, conteoPalabra.get(palabra) + 1);
//        }else{
//            conteoPalabra.put(palabra, 1);
//        }


        conteoPalabra.put(palabra, conteoPalabra.getOrDefault(palabra, 0) + 1);



    }
}
