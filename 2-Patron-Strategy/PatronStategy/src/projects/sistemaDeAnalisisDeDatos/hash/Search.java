package projects.sistemaDeAnalisisDeDatos.hash;

import java.util.HashMap;
import java.util.Map;

public class Search {

    public static void main(String[] args) {
        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("Adriel", "admin");
        usuarios.put("Bruno", "user");

        String rolAdriel = usuarios.getOrDefault("Luis", "guess");
        String rolBruno = usuarios.getOrDefault("Bruno", "user");

        System.out.println(rolAdriel);
        System.out.println(rolBruno);

    }
}
