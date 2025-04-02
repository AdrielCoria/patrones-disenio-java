package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static ConexionBD instancia;
    private Connection conexion;
    private String url = "jdbc:mysql://localhost:3306/mi_bd";
    private String usuario = "admin";
    private String contrasena = "password";

    private ConexionBD() {
        try {
            this.conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                instancia = null; // Permitir crear nueva instancia si se necesita
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
