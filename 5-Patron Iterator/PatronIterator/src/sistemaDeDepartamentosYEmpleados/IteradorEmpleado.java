package sistemaDeDepartamentosYEmpleados;

import java.util.List;

public class IteradorEmpleado implements Iterador {

    private List<Empleado> empleados;
    private int posicion;

    public IteradorEmpleado(List<Empleado> empleados) {
        this.empleados = empleados;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return empleados.get(posicion);
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= empleados.size();
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public void siguiente() {
        if (!haFinalizado()) posicion++;
    }
}
