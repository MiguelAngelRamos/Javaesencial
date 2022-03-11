package proyectoejemplos;

import java.util.List;

public class AutoMovil {
  private String marca;
  private List<String> modelos;

  public AutoMovil(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public List<String> getModelos() {
    return modelos;
  }

  public void setModelos(List<String> modelos) {
    this.modelos = modelos;
  }

  @Override
  public String toString() {
    return "AutoMovil{" +
            "marca='" + marca + '\'' +
            ", modelos=" + modelos +
            '}';
  }
}
