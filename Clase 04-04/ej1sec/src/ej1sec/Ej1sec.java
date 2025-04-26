package ej1sec;

import javax.swing.JOptionPane;

class Ej1sec {

	public static void main(String[] args) {
		int a, b, c, d, sum, prod;
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		sum=a+b;
		prod=c*d;
		JOptionPane.showMessageDialog(null, "suma: " + sum +  "prudcto: " + prod);
		
		

	}

}
