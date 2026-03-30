package eCinco;

import java.util.Random;

class ECinco {

	public static void main(String[] args) {
		
		int aleatorio;
		for (int i = 0; i < 5; i++) {
			aleatorio = generaAleatorio(1, 100);
			System.out.println(aleatorio);
			
		}
		

	}

	//crear una funcion
	public static int generaAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(min, max + 1);
	}
}
