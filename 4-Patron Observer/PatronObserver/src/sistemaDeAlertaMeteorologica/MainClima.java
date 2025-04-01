package sistemaDeAlertaMeteorologica;

public class MainClima {
    public static void main(String[] args) {
        ServicioMeteorologico servicio = new ServicioMeteorologico();

        // Crear observadores
        UsuarioApp usuario1 = new UsuarioApp("Laura", "Buenos Aires");
        UsuarioApp usuario2 = new UsuarioApp("Pedro", "Córdoba");
        SistemaEmergencias emergencias = new SistemaEmergencias();
        MediosComunicacion medios = new MediosComunicacion();

        // Registrar observadores
        servicio.registrarObservador(usuario1);
        servicio.registrarObservador(usuario2);
        servicio.registrarObservador(emergencias);
        servicio.registrarObservador(medios);

        System.out.println("=== Sistema de Alerta Meteorológica ===");

        // Emitir alertas
        servicio.setAlerta("Tormenta eléctrica", "Buenos Aires", "Media");
        servicio.setAlerta("Ola de calor", "Córdoba", "Alta"); // Debe activar emergencias
        servicio.setAlerta("Nevadas intensas", "Mendoza", "Alta");

        // Eliminar un observador
        servicio.eliminarObservador(medios);
        System.out.println("\nMedios de comunicación ya no recibirán alertas\n");

        servicio.setAlerta("Vientos fuertes", "Buenos Aires", "Baja");
    }
}
