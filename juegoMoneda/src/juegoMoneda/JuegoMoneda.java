package juegoMoneda;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class JuegoMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		String nom;
		//cuadro ingreso JOptionPane.showInputDialog(null, "Mensaje","titulo","tipo de cuadro",icono, null, null)
		
		//cuadro de mensajer JOptionPane.showmessagedialog(null "mensaje", "titulo", "tipo de cuadro", "icono");
		
		nom=(String) JOptionPane.showInputDialog(null, "ingrese su nombre: ", "Juego moneda", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(JuegoMoneda.class.getResource("/img/monedaani.gif")), null, null);
		
		JOptionPane.showMessageDialog(null, "Bienvenidos a nuestro juego "+ nom);
		m=(int)(Math.random()*2);
		if (m==0) {
			JOptionPane.showMessageDialog(null, "Tienen parcialito", "Juego Moneda", JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(JuegoMoneda.class.getResource("/img/cara.png")));
			
		} else {
JOptionPane.showMessageDialog(null, "El tp 1 tiene nota de concepto", "Juego Moneda", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(JuegoMoneda.class.getResource("/img/ceca.png")));
		}

	}

}
