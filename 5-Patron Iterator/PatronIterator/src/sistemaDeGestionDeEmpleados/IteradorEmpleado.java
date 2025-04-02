package sistemaDeGestionDeEmpleados;

public class IteradorEmpleado implements Iterador {

    private Empleado[] empleados;
    private int posicion;

    public IteradorEmpleado(Empleado[] empleados) {
        this.empleados = empleados;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return empleados[posicion];
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= empleados.length;
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public void siguiente() {
        if(!haFinalizado()) posicion++;
    }

    @Override
    public boolean cumpleFiltro(String filtro) {
        Empleado empleado = (Empleado)elementoActual();
        return empleado.getNombre().toLowerCase().contains(filtro.toLowerCase()) ||
                empleado.getDepartamento().equalsIgnoreCase(filtro) ||
                empleado.getPuesto().equalsIgnoreCase(filtro);
    }

    // Método adicional para filtrar por departamento
    public void filtrarPorDepartamento(String depto) {
        primero();
        System.out.println("\nEmpleados del departamento " + depto + ":");
        while (!haFinalizado()) {
            if (cumpleFiltro(depto)) {
                System.out.println("- " + elementoActual());
            }
            siguiente();
        }
    }
}
