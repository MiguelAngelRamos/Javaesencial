package poo.herencia.ejercicio;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Pedro", "15-10-2002", 1644);
		
		// M�todos de la clase padre "Persona" que hereda la clase hija "Estudiante"
		estudiante.dormir();
		estudiante.respirar();
		
		// M�todos propios de la clase hija "Estudiante"
		estudiante.aprobar();
		estudiante.reprobar();
		
		System.out.println();
		
		Empleado empleado = new Empleado("Diego", "20-02-1998", 3000);
		
		// M�todos de la clase padre "Persona" que hereda la clase hija "Empleado"
		empleado.dormir();
		empleado.respirar();
		
		// M�todos propios de la clase hija "Empleado"
		empleado.trabajar();
		empleado.cobrarSueldo();

	}

}
