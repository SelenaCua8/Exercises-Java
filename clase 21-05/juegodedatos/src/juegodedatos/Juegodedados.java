package juegodedatos;

import javax.swing.JOptionPane;

class Juegodedados {

	public static void main(String[] args) {
		int d;
		d=(int)(Math.random()*6+1);
		
		switch (d) {
		case    1,3,5:
			JOptionPane.showMessageDialog(null, "Tienen parcialito");
			
			break;
case  2:
	JOptionPane.showMessageDialog(null, "Pueden comprar dolares");
			break;
case 6:
	JOptionPane.showMessageDialog(null, "Tienen 10 minutos mas en el parcial");
	
	break;


		}

	}

}
