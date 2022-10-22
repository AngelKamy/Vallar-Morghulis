package org.generation;

public class TestMascota {
	
	public static void main(String[] args) {
		
	/* *Mascota hilario;
	 * hilario = new Mascota();
	 * hilario.name = "Hilario";*/	
	Mascota hilario = new Mascota("Hilario", 1, 30);
//	hilario.age = 1;
//	hilario.sizeInCm = 30;
//hilario.tipo = "Felino";
	
	Mascota periquita = new Mascota ("Periquina", 0.5, 8);
	
	
	System.out.println("La Mascota de Fer Palapa se llama " + hilario.name);
		
	}

}
