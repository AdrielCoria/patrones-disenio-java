package sistemaDeDepartamentosYEmpleados;

public class MainOrganizacion {
    public static void main(String[] args) {

        Organizacion organizacion = new Organizacion();


        Departamento tecnologia = new Departamento("Tecnología");
        tecnologia.agregarEmpleado(new Empleado("Adriel Coria", "Ingeniero de Software"));
        tecnologia.agregarEmpleado(new Empleado("Santiago Moyano", "Ingeniero de Software"));
        tecnologia.agregarEmpleado(new Empleado("Bruno Almiron", "Desarrollador Backend"));


        Departamento marketing = new Departamento("Marketing");
        marketing.agregarEmpleado(new Empleado("Maria Gonzalez", "UX/UI"));
        marketing.agregarEmpleado(new Empleado("Fernando Marcos", "Publicidad"));

        organizacion.agregarDepartamento(tecnologia);
        organizacion.agregarDepartamento(marketing);


        // Recorrer la estructura anidada
        System.out.println("=== Estructura Completa de la Organización ===");

        Iterador iteradorDepartamento = organizacion.crearIterador();
        while (!iteradorDepartamento.haFinalizado()) {
            Departamento depto = (Departamento) iteradorDepartamento.elementoActual();
            System.out.println("\nDepartamento: " + depto);

            // Iteramos cada uno de los empleados de un departamento
            Iterador iteradorEmpleado = depto.crearIterador();
            System.out.println("Empleado: ");

            while (!iteradorEmpleado.haFinalizado()) {
                System.out.println("- " + iteradorEmpleado.elementoActual());
                iteradorEmpleado.siguiente();
            }

            iteradorDepartamento.siguiente();

        }

        // Ejemplo especifico para la busqueda de todos los "Ingeniero de Software" de una organización.
        System.out.println("\n=== Buscar todos los Ingeniero de Software ===");
        iteradorDepartamento.primero();
        while (!iteradorDepartamento.haFinalizado()) {
            Departamento deptoFind = (Departamento) iteradorDepartamento.elementoActual();
            Iterador iteradorEmpleadoFind = deptoFind.crearIterador();

            while (!iteradorEmpleadoFind.haFinalizado()){
                Empleado emplFind = (Empleado) iteradorEmpleadoFind.elementoActual();
                if(emplFind.toString().contains("Ingeniero de Software")){
                    System.out.println(emplFind + " en " + deptoFind);
                }
                iteradorEmpleadoFind.siguiente();
            }

            iteradorDepartamento.siguiente();
        }
    }
}
