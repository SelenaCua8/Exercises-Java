package ej3cond;
import javax.swing.JOptionPane;

class Ej3cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m; // 0 o 1
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de moneda: \n"
				+ "0-cara \n1-ceca"));
if (m==0) {
	JOptionPane.showConfirmDialog(null," Tiene parcialito");
	
} else {
	
	JOptionPane.showConfirmDialog(null," El tp1 tiene nota de concepto");
}
	}

}
