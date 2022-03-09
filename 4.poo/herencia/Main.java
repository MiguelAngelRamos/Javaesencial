package poo.herencia;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Gato gato = new Gato();
		gato.nombre = "benito";
		gato.caminar();
		gato.comer();
		
		Perro perro = new Perro();
		perro.nombre = "Rocky";
		perro.caminar();
		perro.comer();
		
		System.out.println(gato instanceof Animal);
		System.out.println(animal instanceof Gato);

	}

}
