package sistemaDeGestionDeEmpleados;

public class Empleado {

    private String nombre;
    private String departamento;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String departamento, String puesto, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Perfil:" + puesto + " (" + departamento + ") - Salario $" + salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
}
