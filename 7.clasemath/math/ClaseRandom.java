package clasemath.math;

import java.util.Random;

public class ClaseRandom {
  public static void main(String[] args) {

    String [] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"}; // longitud 6 y su ultimo indice 5
    Random randomObj = new Random();

    int randomInt = randomObj.nextInt();
    System.out.println("randomInt = " + randomInt);

    // vamos a generar valores del 0 al 6, pero! sin incluir el 6
    // 0, 1, 2, 3, 4 o 5
    int randomIntParams = randomObj.nextInt(colores.length);
    System.out.println("randomIntParams = " + randomIntParams);
    // Obtener un color aleatorio de nuestro array colores
    System.out.println("random color: " + colores[randomIntParams]);

    // Obtener valores aleatorios entre 15 y 25
    int randomIntRango = 15 + randomObj.nextInt(25-15);
    System.out.println("randomIntRango = " + randomIntRango);


  }
}
