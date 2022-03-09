package poo.ejercicios.vehiculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String marca;
		String modelo;
		double precio;
		int numeroVehiculos;
		int indiceVehiculoBarato;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de Vehículos: ");
		numeroVehiculos = sc.nextInt();
		
		Vehiculo vehiculosArray[] = new Vehiculo[numeroVehiculos];
		// Vehiculo vehiculosArray[] = {new Vehiculo("Hyundai", "Elantra", 1000), new Vehiculo("Mercedez", "Citan", 300)};
	
		for(int i=0; i < vehiculosArray.length; i++) {
			sc.nextLine();
			System.out.println("\nIngrese las caracteristicas del Vehiculo" + (i + 1) + ":");
			System.out.println("Introduzca la Marca: ");
			marca = sc.nextLine();
			
			System.out.println("Introduzca el Modelo: ");
			modelo = sc.nextLine();
			
			System.out.println("Introduzca el Precio: ");
			precio = sc.nextDouble();
			
			vehiculosArray[i] = new Vehiculo(marca, modelo, precio);
			
		} // fin for
		
		// En este punto del programa ya tenemos nuestro array de vehiculos con los objetos de tipo Vehiculo
		indiceVehiculoBarato = obtenerVehiculoMasBarato(vehiculosArray);
		
		System.out.println("\n El Vehiculo más barato es: ");
		System.out.println(vehiculosArray[indiceVehiculoBarato].mostrarDatos());

	} // método main
	
	public static int obtenerVehiculoMasBarato(Vehiculo vehiculo[]) {
		// retorne el indice del vehiculo
		double precio;
		int indice = 0;
		//  0   , 1  , 2
		// 700, 800, 100
		
		// "700", 800, 100
		precio = vehiculo[0].getPrecio(); // 700
		
		for(int i=1; i < vehiculo.length; i++) {
			if(vehiculo[i].getPrecio() < precio) {
				precio = vehiculo[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
	

}
