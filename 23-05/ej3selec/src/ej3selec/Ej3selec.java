package ej3selec;

import javax.swing.JOptionPane;

class Ej3selec {

	public static void main(String[] args) {
		double notaCuatri, promedio;
		int carrera;
		String beca = "";

		notaCuatri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del cuatrimestre:  "));
		promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio:  "));
		carrera = Integer.parseInt(JOptionPane.showInputDialog(
				"Eliga la carrera: \n1-Economia \n2-Informatica \n3-Agronomia \n4-Contabilidad \n5-Quimica \n6-Sistemas"));

		switch (carrera) {
		case 1, 4:if (notaCuatri>=6 && promedio >= 9) {
			beca = "Usted puede acceder a la beca";
			
			
		}else {
			beca = "No puede acceder a la beca";
		}

			break;
		case 2, 6:if (notaCuatri>6 && promedio > 9.2) {
			beca = "Usted puede acceder a la beca";
			
			
		}else {
			beca = "No puede acceder a la beca";
		}

			break;
		case 3, 5:if (notaCuatri>=5 && promedio >= 8.8) {
			beca = "Usted puede acceder a la beca";
			
			
		}else {
			beca = "No puede acceder a la beca";
		}

			break;

	
		}
		JOptionPane.showMessageDialog(null, beca);

	}


}
