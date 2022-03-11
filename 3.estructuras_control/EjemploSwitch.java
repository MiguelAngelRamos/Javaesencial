package estructuracontrol;

public class EjemploSwitch {

	public static void main(String[] args) {
		int opcion = 10;
		
		switch(opcion) {
			case 0: 
				System.out.println("Opción 0");
				break;
			case 1: 
				System.out.println("Opción 1");
				break;
			case 2:
				System.out.println("Opción 2");
				break;
			case 3:
				System.out.println("Opción 3");
				break;
			default:
				System.out.println("No existe esa opción");
				break;
		}

	}

}
