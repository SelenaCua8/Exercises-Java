package ej1selector;

import javax.swing.JOptionPane;

class Ej1selector {

	public static void main(String[] args) {
		int a, b;
		int op;
		String men;
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
		op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese que operación quiere hacer : "
				+ "\n1 = suma \n 2= resta \n 3 = multiplicacion \n 4 = division"));
		
		switch (op) {
		case 1:
			op = (a+b);
			men = "Suma" + op;
			
			
			
			break;
		case 2:
			op = (a-b);
			men = "Resta" + op;
			
			
			break;
		case 3:
			op = (a*b);
			men = "multiplicacion" + op;
			
			
			break;
		case 4 : if (b !=0) {
			op = (a/b);
			men = "division" + op;
		} else {
			men = "No se puede dividir por cero";
		}
			
		
			
			
			break;

		default:
			men = "error";
			break;
		}
		JOptionPane.showConfirmDialog(null, men);
		
		
	}
	

}
