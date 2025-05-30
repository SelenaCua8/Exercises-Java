package ej6for;

import javax.swing.JOptionPane;

class Ej6for {

	public static void main(String[] args) {
		int n, numero, min=9999, max = 0, rango;
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de numeros que quiere usar:"));
		
		
		//minimos
		for (int i = 1; i <=n; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
			
			if (numero<min) {
				min = numero;
				System.out.println(min);
				
			
			}
			
			//maximos
			for (int j = 1; j <= n; j++) {
			 if (numero>max) {
				 max= numero;
				
			}
				
			}
			
		
			
	}
		rango = max - min;
		JOptionPane.showConfirmDialog(null, "El numero minimo es: " + min + "\nEl numero máximo es: "
				+ max + "\nEl rango es: " + rango);
		
		

}}
