package patrones.singleton;

public class ConexionBDSingleton {
  private static ConexionBDSingleton instancia;
  // ConexionBDSingleton instancia = new ConexionBDSingleton;
  private ConexionBDSingleton () {
    System.out.println("Creando la instancia!");
  }

  public static ConexionBDSingleton getInstance() {
    if(instancia == null) {
      instancia = new ConexionBDSingleton();
    }
    return instancia;
  }
}
