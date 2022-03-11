package colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetColecciones {
  public static void main(String[] args) {
    // En Set no se respeta el orden que fueron agregados los elementos
    Set<String> miSet = new HashSet<String>();
    System.out.println("Valor booleano de lunes es: " +  miSet.add("Lunes"));
    miSet.add("Martes");
    System.out.println("martes duplicado es : " + miSet.add("Martes"));
    miSet.add("Miercoles");
    miSet.add("Jueves");
    miSet.add("Viernes");
    
    miSet.forEach(el -> System.out.println(el));
  }
}
