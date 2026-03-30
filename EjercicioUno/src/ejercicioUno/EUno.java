package ejercicioUno;

import javax.swing.JOptionPane;

class EUno {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
		
		JOptionPane.showMessageDialog(null, "Hola " + nombre);
	}

}
