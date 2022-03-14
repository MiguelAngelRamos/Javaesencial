package patrones.singleton.archivo;

public class Main {
  public static void main(String[] args) {
    SingletonArchivo sa1 = SingletonArchivo.getInstance();
    sa1.crearArchivo("Hola amigos!, vamos a crear un archivo con el patrón singleton");
    SingletonArchivo sa2 = SingletonArchivo.getInstance();
    sa2.crearArchivo(", este mensaje debería escribirse en el mismo archivo");

    boolean sonIguales = (sa1 == sa2);
    System.out.println("sonIguales = " + sonIguales);
  }
}
