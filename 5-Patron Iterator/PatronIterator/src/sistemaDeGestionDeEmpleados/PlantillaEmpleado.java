package sistemaDeGestionDeEmpleados;

public class PlantillaEmpleado implements IAgregado{

    private Empleado[] empleados;

    public PlantillaEmpleado(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorEmpleado(this.empleados);
    }
}
