package sistemaDeDepartamentosYEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements IAgregado {

    private String nombre;
    private List<Empleado> empleados = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }


    @Override
    public Iterador crearIterador() {
        return new IteradorEmpleado(this.empleados);
    }


    @Override
    public String toString() {
        return "Departamento: " + this.nombre;
    }
}
