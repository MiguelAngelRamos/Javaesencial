package poo.clasesabstractas;

public class Main {
	public static void main(String[] args) {
		// FiguraGeometrica figura = new FiguraGeometrica("circulo");
		FiguraGeometrica figuraGeometrica = new Rectangulo("Rectangulo");
		
		figuraGeometrica.dibujar();
		// ambas clases tienen el mismo método, se va ejecutar la clase con menos jerarquia
	}
}
