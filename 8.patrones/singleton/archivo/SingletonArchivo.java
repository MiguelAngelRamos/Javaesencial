package patrones.singleton.archivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonArchivo {
  private static SingletonArchivo instancia;

  private SingletonArchivo() {
    System.out.println("Conectandose... a singleton para crear archivo...");
  }

  public static SingletonArchivo getInstance() {
    if(instancia == null) instancia = new SingletonArchivo();
    return instancia;
  }

  public void crearArchivo(String message) {
    String nombreArchivo = "C:\\curso\\java\\archivo\\java.txt";
    File archivo = new File(nombreArchivo);

    try {
      FileWriter escritor = new FileWriter(archivo, true);
      escritor.append(message);
      escritor.close();
      System.out.println("El archivo se ha creado con éxito");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
