package tipodatosoperadores;

public class IncrementoDecremento {

	public static void main(String[] args) {
		int contador = 0;
		/* INCREMENTO */
		contador = contador + 1;
		System.out.println(contador);
		// 0 = 0 + 1;
		// contador = 1
		contador++; // que va incrementar el contador de 1 en 1
		// 1 = 1 + 1
		// contador = 2
		System.out.println(contador);
		
		// El contador tiene un valor "2"
		System.out.println(contador++); // Primero imprime, luego evalua (incrementa)
		System.out.println(++contador); // incrementa (evalua) y despues imprime
		
		/* DECREMENTO */
		int contadorDecremento = 20;
		// contadorDecremento = contadorDecremento - 1;
		contadorDecremento--;
		System.out.println(contadorDecremento);
		// contadorDecremento--;
	
		// contadorDecremento tiene un valor de "19"
		System.out.println(contadorDecremento--); // 19 o 18? primero imprime y luego disminuye
		System.out.println(contadorDecremento);
		System.out.println(--contadorDecremento); // disminuye y luego imprime
		
		int contadorOtroNumero = 30;
		// contadorOtroNumero = contadorOtroNumero - 5;
		// contadorOtroNumero -=5;
		
		contadorOtroNumero +=5; // contadorOtroNumero = contadorOtroNumero + 5;
		System.out.println("contadorOtroNumero: " + contadorOtroNumero);

	}

}
