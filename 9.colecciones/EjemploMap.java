package colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
  public static void main(String[] args) {
    // Map<K,V> llave(key) y valor (value)
    Map miMapa = new HashMap();
    miMapa.put("valor1", "Juan");
    miMapa.put("valor2", "Pedro");
    miMapa.put("valor3", "Maria");
    // Recuperamos información de mapa por medio de su llave
    System.out.println(miMapa.get("valor3"));
    String nombre = (String) miMapa.get("valor2");
    System.out.println("nombre = " + nombre);
    // Imprimir las llaves
    System.out.println(miMapa.keySet());
    System.out.println(miMapa.values());
  }
}
