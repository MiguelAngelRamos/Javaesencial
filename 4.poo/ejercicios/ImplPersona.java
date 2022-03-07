package poo.ejercicios;

public class ImplPersona {

	public static void main(String[] args) {
		// 2 Persona Maria y Pedro
		// el baile 
		
		Persona persona = new Persona("Pedro", 18, 'M');
		persona.imprimirInformacion();
		
		Persona persona2 = new Persona("Maria", 20, 'F');
		persona2.imprimirInformacion();
		
		
		persona.bailar(persona2);
		
	}
	

}
