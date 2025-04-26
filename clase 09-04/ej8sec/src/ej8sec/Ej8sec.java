package ej8sec;
import javax.swing.JOptionPane;

class Ej8sec {

	public static void main(String[] args) {
		
		double precioDolar, pesos, conversion;
		
		precioDolar = Double.parseDouble(JOptionPane.showInputDialog("Insertar el precio del dolar de dia de hoy: "));
		pesos = Double.parseDouble(JOptionPane.showInputDialog("Ingresas pesos que quiere cambiar: "));
		conversion =  precioDolar % pesos;
		JOptionPane.showConfirmDialog(null, "Precio dolar: " + precioDolar + "\nCantidad de pesos que quiere cambiar: " + pesos + "\nLA conversión total es de: " + conversion);
		

	}

}
