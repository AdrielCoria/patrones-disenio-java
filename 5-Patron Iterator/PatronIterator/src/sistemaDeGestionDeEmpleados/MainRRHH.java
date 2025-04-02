package sistemaDeGestionDeEmpleados;

public class MainRRHH {

    public static void main(String[] args) {
        Empleado[] empleados = {
                new Empleado("Juan Pérez", "Ventas", "Gerente", 5000.00),
                new Empleado("María Gómez", "TI", "Desarrollador", 4000.00),
                new Empleado("Carlos López", "Ventas", "Asesor", 3000.00),
                new Empleado("Ana Martínez", "TI", "DBA", 4500.00),
                new Empleado("Pedro Rodríguez", "Marketing", "Diseñador", 3500.00)
        };

        PlantillaEmpleado plantilla = new PlantillaEmpleado(empleados);
        IteradorEmpleado iterador = (IteradorEmpleado) plantilla.crearIterador();

        System.out.println("=== Todos los Empleados ===");
        while (!iterador.haFinalizado()) {
            System.out.println(iterador.elementoActual());
            iterador.siguiente();
        }


        // Casos de uso reales
        iterador.filtrarPorDepartamento("TI");

        System.out.println("\n=== Buscar por nombre o puesto ===");
        iterador.primero();
        while (!iterador.haFinalizado()) {
            if (iterador.cumpleFiltro("Gerente") || iterador.cumpleFiltro("Juan")) {
                System.out.println("- " + iterador.elementoActual());
            }
            iterador.siguiente();
        }


    }
}
