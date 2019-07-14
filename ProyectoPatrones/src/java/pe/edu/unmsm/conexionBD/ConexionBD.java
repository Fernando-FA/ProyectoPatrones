package pe.edu.unmsm.conexionBD;

import java.sql.*;
import static pe.edu.unmsm.Config.ConfigBD.getNAME_BD;
import static pe.edu.unmsm.Config.ConfigBD.getPASSWORD_BD;
import static pe.edu.unmsm.Config.ConfigBD.getUSER_BD;

public class ConexionBD {

    private static Connection _connection;
    private String driver;
    private String url;

    private ConexionBD() {
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            _connection = DriverManager.getConnection(url
                    + getNAME_BD(), getUSER_BD(), getPASSWORD_BD());
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }

    public static Connection getConexion() {
        if (_connection == null) {
            new ConexionBD();
        }
        return _connection;
    }

    public static void disconnect() {
        System.out.println("Closing database: [" + _connection + "] OK");
        if (_connection != null) {
            try {
                // System.out.println("Desconectado de " + bd + " OK");
                _connection.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
}
