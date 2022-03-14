package patrones.decorador;

import patrones.decorador.losdecoradores.InvertirDecorador;
import patrones.decorador.losdecoradores.MayusculaDecorador;

public class Main {
  public static void main(String[] args) {
    Formateable texto = new Texto("Hola Mundo");
    System.out.println(texto.darFormato());
    MayusculaDecorador masyuscula = new MayusculaDecorador(texto);
    System.out.println(masyuscula.darFormato());
    InvertirDecorador invertir = new InvertirDecorador(masyuscula);
    System.out.println(invertir.darFormato());

    // academyjava
  }
}
