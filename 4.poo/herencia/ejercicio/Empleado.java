package poo.herencia.ejercicio;

public class Empleado extends Persona {
	
	private double sueldo;
	
	protected Empleado(String nombre, String fechaDeNacimiento, double sueldo) {
		super(nombre, fechaDeNacimiento);
		this.sueldo = sueldo;
		
	}
	
	public void trabajar() {
		System.out.println("Soy " + nombre + " y estoy trabajando...");
	}
	
	public void cobrarSueldo() {
		System.out.println("Soy " + nombre + " y estoy cobrando: " + sueldo);
	}
	
}
