package ej1selec;

import javax.swing.JOptionPane;

class Ej1selec {

	public static void main(String[] args) {
		double valorUno, valorDos, resultado = 0;
		int clave = 0;

		valorUno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero:"));
		valorDos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
		clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que oepación quiere realizar: " + "\n1-Suma \n2-Resta \n3-Multiplicación \n4-División"));

		switch (clave) {
		case 1:
			resultado = valorUno + valorDos;

			break;
		case 2:
			resultado = valorUno - valorDos;
			break;
		case 3:
			resultado = valorUno * valorDos;
			break;
		case 4:if (valorDos==0) {
			resultado = 444;
			JOptionPane.showConfirmDialog(null, "No se puede dividir por cero");
			
		}
		resultado  = valorUno/valorDos;

			break;

		}
		
		 JOptionPane.showMessageDialog(null, "Elegiste: " + clave + "\nTu resultado es: " + resultado);
	}
	 
}
