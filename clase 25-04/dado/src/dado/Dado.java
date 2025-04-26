package dado;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dado {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "tirar dado", "dados", JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(Dado.class.getResource("/img/dadosani.gif")));
		
		String nom;
		nom=(String)JOptionPane.showInputDialog(null, "Ingrese nombre", "dado", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Dado.class.getResource("/img/dadosani.gif")), null, null);
		
		//ingresa su nombre y queda guardada la variable
		
		String n;
		int num;
		n=(String)JOptionPane.showInputDialog(null, "Ingrese numero", "dado", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Dado.class.getResource("/img/dadosani.gif")), null, null);
		
		num=Integer.parseInt(n);
		JOptionPane.showMessageDialog(null, "numero: "+ num);
		
		
		
	}

}
