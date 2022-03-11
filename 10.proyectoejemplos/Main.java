package proyectoejemplos;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    AutoMovil auto = new AutoMovil("Ford");
    List<String> modelosFord = new ArrayList<String>();
    modelosFord.add("Fiesta");
    modelosFord.add("Focus");
    modelosFord.add("Galaxy");
    modelosFord.add("EcoSport");
    modelosFord.add("Kuga");
    modelosFord.add("Mondeo");
    modelosFord.add("Ranger");
    auto.setModelos(modelosFord);
    System.out.println(auto);

    AutoMovil auto2 = new AutoMovil("Volkswagen");
    List<String> modelosVolkswagen = new ArrayList<String>();
    modelosVolkswagen.add("A3");
    modelosVolkswagen.add("Virtus");
    modelosVolkswagen.add("Vento");
    modelosVolkswagen.add("Atlas");
    // Volkswagen Voyage.
    auto2.setModelos(modelosVolkswagen);
    System.out.println(auto2);

  }
}
