package cl.miguelramos.java.jdbc.repository;

import java.util.List;

// Interfaz genérica
public interface IRepository<T> {
  // findAll();
  List<T> listar();
  // findById()
  T porId(Long id);
  // save y update (actualizar)
  void guardar(T t);
  // remove
  void eliminar(Long id);
}
