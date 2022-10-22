package org.generation;

import java.util.Iterator;
import java.util.Scanner;

public class miArbolito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		String star = "*", space = " ";
		
		System.out.println("¿De cuántas filas quieres tu arbolito?: ");
		int valor = myScan.nextInt();

		
		for (int i = 1; i < valor; i++) {
			for(int j= valor; j >= i; j++) {
				System.out.print(star);
			}
			System.out.print(i);
		}
		
	}

}
