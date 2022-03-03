package tipodatosoperadores;

import java.util.Scanner;

public class EjercicioModulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		// el numero es par o impar
		// 14/2 = 7 EL RESTO ES 0
		// 10/2 = 5 El resto o modulo es 0
		if(numero % 2 == 0) {
			System.out.println("El numero es PAR");
		} else {
			System.out.println("El numeor es IMPAR");
		}
		
		sc.close();

	}

}
