package eSeis;

import java.util.Random;
import java.util.Scanner;


class ESeis {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce la longitud: ");
		int longitud = sn.nextInt();
		
		String password = generaPassword(longitud);
		System.out.println("EL paso generado es: " + password);
		
	}
	
	public static int generaAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(min, max + 1);
		
		
	}
	
	public static String generaPassword(int longitud) {
			String password ="";
			char caracter = 0;
			for (int i = 0; i < longitud; i++) {
				int tipo = generaAleatorio(1,3);
				switch (tipo) {
				case 1-> caracter = (char)generaAleatorio('A', 'Z');
				case 2-> caracter = (char)generaAleatorio('a', 'z');
				case 3-> caracter = (char)generaAleatorio('0', '9');
				
				}
				
				password +=caracter;
			}
			// ¡ESTO FALTA! Hay que devolver el resultado
	        return password;
	}

}
