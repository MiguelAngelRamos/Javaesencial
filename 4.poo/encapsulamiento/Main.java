package poo.encapsulamiento;

public class Main {
	public static void main(String[] args) {
	
		Persona p1 = new Persona("Miguel", 38);
	
		//String nombre = p1.getNombre();
		// System.out.println("Hola: " + nombre);
		Persona p2 = new Persona("Maria", 35);
	
		Persona p3 = new Persona("Catalina", 18);
		
		System.out.println("El total de personas: " + Persona.getContadorPersonas());
		
		
		/*
		 * Un atributo static : No es especifico de cada objeto.
		 * Solo existe una copia del mismo y su valor es compartido por todos los objetos
		 * 
		 * Se le podria considerar una variable global a la que tienen acceso todos los
		 * objetos
		 * */
		
	}
}
