package poo.herencia.ejercicio;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Pedro", "15-10-2002", 1644);
		
		// Métodos de la clase padre "Persona" que hereda la clase hija "Estudiante"
		estudiante.dormir();
		estudiante.respirar();
		
		// Métodos propios de la clase hija "Estudiante"
		estudiante.aprobar();
		estudiante.reprobar();
		
		System.out.println();
		
		Empleado empleado = new Empleado("Diego", "20-02-1998", 3000);
		
		// Métodos de la clase padre "Persona" que hereda la clase hija "Empleado"
		empleado.dormir();
		empleado.respirar();
		
		// Métodos propios de la clase hija "Empleado"
		empleado.trabajar();
		empleado.cobrarSueldo();

	}

}
