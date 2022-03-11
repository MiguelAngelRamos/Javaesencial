package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ListColecciones {
  public static void main(String[] args) {
    List<String> miLista = new ArrayList<String>();
    miLista.add("Lunes");
    miLista.add("martes");
    miLista.add("miércoles");
    miLista.add("jueves");
    miLista.add("viernes");
    miLista.add("Sábado");
    miLista.add("Domingo");

    // System.out.println(miLista);
    // Recorriendo la lista con una función lambda

    for (Object elemento: miLista) {
      System.out.println(elemento);
    }
    miLista.forEach( (el) ->{
      System.out.println("elemento = " + el);
    });
  }
}
