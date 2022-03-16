package cl.miguelramos.java.jdbc;

import cl.miguelramos.java.jdbc.model.Producto;
import cl.miguelramos.java.jdbc.repository.IRepository;
import cl.miguelramos.java.jdbc.repository.ProductoRepositoryImpl;
import cl.miguelramos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDelete {
  public static void main(String[] args) {
    try(Connection conn = ConexionBaseDatos.getInstance()) {
      IRepository<Producto> repository = new ProductoRepositoryImpl();
      System.out.println("=========== Listando Productos ===========");
      // repository.listar().forEach(p-> System.out.println(p));
      repository.listar().forEach(System.out::println);
      System.out.println("=========== Eliminar un Producto por Id ===========");
      // Eliminado el id producto con id 2
      repository.eliminar(2L);
      repository.listar().forEach(System.out::println);
      System.out.println("======= Fin de la Aplicación ==============");
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}
