package ej2con;
import javax.swing.JOptionPane;

class Ej2con {

	public static void main(String[] args) {
		String dia;
		
		dia=JOptionPane.showInputDialog("Ingrese día de lunes a domingo: ");
		if (dia.equalsIgnoreCase("domingo")) {
			JOptionPane.showConfirmDialog(null, "No se trabaja");
			
		} else {
			JOptionPane.showConfirmDialog(null, "Se trabaja");
		}
		

	}

}
