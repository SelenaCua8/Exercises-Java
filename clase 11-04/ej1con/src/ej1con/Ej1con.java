package ej1con;

import javax.swing.JOptionPane;

class Ej1con {

	public static void main(String[] args) {
		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		if (edad >= 18) {
			JOptionPane.showConfirmDialog(null, "Es mayor de edad");
			
		} else {
			JOptionPane.showConfirmDialog(null, "Es menor de edad");
		}
		

	}

}
