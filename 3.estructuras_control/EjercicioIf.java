package estructuracontrol;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero");
		int dividendo = sc.nextInt();
		
		System.out.println("Introduzca el divisor");
		int divisor = sc.nextInt();
		
		// int resultado = dividendo / divisor;
		int resultado;
		
		if(divisor == 0) {
			// resultado = 0;
			System.out.println("Debes ingresar un divisor superior a cero");
			return;
		} else {
		  resultado = dividendo / divisor;
		}
		
		System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + resultado);
		
		

	}

}
