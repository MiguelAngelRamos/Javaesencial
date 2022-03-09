package poo.herencia.ejercicio;

public class Estudiante extends Persona {
	private int numeroIndentificador;
	
	protected Estudiante(String nombre, String fechaDeNacimiento, int numeroIndentificador) {
		super(nombre, fechaDeNacimiento);
		this.numeroIndentificador = numeroIndentificador;
	}
	
	public void aprobar() {
		System.out.println("Soy " + nombre + " y aprobe mi examen");
	}
	
	public void reprobar() {
		System.out.println("Soy " + nombre + " y reprobe mi examen");
	}
	
	@Override
	public void dormir() {
		System.out.println("Soy " + nombre + " soy un estudiante y no duermo!!");
	}

}
