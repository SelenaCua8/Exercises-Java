package ejercicioUno;

import javax.swing.JOptionPane;

class EjercicioUno {

	public static void main(String[] args) {
		

		String sexo, nombre;
		double valorEntrada, totalEntrada;
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		sexo = JOptionPane.showInputDialog("Ingrese su sexo: " + "\nM = masculino \nF = femenino");
		valorEntrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de la entrada: "));
		
		if (sexo.equalsIgnoreCase("f")) {
			totalEntrada = valorEntrada - (valorEntrada * 0.10);
			JOptionPane.showConfirmDialog(null, "Su nombre es: " + nombre + "\nTiene un descuento del 10%" + "\nEl valor de su entrada es de:  " + totalEntrada);
			
			
		} else if (sexo.equalsIgnoreCase("m")) {
			totalEntrada = valorEntrada - (valorEntrada * 0.02);
			JOptionPane.showConfirmDialog(null, "Su nombre es: " + nombre + "\nTiene un descuento del 2%" + "\nEl valor de su entrada es de: "  + totalEntrada);
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Error de ingreso de datos");

		

		}
	
	
		
		
		
	}

}
