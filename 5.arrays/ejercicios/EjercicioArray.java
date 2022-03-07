/*
 * Almacenar en un array las 20 ventas del un mes y ver cuales ventas del mes, llegaron a esta cantidad
 * 2000 y cuantas fueron las que superaron los 2000.
 */

package arrays.ejercicios;

import java.util.Scanner;

public class EjercicioArray {

	public static void main(String[] args) {
		
		double ventas [] = new double[5]; // que los indices comienzan desde 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese las 20 ventas del mes:");
		
		// Un Ciclo For
		for(int i=0; i<ventas.length; i++) {
			System.out.println("Venta: " + (i + 1));
			ventas[i] = sc.nextDouble(); 
		}
		
		// Cuando termina el for tenemos nuestra data disponible
		
		int contador=0;
		int total= 0;
		System.out.println("*** Las Ventas mayores o iguales a $2000 ***");
		
		while(contador < ventas.length) {
			// con esta condicional donde vamos a indentificar las ventas mayores o iguales a 2000
			if(ventas[contador] >= 2000) {
				System.out.println("$ " + ventas[contador]);
				total++; // el total de las ventas mayores o iguales a 2000
			}
			contador++; // terminar el ciclo while
		}
		
		System.out.println("El total de ventas superiores o iguales a $2000 son: " + total);
		

	}

}
