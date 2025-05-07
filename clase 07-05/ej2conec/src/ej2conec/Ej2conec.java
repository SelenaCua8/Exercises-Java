package ej2conec;

import javax.swing.JOptionPane;

class Ej2conec {

	public static void main(String[] args) {
		int a, b, c;
		a=Integer.parseInt(JOptionPane.showInputDialog("INgrese un numero: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("INgrese otro numero: "));
		c=Integer.parseInt(JOptionPane.showInputDialog("INgrese el ultimo numero: "));
		if(a>=b && a>=c) {
			JOptionPane.showMessageDialog(null, "El mayor es: " + a);
		}else if(b>=a && b>=c) {
			JOptionPane.showMessageDialog(null, "El mayor es: " + b);
		}else {
			JOptionPane.showMessageDialog(null, "El mayor es : " + c);
		}

	}

}
