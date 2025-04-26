package ejercicioAdicionalUno;
import javax.swing.JOptionPane;


/*1)Realizar un programa que permita el intercambio de valores
 * entre dos variables. Ej: si una variable n vale 35 y una variable
 * n2 vale 20, realizar las acciones necesarias para que
 * numero pase a valer 20 y n2 pase a valer 35. Una vez realizado el 
 * cambio mostrar*/
class EjercicioAdicionalUno {

	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 20;
		int aux;
		JOptionPane.showMessageDialog(null, "----ANTES------");
		JOptionPane.showMessageDialog(null, "Num1 : " + num1);
		JOptionPane.showMessageDialog(null, "Num2 : " + num2);
		
		aux = num2;
		num2 = num1;
		num1 = aux;
		JOptionPane.showMessageDialog(null, "----DESPUES------");
		JOptionPane.showMessageDialog(null, "Num1 : " + num1);
		JOptionPane.showMessageDialog(null, "Num2 : " + num2);
		
		
		

	}

}
