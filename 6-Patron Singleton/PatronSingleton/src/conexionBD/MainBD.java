package conexionBD;

import java.sql.Connection;

public class MainBD {
    public static void main(String[] args) {
        ConexionBD conexion = ConexionBD.getInstancia();

        // Usar la conexión en diferentes partes
        Connection conn = conexion.getConexion();
        // ... operaciones con la conexión

        // En otra clase
        ConexionBD mismaConexion = ConexionBD.getInstancia();
        // Verificar que es la misma instancia
        System.out.println("¿Misma conexión? " + (conexion == mismaConexion));

        // Al finalizar
        conexion.cerrarConexion();
    }
}
