package patrones.decorador.losdecoradores;

import patrones.decorador.Formateable;

public class MayusculaDecorador extends TextoDecorador {
  // protected Formateable texto;
  public MayusculaDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    return texto.darFormato().toUpperCase();
  }
}
