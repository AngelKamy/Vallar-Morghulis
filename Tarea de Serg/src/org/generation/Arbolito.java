package org.generation;

import java.util.Scanner;

public class Arbolito {
    public static void main(String[] args) {
    	
    	Scanner myScan = new Scanner (System.in);
        String str="*",space=" ";
        
        System.out.println("Ingresa cantidad de columnas: ");
        int x= myScan.nextInt();
        int j=(x);
        for(int i=1;i<=(x*2);i+=2) {
            System.out.println(space.repeat(j)+str.repeat(i));
            j--;
        }
        System.out.println((space.repeat(x-3)+str.repeat(x-3)+"\n").repeat(x-5));
    }
}
