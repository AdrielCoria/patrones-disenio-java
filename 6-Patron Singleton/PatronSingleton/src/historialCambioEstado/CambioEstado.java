package historialCambioEstado;

import java.util.Date;

public class CambioEstado {

    private static CambioEstado instancia;

    private Date fechaInicio;
    private Date fechaFin;
    private Estado estado;

    public CambioEstado(Estado estado, Date fechaInicio) {
        this.estado = estado;
        this.fechaInicio = fechaInicio;
    }

    private CambioEstado() {
    }

    // Método para obtener la instancia única
    public static synchronized CambioEstado getInstancia(){
        if(instancia == null){
            instancia = new CambioEstado();
        }
        return instancia;
    }

    // Método para registrar un nuevo cambio
    public void registrarCambio(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        this.fechaInicio = new Date();
        this.fechaFin = null;
    }

    // Método para finalizar el estado actual
    public void finalizarEstado() {
        this.fechaFin = new Date();
    }


    @Override
    public String toString() {
        return "Estado: " + estado.getNombre() +
                " - Inicio: " + fechaInicio +
                (fechaFin != null ? " - Fin: " + fechaFin : "");
    }

    // Getters
    public Estado getEstado() { return estado; }
    public Date getFechaInicio() { return fechaInicio; }
    public Date getFechaFin() { return fechaFin; }

}
