package ej4cond;
import javax.swing.JOptionPane;

class Ej4cond {

	public static void main(String[] args) {
		double nota;
		
		nota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota: "));
		if (nota >= 4) {
			JOptionPane.showConfirmDialog(null,"Aprobado");
			
		} else {
			JOptionPane.showConfirmDialog(null,"Desaprobado");
		}

	}

}
