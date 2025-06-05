package ejDosMientras;

import javax.swing.JOptionPane;

class EjDosMientras {

	public static void main(String[] args) {
		int numUno, numDos, resultado = 0;
		String res;
		
		res = JOptionPane.showInputDialog("Desea calcular el promedio de dos numeros?");
		
		
		while (res.equalsIgnoreCase("si")) {
			numUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			numDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			
			resultado = (numUno + numDos) / 2;
			
			JOptionPane.showMessageDialog(null, "El promedio es: " + resultado);
			res = JOptionPane.showInputDialog("Desea calcular otro par de numeros?");
			
		}
		
		JOptionPane.showMessageDialog(null, "Programa fin");
		
		
		
		
	}


}
