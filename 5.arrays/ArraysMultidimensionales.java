package arrays;

public class ArraysMultidimensionales {

	public static void main(String[] args) {
		// ['1', '2','4']
		
		int tablaDeMultiplicar[][] = new int[10][10];
		
		// For anidados
		// Crear las tablas de multiplicar
		for(int i =0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tablaDeMultiplicar[i][j] = i * j;
			}
		}
		
		// A imprimir el contenido matriz
		for(int i=0; i<10; i++) {
			for(int j=0; j <10; j++) {
				// print a a a a
				// println
				// a
				// a
				// a
				// a
				System.out.print("["+tablaDeMultiplicar[i][j]+ "]"+" ");
			}
			System.out.println("");
		}
		
		// filas y columnas [filas][columnas]
		System.out.println("El valor de la matriz en [2][6] es: " + tablaDeMultiplicar[2][6]);
		// la posicion tablaDeMultiplicar[4][5]
		// la posicion tablaDeMultiplicar[2][6]

	}

}
