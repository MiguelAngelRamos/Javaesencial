package arrays;

public class RecorrerArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {303, 151, 14}; // 500 elementos
		
		int [] numerosAsignados = new int[4];
		// System.out.println(numeros.length); // 3
		
		/*for( int i=0; i< numeros.length; i++ ) {
			System.out.println(numeros[i]);
		} */
		
		// Rellenar el arreglo
		for(int y=0; y < numerosAsignados.length; y++) {
			numerosAsignados[y] = y; 
			// numerosAsignados[0] = 0;
			// numerosAsignados[1] = 1;
			// numerosAsignados[2] = 2;
			// numerosAsignados[3] = 3;
		}
		
		for(int y=0; y<numerosAsignados.length; y++) {
			System.out.println(numerosAsignados[y]);
		}
			 

	}

}
