package ej7sec;

import javax.swing.JOptionPane;



class Ej7sec {

	public static void main(String[] args) {
		
		double perimetro, area, lado;
		
		lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresar lado del cuadrado: "));
		perimetro=lado*4;
		area= lado * lado;
		JOptionPane.showConfirmDialog(null, ("El perimetro del cuadrado es: " + perimetro + "\nY mostrar el área del cuadrado: " + area));
		
		
		

	}

}
