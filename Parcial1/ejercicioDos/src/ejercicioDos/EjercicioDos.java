package ejercicioDos;

import javax.swing.JOptionPane;

class EjercicioDos {

	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número: "));
		
		if (num>0) {
			JOptionPane.showConfirmDialog(null, "Tu número  " + num + "  es un número positivo");
			
		} else if (num < 0) {
			JOptionPane.showConfirmDialog(null, "Tu número  " + num +  "  es un número negativo");
			
		} else {

			JOptionPane.showConfirmDialog(null, "Tu número es igual a cero");
		

		}

	}

}
