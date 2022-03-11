package clasemath.math;

public class EjemplosMath {
  public static void main(String[] args) {
    // Valor absoluto
    // (-) -3 -2 -1 0 1 2 3 (+)
    int absoluto = Math.abs(3);
    System.out.println("absoluto = " + absoluto);
    absoluto = Math.abs(-3);
    System.out.println("absoluto = " + absoluto);
    // El máximo entre 2 números
    double max = Math.max(3.5, 0.6);
    System.out.println("max = " + max);
    
    // El valor mínimo entre 2 números
    double min = Math.min(3.5, 0.6);
    System.out.println("min = " + min);
    // Redondeos
    // redondear hacia arriba
    double redondearUp = Math.ceil(3.2);
    System.out.println("redondearUp = " + redondearUp);
    // hacia abajo
    double redondearDown = Math.floor(3.8);
    System.out.println("redondearDown = " + redondearDown);
    /* Aproximación general */
    long entero = Math.round(3.5);
    System.out.println("entero = " + entero);
    // Potencia
    double potencia = Math.pow(10, 2);
    System.out.println("potencia = " + potencia);
    // Raíz Cuadrada
    double raizCuadrada = Math.sqrt(16);
    System.out.println("raízCuadrada = " + raizCuadrada);
    
  }
}
