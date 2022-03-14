package patrones.decorador.losdecoradores;

import patrones.decorador.Formateable;

public class InvertirDecorador extends TextoDecorador {

  public InvertirDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    StringBuilder sb = new StringBuilder(texto.darFormato());
    // invertirlo
    return sb.reverse().toString();
  }
}
