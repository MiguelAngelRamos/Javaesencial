package cl.miguelramos.java.jdbc;

import cl.miguelramos.java.jdbc.model.Producto;
import cl.miguelramos.java.jdbc.repository.IRepository;
import cl.miguelramos.java.jdbc.repository.ProductoRepositoryImpl;
import cl.miguelramos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class MainSave {
  public static void main(String[] args) {
    try(Connection conn = ConexionBaseDatos.getInstance()) {
      IRepository<Producto> repository = new ProductoRepositoryImpl();
      System.out.println("=========== Listando Productos ===========");
      // repository.listar().forEach(p-> System.out.println(p));
      repository.listar().forEach(System.out::println);
      System.out.println("=========== Crear un Producto por Id ===========");
      Producto producto = new Producto();
      producto.setNombre("Macbook Pro");
      producto.setPrecio(500);
      producto.setFechaRegistro(new Date());
      repository.guardar(producto);
      System.out.println("Producto creado con éxito");
      repository.listar().forEach(System.out::println);
      System.out.println("======= Fin de la Aplicación ==============");
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}
