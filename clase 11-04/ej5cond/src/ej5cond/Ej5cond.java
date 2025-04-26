package ej5cond;
import javax.swing.JOptionPane;
class Ej5cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldo;
		String categoria;
		
		
		
		sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo del empleado: "));
		categoria = JOptionPane.showInputDialog("Ingrese la categoria del empleado: ");
		if (categoria.equalsIgnoreCase("A")) {
			
			//JOptionPane.showConfirmDialog(null, sueldo * 1.02 );
			sueldo = sueldo* 1.02;
			
			
		} else {
			//JOptionPane.showConfirmDialog(null, sueldo * 1.05 );
			sueldo = sueldo * 1.05;
		}
		JOptionPane.showConfirmDialog(null, "cobra: " + sueldo);
	}

}
