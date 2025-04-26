package ej6condicionales;
import javax.swing.JOptionPane;
class Ej6condicionales {

	public static void main(String[] args) {
		int a;
		int b;
		int resultado; 
		a=(int)(Math.random()* 11);
		b=(int)(Math.random()* 11);
		resultado = a/b;
		if ( b == 0) {
			JOptionPane.showConfirmDialog(null, "Imposible dividir por 0");
			
		} else {
			JOptionPane.showConfirmDialog(null, "Variable a: " + a + "\nVariable b: " + b + "\nEl resultado de "
					+ "la division es de: " + resultado);

		}
		
		
		

	}

}
