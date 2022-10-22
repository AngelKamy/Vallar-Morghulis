package org.generation;

import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * La clase scanner nos permite realizar una 
		 * lectura een la consola *
		 * */
		
		Scanner myScan = new Scanner (System.in); //Creación de una función para scannear
	
//		
//		//entrada del usuario
//		System.out.println("Introduce tu nombre: ==>");
//			String name = myScan.nextLine();
//			
//		//Entradas numéricas 
//		System.out.println("\n Introduce tu edad: ");
//		int age = myScan.nextInt();
//		
//		//Entradas numéricas de tipo Double
//		System.out.println("\n Introduce el salario deseado: ");
//		double salary = myScan.nextDouble();
//		
//		System.out.println("Tu nombre es: " + name + "con edad:  " + age + " años, con salario de:  " + salary );*/
		
		/**
		 * La sintaxis de la condicional if
		 * if(condición) instrucción;
		 * 
		 * if (condición){
		 * 		instrucciones;
		 * }
		 * 
		 * **/
//		int numChelas = 5;
//		numChelas++;
//		numChelas+=3;
//		boolean hayBotanita = true;
//		
//		System.out.println("Bienvenido a \"la Oficina\" \n ");
//		if (numChelas > 5 && !hayBotanita) System.out.println("Vete a mimir, tío");
//		else if (numChelas>8) {
//			System.out.println("Momento de mandar mensajes");
//			System.out.println("Todas las canciones son mis canciones");
//			System.out.println("Ponte la del ratón vaquero");
//		}
//		else System.out.println("Fondo, Fondo, Fondo");
	
//		System.out.println("Hola usuario, Introduce tu calificación: ");
//		double calificacion = myScan.nextDouble();
//		
//		if ( calificacion >= 9 && calificacion <=10) {
//			System.out.println("A");
//		} else if (calificacion < 9 && calificacion >= 8) {
//			System.out.println("B");
//		} else if (calificacion < 8 && calificacion >= 7) {
//			System.out.println("C");
//		} else if (calificacion < 7 && calificacion >= 6) {
//			System.out.println("D");
//		} else if (calificacion < 6 && calificacion >= 0) {
//			System.out.println("F sota");
//		} else {
//			System.out.println("Valor desconocido");
//		}
	
		
		System.out.println("======M=E=S=====");
        System.out.println("\nIntroduc1515e el mes en curso");
        int mesEnCurso = myScan.nextInt();
        String mesString = "";

        switch (mesEnCurso) {
        case 1:
            mesString = "Enero";
            break;
        case 2:
            mesString = "Febrero";
            break;
        case 3:
            mesString = "Marzo";
            break;
        case 4:
            mesString = "Abril";
            break;
        case 5:
            mesString = "Mayo";
            break;
        case 6:
            mesString = "Junio";
            break;
        case 7:
            mesString = "Julio";
            break;
        case 8:
            mesString = "Agosto";
            break;
        case 9:
            mesString = "Septiembre";
            break;
        case 10:
            mesString = "Octubre";
            break;
        case 11:
            mesString = "Nomviembre";
            break;
        case 12:
            mesString = "Diciembre";
            break;
        default:
            mesString = "No es un mes del año";
            break;

        }
        System.out.println("\nEstamos en  " + mesString);
        
        String temporada ="";
        switch (mesString) {
        
        case "Diciembre":
        case "Enero":
        case "Febrero":
            temporada ="Invierno";
            break;
            
        case "Marzo", "Abril", "Mayo":
            temporada ="Primavera";
            break;
        case "Junio":
        case "Julio":
        case "Agosto":
            temporada ="Verano";
            break;
        case "Septiembre":
        case "Octubre":
        case "Noviembre":
            temporada ="Otoño";
            break;
            default:
                temporada ="no aplica";
    
        }
        System.out.println("La temporada es: " + temporada);
	
	}
	

}
