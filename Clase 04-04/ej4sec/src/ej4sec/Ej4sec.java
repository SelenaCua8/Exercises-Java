package ej4sec;

import javax.swing.JOptionPane;

class Ej4sec {

	public static void main(String[] args) {
		double n1, n2, n3;
		String mat;
		double prom;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 1 "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 2 "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 3 "));
		mat = JOptionPane.showInputDialog("ingrese matricula: ");
		prom = (n1+n2+n3)/3;
		
		JOptionPane.showMessageDialog(null, "La matricula es: " + mat + "\nLa nota 1 es: " + n1 + "\nLa nota 2 es: " + n2+
				"\nLa nota 3 es: " + n3 + "\nY el promedio es: " + prom );
	
	}

}
