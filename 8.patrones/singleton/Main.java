package patrones.singleton;

public class Main {
  public static void main(String[] args) {
    ConexionBDSingleton conexion1 = ConexionBDSingleton.getInstance();
    ConexionBDSingleton conexion2 = ConexionBDSingleton.getInstance();
    
    boolean comparate = (conexion1 == conexion2);
    System.out.println("comparate = " + comparate);

    
  }
}
