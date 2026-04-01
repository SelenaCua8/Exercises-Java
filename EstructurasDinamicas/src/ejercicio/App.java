package ejercicio;

import java.util.Collections;
import java.util.Stack;

public class App {
	/*
	 * 
	 * Crea una baraja de cartas y muestra cada una de las cartas
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		
		Stack<Carta> baraja = new Stack<>();
		
		for(Palo palo : Palo.values()) {
			for(int i = 1; i <= 12; i++) {
				if(i != 8 && i!=9) {
					baraja.push(new Carta(i, palo));
				}
			}
		}
		
		Collections.shuffle(baraja);
		
		while(!baraja.isEmpty()) {
			Carta carta = baraja.pop();
			System.out.println(carta);
		}
		
	}

}
