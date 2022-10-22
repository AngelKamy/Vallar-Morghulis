package org.generation;

public class Ciclos {

	public static void main(String[] args) {
		/**
		 * Sintaxis del ciclo for
		 * 
		 * for (incialización; comparación; expresiónFinal)
		 * 		instrucción;
		 * 
		 * for (Inicialización; comparación; expresiónFinal){
		 * 		instrucciones;
		 * 	} 
		 */
		
		for (int i = 0 ; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				System.out.println("Valor de j: " + j);
			}
			System.out.println("Valor de i: " + i);
		}

	}

}
