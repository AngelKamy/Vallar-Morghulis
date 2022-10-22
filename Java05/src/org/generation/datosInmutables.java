package org.generation;

public class datosInmutables {

	public static void main(String[] args) {
		String nombre = "Angel";
		nombre = "Ivan";
		
		String participante = "Angel";
		
		String personaCH18 = new String("Angel");
		
		if(participante.equals(personaCH18)) {
			System.out.println("Es la misma persona");
		}
		
		else {
			System.out.println("No es la misma persona");
		}
	}

}
