/*
Programa que pida por pantalla introducir una cantidad de euros y devuelva la conversion en US
el mensaje con el resultado será: *** euros equivalen *** US dólares
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
  public static void main(String[] args) {
    System.out.println("Bienvenido al conversor de moneda");
    System.out.println("Por favor, introduzca una cantidad en euros y el programa le devolver+a la conversión en US dólares americanos");

    Scanner sc = new Scanner(System.in);
    double euros = sc.nextDouble();
    // tasa de cambio
    double dolares = 1.09 * euros;
    // double dolares = (0.90 * euros);

    // problemas con decimales, solucion el big decimal
    System.out.println(euros + "euros equivalen a " +  dolares + " US dólares");

    // convertir nuestro valor de euros a string

    String eurosString = Double.toString(euros);
    BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
    double tasaDeCambio = 1.09;
    String tasaDeCambioString = Double.toString(tasaDeCambio);
    BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);


    // operador

    BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

    System.out.println(euros + " euros equivalen a " + dolaresBigDecimal.toString() + " US dólares");

  }
}
