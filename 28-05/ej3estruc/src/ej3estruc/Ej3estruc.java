package ej3estruc;

import javax.swing.JOptionPane;

class Ej3estruc {

	public static void main(String[] args) {
		int num, contUno = 0, contDos = 0,contTres = 0,contCuatro = 0;
		
		
	for (int i = 0; i <= 100; i++) {
		num=(int)(Math.random()*101);
		System.out.println("Numero:" + num);
		if (num<=25) {
			contUno++;
			
		} else if (num<=50) {
			contDos++;
			
		} else if (num<=75) {
			contTres++;
			
		} else {
			contCuatro++;

		

		}
		JOptionPane.showMessageDialog(null, "Cantidad 0-25 : " + contUno +"\nCantidad 25-50: " + contDos + "\nCantidad 50-75: " + contTres +
				"\nCantidad 75-100: " + contCuatro);
	}
		
	}

	}


