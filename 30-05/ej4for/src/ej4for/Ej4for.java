package ej4for;

import javax.swing.JOptionPane;

class Ej4for {

	public static void main(String[] args) {
		int n, min = 9999, num;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de números: "));
		for (int i = 1; i <= n; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese números: "));
			System.out.println("numero: " + i +":"+ num);
			if (num<min) {
				min=num;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "Su número mínimo es: " + min);

	}

}
