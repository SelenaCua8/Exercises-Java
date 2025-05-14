package craps;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		d=(int)(Math.random()*6+1);
		
		JOptionPane.showMessageDialog(null, "Pase ingles", "tirar dado", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Craps.class.getResource("/img/dado" + d + ".png")));
		
		

	}

}
