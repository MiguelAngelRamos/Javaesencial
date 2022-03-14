package patrones.decorador.losdecoradores;

import patrones.decorador.Formateable;

public abstract class TextoDecorador implements Formateable {

  protected Formateable texto;

  public TextoDecorador(Formateable texto) {
    this.texto = texto;
  }

}
