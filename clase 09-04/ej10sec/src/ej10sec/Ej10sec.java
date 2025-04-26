package ej10sec;
import javax.swing.JOptionPane;

class Ej10sec {

	public static void main(String[] args) {
		int añoActual, edad, edadFutura, añoFuturo, añoNacimiento;
		String nombre;
		añoFuturo = 2050;
		
		nombre=JOptionPane.showInputDialog(("Ingrese nombre: "));
		añoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año actual: "));
		añoNacimiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese año nacimiento: "));
				
				edad =  añoActual - añoNacimiento ;
				edadFutura= añoFuturo- añoNacimiento;
				
				JOptionPane.showConfirmDialog(null," Su edad es: "+ edad + "\n en el 2050 tendra: "
						+ edadFutura);
		
		
		
		
		

	}

}
