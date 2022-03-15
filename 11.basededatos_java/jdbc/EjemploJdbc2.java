package cl.miguelramos.java.jdbc;

import java.sql.*;

public class EjemploJdbc2 {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/java_database?serverTimezone=America/Santiago";
    // ?serverTimezone=UTC
    // serverTimezone=America/Bogota
    String username = "root";
    String password = "academyjava";

    try(Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet resultado  = stmt.executeQuery("SELECT * FROM productos"))
    {
      while(resultado.next()) {
        System.out.print(resultado.getInt("id"));
        System.out.print(" | ");
        System.out.print(resultado.getString("nombre"));
        System.out.print(" | ");
        System.out.print(resultado.getInt("precio"));
        System.out.print(" | ");
        System.out.println(resultado.getDate("fecha_registro"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
