package sistemaDeDepartamentosYEmpleados;

public class Empleado {

    private String nombre;
    private String perfil;

    public Empleado(String nombre, String perfil) {
        this.nombre = nombre;
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Pefil: "  + this.perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPerfil() {
        return perfil;
    }
}
