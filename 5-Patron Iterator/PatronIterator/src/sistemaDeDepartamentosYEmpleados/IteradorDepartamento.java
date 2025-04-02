package sistemaDeDepartamentosYEmpleados;

import java.util.List;

public class IteradorDepartamento implements Iterador {

    private List<Departamento> departamentos;
    private int posicion;

    public IteradorDepartamento(List<Departamento> departamentos) {
        this.departamentos = departamentos;
        this.posicion = 0;
    }

    @Override
    public Object elementoActual() {
        return departamentos.get(posicion);
    }

    @Override
    public boolean haFinalizado() {
        return posicion >= departamentos.size();
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
