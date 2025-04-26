package ej11sec;
import javax.swing.JOptionPane;

class Ej11sec {

	public static void main(String[] args) {
		double pi = 3.1416;
		double r, perim,a;
		r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio : "));
		perim = 2 * r * pi;
		a = r * r * pi;
		JOptionPane.showConfirmDialog(null," Perimetro: "+ perim + "\nEl area es: " + a);

	}

}
