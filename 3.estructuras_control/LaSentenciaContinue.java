package estructuracontrol;

public class LaSentenciaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<100; i++) {
			if( i % 2 != 0) {
				continue;
				/*
				 * si es impar esta condici�n se va cumplir lo que activara el continue
				 * que va omitir la ejecuci�n del system.out.println(i) y pasara a la siguiente iteraci�n
				 * 
				 */
			}
			System.out.println(i);
		}

	}

}
