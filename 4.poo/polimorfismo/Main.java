package poo.polimorfismo;

import poo.polimorfismo.domain.Empleado;
import poo.polimorfismo.domain.Gerente;


public class Main {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("Pedro", 7000);
    // soutv
    // System.out.println("empleado = " + empleado.obtenerDetalles());
    imprimir(empleado);

   // Empleado gerente = new Gerente("Catalina", 10000, "Contabilidad");
    Gerente gerente = new Gerente("Catalina", 10000, "Contabilidad");
   // System.out.println("gerente = " + gerente.obtenerDetalles());
    imprimir(gerente);
  }
  // Polimorfismo (muchas formas)
  public static void imprimir(Empleado empl ) {
    System.out.println("empleado = " + empl.obtenerDetalles());
  }
}
