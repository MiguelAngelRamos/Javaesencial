package poo.ejercicios;

public class Persona {
	
	public String nombre;
	public int edad;
	public char genero;
	public float estatura;
	public float peso;
	
	public Persona(String nombre, int edad, char genero) {
		nombre = nombre;
		edad = edad;
		genero = genero;
	}
	
	public void bailar(Persona p) {
		System.out.println(nombre + " esta bailando con : " +  p.nombre);
	}
	
	public void imprimirInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Genero " + genero);
	}
	
}
