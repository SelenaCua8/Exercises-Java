package sumar;

import javax.swing.JOptionPane;

class Sumar {

	public static void main(String[] args) {
		int a, b, sum;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero: "));
		sum=a+b;
		JOptionPane.showMessageDialog(null, "la suma es: " + sum);
				
		
		

	}

}

