package org.generation;

public class Mascota {
	
	//Fields (Atributos)
	String name;
	double age;
	String tipo;
	int sizeInCm;
	String raza;
	//Atributos de clase, tiene modificador static
	
	
	//Métodos constructores
	//Si no especifíco un constructor, Java genera el default (vacío)
	//El nombre de un constructor DEBE tener el mismo nombre de la clase
	//Los métodos constructores no tienen retorno (Return)
	Mascota(String name, double age, int sizeInCm){
		//Este es el método default de la clase
		System.out.println("Se crea un objeto de tipo mascota");
		this.name = name;
		this.age = age;
		this.sizeInCm = sizeInCm;
		
	}
	
	
	//Método de la clase
	// -Métodos sobrcargados
	// -Métodos sobreescritos
}
