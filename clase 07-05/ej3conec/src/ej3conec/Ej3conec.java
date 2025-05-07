package ej3conec;

import javax.swing.JOptionPane;

class Ej3conec {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("INgrese un numero: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("INgrese otro numero: "));
		c=Integer.parseInt(JOptionPane.showInputDialog("INgrese el ultimo numero: "));
		if (a>= b && a>=c) {
			JOptionPane.showMessageDialog(null, c +b + a);
			
		} else {if (b>= a && a>=c) {
			
			JOptionPane.showMessageDialog(null, c +a + b);
		} else {
			if (c>= a && a>= b) {
				JOptionPane.showMessageDialog(null, b +a + c);
				
			} else {
				if (c >= b && b >= a) {
					JOptionPane.showMessageDialog(null, a +b + c);
					
				} else {
					JOptionPane.showMessageDialog(null, b +c + a);

				}

			}

		}

		}
		
		
	}

}
