package poo.clasesabstractas;

public class Main {
	public static void main(String[] args) {
		// FiguraGeometrica figura = new FiguraGeometrica("circulo");
		FiguraGeometrica figuraGeometrica = new Rectangulo("Rectangulo");
		
		figuraGeometrica.dibujar();
		// ambas clases tienen el mismo m�todo, se va ejecutar la clase con menos jerarquia
	}
}
