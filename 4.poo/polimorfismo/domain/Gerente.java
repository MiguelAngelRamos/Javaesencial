package poo.polimorfismo.domain;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  @Override
  public String obtenerDetalles() {
    // System.out.println(super.obtenerDetalles());
    return super.obtenerDetalles() + ", departamento: " + this.departamento;
    // return "Nombre: " + this.nombre + " , sueldo: " + this.sueldo + ", departamento: " + this.departamento;
  }
}
