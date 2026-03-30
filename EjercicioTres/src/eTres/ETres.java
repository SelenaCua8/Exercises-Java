package eTres;

import java.util.Scanner;

class ETres {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		sn.useDelimiter("\n");
		
		System.out.println("Introduce una frase: ");
		String frase = sn.next().toLowerCase();
		
		char caracter;
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			switch(caracter) {
			case 'a','e','i','o','u'->
			contador++;
			}
		}
		System.out.println("Hay " + contador + " vocales");
	}

}
