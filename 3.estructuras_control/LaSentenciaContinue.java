package estructuracontrol;

public class LaSentenciaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<100; i++) {
			if( i % 2 != 0) {
				continue;
				/*
				 * si es impar esta condición se va cumplir lo que activara el continue
				 * que va omitir la ejecución del system.out.println(i) y pasara a la siguiente iteración
				 * 
				 */
			}
			System.out.println(i);
		}

	}

}
