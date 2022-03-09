package poo.clasesabstractas;

public class Rectangulo extends FiguraGeometrica{

	protected Rectangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Se imprime un: " + this.getClass().getSimpleName());
		
	}
	
	/*
	 * Si una clase hija que extiende de una clase Abstracta, no quiere implementar
	 * sus métodos abstractos, esta clase hija debe ser abstracta.
	 * */

}
