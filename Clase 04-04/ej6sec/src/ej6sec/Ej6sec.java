package ej6sec;

import javax.swing.JOptionPane;

class Ej6sec {

	public static void main(String[] args) {
		double venta, pago;
		double vuelto;
		

		venta = Double.parseDouble(JOptionPane.showInputDialog("ingrese venta"));
		pago = Double.parseDouble(JOptionPane.showInputDialog("ingrese pago "));
		
		vuelto = venta - pago;
		
		JOptionPane.showMessageDialog(null, "vuelto" + vuelto );

	}

}
