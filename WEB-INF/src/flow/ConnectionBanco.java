package flow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBanco {
    private static Connection conexion;
    /*private static String url = "jdbc:mysql://localhost:3306/gustavo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&zeroDateTimeBehavior=convertToNull&autoReconnect=true&failOverReadOnly=false&maxReconnects=10&connectTimeout=5000&socketTimeout=60000";
    private static String usuario = "root";
    private static String password = "";*/
    
    private static String url = "jdbc:mysql://db_estagio.mysql.dbaas.com.br:3306/db_estagio";
    private static String usuario = "db_estagio";
 	private static String password = "Est@g102023";
	

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return conexion;
    }

    public static void desconectar() {
        try {
            conexion.close();
            System.out.println("Desconexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al desconectar la base de datos: " + e.getMessage());
        }
    }
}
