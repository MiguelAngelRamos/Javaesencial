package estructuracontrol;

public class EjemploWhile {

	public static void main(String[] args) {
		// while (mientras) se va ejecutar mientras la expresion booleana sea verdadera
		int x = 0;
		
		while( x <= 100) {
			System.out.println(x);
			if( x == 50) {
				break; // con break interrupto el ciclo
			}
			x++;
		}
		System.out.println("Fin de la ejecucion del while: " + x);
	}

}
