package ej7sec;
import javax.swing.JOptionPane;

class Ej7sec {

	public static void main(String[] args) {
		double lado, p, a;
		
		lado =Double.parseDouble(JOptionPane.showInputDialog("ingrese lado: "));;
		p = lado *4;
		a = lado* lado;
JOptionPane.showMessageDialog(null, "El perimeto del cuadrado es : " + p + "\ny el lado es: " + a);
		
		
		
	}

}
