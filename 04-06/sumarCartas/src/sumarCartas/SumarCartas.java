package sumarCartas;

import javax.swing.JOptionPane;

class SumarCartas {

	public static void main(String[] args) {
		int tot = 0, c;
		c=(int)(Math.random()*12+1);
		System.out.println("carta: " + c);
		while (c!=1) {
			tot+=c;
			c=(int)(Math.random()*12+1);
			System.out.println("carta: " + c);
			
		}
		JOptionPane.showMessageDialog(null, "suma: " + tot ) ;

	}

}
