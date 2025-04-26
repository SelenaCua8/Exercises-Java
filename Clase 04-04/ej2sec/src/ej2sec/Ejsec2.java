package ej2sec;

import javax.swing.JOptionPane;

class Ejsec2 {

	public static void main(String[] args) {
		double a, b, c, d;
		double s;
		double p;
		a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		d = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		s= a+b+c+d;
		p = s/4;
		JOptionPane.showMessageDialog(null, "Calculo de suma y promedio \n \nsuma:  " +  s  + "\npriomedio:  " + p);
		
		
	}

}
