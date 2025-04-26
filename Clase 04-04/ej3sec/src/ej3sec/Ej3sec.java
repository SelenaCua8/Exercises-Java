package ej3sec;

import javax.swing.JOptionPane;

class Ej3sec {

	public static void main(String[] args) {
		double precio;
		double cant;
		double total;
		
		precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio "));
		cant = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad "));
		total = precio*cant;
		
		JOptionPane.showMessageDialog(null, "el pago es de un total de: " + "$" +total   );
	}

}
