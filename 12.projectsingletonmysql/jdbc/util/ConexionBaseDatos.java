package cl.miguelramos.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
  private static String url = "jdbc:mysql://localhost/java_curso?serverTimezone=UTC";
  private static String username = "root";
  private static String password = "academyjava";

  // la unica conexión hacia la base de datos
  private static Connection connection;

  public static Connection getInstance() throws SQLException {
    if(connection == null) {
      connection = DriverManager.getConnection(url, username, password);
    }
    return connection;
  }

}
