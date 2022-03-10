package clasemath.math;

public class ClaseMath {
  public static void main(String[] args) {
    String [] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
    System.out.println(colores.length);
    double random = Math.random(); // genera un número aleatorio decimal del 0 al 1, sin incluir 1
    System.out.println("random = " + random);
    double nuevoRandom = random * colores.length;
    // System.out.println("nuevoRandom = " + nuevoRandom);
    random = random * colores.length;
    // random *= colores.length; //  random = random * colores.length;
    System.out.println("random = " + random);
    
    random = Math.floor(random);
    System.out.println("random = " + random);
    System.out.println("random = " + (int)random);

    // para acceder al arreglo
    System.out.println("colores = " + colores[(int)random]);

  }
}
