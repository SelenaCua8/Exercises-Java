package ej6sec;

import javax.swing.JOptionPane;



class Ej6sec {

	public static void main(String[] args) {
		
		double venta, pago, v;
		
		venta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta: " ));
		pago=Double.parseDouble(JOptionPane.showInputDialog("Ingrese pago: " ));
		v= venta - pago;
		JOptionPane.showMessageDialog(null, "su vuelto es: " + v);
		
		
	}

}
