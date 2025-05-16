package ejercicioTres;

import javax.swing.JOptionPane;

class EjercicioTres {

	public static void main(String[] args) {
		
		double  resultado;
		double numDos, numUno;
		numUno=(Math.random()*10+1);
		numDos=(Math.random()*10+1);
		JOptionPane.showConfirmDialog(null, "El primer numero es: " + numUno);
		JOptionPane.showConfirmDialog(null, "El segundo numero es: " + numDos);
	
		if (numDos != 0) {
			resultado = numUno / numDos;
			JOptionPane.showConfirmDialog(null, "El resultado de la division es: " + resultado);
			
		} else {
			JOptionPane.showConfirmDialog(null, "No se puede dividir por 0");

		}
		
	
	}

}
