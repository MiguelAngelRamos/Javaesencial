package cl.miguelramos.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java_database?serverTimezone=America/Santiago";
    // ?serverTimezone=UTC
    // serverTimezone=America/Bogota
    String username = "root";
    String password = "academyjava";

    try {
      Connection conn = DriverManager.getConnection(url, username, password);
      Statement stmt = conn.createStatement();
      ResultSet resultado  = stmt.executeQuery("SELECT * FROM productos");

      while(resultado.next()) {
        System.out.println(resultado.getString("nombre"));
        System.out.println(resultado.getInt("precio"));
      }
      resultado.close();
      stmt.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
