package estructuras;

import javax.swing.JOptionPane;

class Estructuras {

	public static void main(String[] args) {
		int tot = 0, c;
		
		for (int i = 1; i <=4; i++) {
			c=(int)(Math.random()*12+1);
			tot +=c;
			System.out.println("carta: " + c);
		}
		
		System.out.println("total: " + tot);

	}

}
