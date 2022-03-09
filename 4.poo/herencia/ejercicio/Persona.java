package poo.herencia.ejercicio;

public class Persona {
	// atributos
	protected String nombre;
	protected String fechaDeNacimiento;
	
	// Constructor explicito que recibe por parametro todos los atributos de la clase Persona
	protected Persona(String nombre, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	// Métodos
	
	public void dormir() {
		System.out.println("Soy " + nombre + " y estoy durmiendo");
	}
	
	public void respirar() {
		System.out.println("Soy " + nombre + " y estoy respirando desde: " + fechaDeNacimiento);
	}
	
	public void comer() {
		System.out.println("Soy " + nombre + " y estoy comiendo");
	}
}
