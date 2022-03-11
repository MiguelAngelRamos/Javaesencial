package estructuracontrol;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// Si la condición no se cumple "do while" se ejecuta al menos una vez
		int x = 20;
		do {
			System.out.println("Soy el do while");
			System.out.println(x);
			x++;
		} while(x==10);

	}

}
