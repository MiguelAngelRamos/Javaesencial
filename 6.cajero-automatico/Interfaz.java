/*
 Programa que emula la interfaz de un cajero autom�tico. El programa presentar�
 las siguientes opciones al usuario:

 Elija una de las siguientes opciones:

 Escriba 1 para consultar su saldo
 Escriba 2 para ingresar dinero
 Escriba 3 para sacar dinero
 Escriba 4 para consultar sus �ltimos movimientos
 Una vez escrita la opci�n, pulse la tecla enter

 Una vez el usuario ha elegido la opci�n, el programa le mostrar� por pantalla el n�mero
 correspondiente a la opci�n elegida

 */

package cajeroautomatico;

import java.util.Scanner;
// UpperCamelCase (PascalCase) de la convenci�n CamelCase
public class Interfaz {

	public static void main(String[] args) {
		// syso + control + barra espaciadora
		System.out.println("Elija una de las siguientes opciones");
		System.out.println("    Escriba 1 para consultar su saldo");
		System.out.println("    Escriba 2 para ingresar dinero");
		System.out.println("    Escriba 3 para sacar dinero");
		System.out.println("    Escriba 4 para consultar sus �ltimos movimientos");
		
		Scanner sc = new Scanner(System.in);
		
		int opcionSeleccionada = sc.nextInt();
		int numeroDecimal; // convenci�n CamelCase y lowerCamelCase (variables como m�todos)
		// String main = "Mi Clase";
		Integer numeroObjetoEntero; 
		
		
		System.out.println("La opci�n que usted ha elegido es: " + opcionSeleccionada);
		
	}

}
