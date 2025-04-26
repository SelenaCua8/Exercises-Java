package numerosAzar;

import javax.swing.JOptionPane;

class NumerosAzar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado, rango, n;
		double n1, sueldo;
		dado=(int)(Math.random()*6+1);//1-6
		rango=(int)(Math.random()*11+10);//10-20
		n=(int)(Math.random()*750);//0-749
		n1=Math.random();
		sueldo=Math.random()*500000;
		
		JOptionPane.showMessageDialog(null, "Dado: " + dado + "\nRando: " + rango + "\n0-750: " + n + "\nValor 0-1"
		+ n1 + "\nSueldo: " + sueldo);
		
		
		

	}

}
