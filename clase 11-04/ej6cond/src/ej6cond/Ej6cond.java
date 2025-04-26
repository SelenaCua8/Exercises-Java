package ej6cond;
import javax.swing.JOptionPane;

class Ej6cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m3;
		
		
		m3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese metros cubicos consumidos: "));
		
		if (m3<=150) {
			JOptionPane.showConfirmDialog(null, "Usted abona $15.80 porque no se excedio del limite");
			
			
		} else {
			m3 = 15.80 + (m3-150)* 1.5;

		}
		JOptionPane.showConfirmDialog(null, "Usted pagara: " + m3);

	}

}

//calculo de excedentes exc = m3 - 150;