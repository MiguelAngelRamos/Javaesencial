/*
 Programa que emula la interfaz de un cajero automático. El programa presentará
 las siguientes opciones al usuario:

 Elija una de las siguientes opciones:

 Escriba 1 para consultar su saldo
 Escriba 2 para ingresar dinero
 Escriba 3 para sacar dinero
 Escriba 4 para consultar sus últimos movimientos
 Una vez escrita la opción, pulse la tecla enter

 Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla el número
 correspondiente a la opción elegida

 */

package cajeroautomatico;

import java.util.Scanner;
// UpperCamelCase (PascalCase) de la convención CamelCase
public class Interfaz {

	public static void main(String[] args) {
		// syso + control + barra espaciadora
		System.out.println("Elija una de las siguientes opciones");
		System.out.println("    Escriba 1 para consultar su saldo");
		System.out.println("    Escriba 2 para ingresar dinero");
		System.out.println("    Escriba 3 para sacar dinero");
		System.out.println("    Escriba 4 para consultar sus últimos movimientos");
		
		Scanner sc = new Scanner(System.in);
		
		int opcionSeleccionada = sc.nextInt();
		int numeroDecimal; // convención CamelCase y lowerCamelCase (variables como métodos)
		// String main = "Mi Clase";
		Integer numeroObjetoEntero; 
		
		
		System.out.println("La opción que usted ha elegido es: " + opcionSeleccionada);
		
	}

}
