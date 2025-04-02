package sistemaDeDepartamentosYEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Organizacion implements IAgregado {

    private List<Departamento> departamentos = new ArrayList<>();

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorDepartamento(this.departamentos);
    }
}
