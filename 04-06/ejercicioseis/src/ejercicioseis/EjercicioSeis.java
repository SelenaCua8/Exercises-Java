package ejercicioseis;

import javax.swing.JOptionPane;

class EjercicioSeis {

	public static void main(String[] args) {
		int n, num, max=0, min=9999,rango;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad:"));
		for (int i = 1; i <=n; i++) {
			num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
			if(num < min) {
				min=num;
			}
			if (num>max) {
				max=num;
				
			}
			
		}
		rango= max - min;
		JOptionPane.showMessageDialog(null, "El rango es: " + rango);

	}

}
