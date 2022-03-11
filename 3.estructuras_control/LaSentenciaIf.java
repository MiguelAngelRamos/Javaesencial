package estructuracontrol;

import java.util.Scanner;

public class LaSentenciaIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroPensado = 5;
		System.out.println("Adivina el número que estoy pensando del 1 al 10");
		int numeroUsuario = sc.nextInt();
		
		// if "SI"
		if(numeroUsuario == numeroPensado) System.out.println("Exacto!, Es el numero que estaba pensando ");
		else System.out.println("No es el número que estaba pensando... ");
		
	}

}
