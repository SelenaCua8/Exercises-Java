package ej6cond;
import javax.swing.JOptionPane;
class Ej6cond {

	public static void main(String[] args) {
		int moneda = 0;
		moneda=(int)(Math.random()* 2);
		if(moneda == 0) {
			JOptionPane.showConfirmDialog(null, "Tienen parcialito");
		}else
		{
			JOptionPane.showConfirmDialog(null, "El tp1 lleva nota de concepto");
		}
		
	}

}
