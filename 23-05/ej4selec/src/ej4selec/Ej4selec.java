package ej4selec;

import javax.swing.JOptionPane;

public class Ej4selec {
	public static void main(String[] args) {
		boolean error = false;
		String prod;
		double precio = 0, tot;
		int tipo, cant;

		prod = JOptionPane.showInputDialog("Ingresar producto a o b");

		switch (prod.toUpperCase()) {
		case "A":
			tipo = Integer.parseInt(JOptionPane.showInputDialog("1-Otoño\n2-Primavera\n3-Marino"));
			switch (tipo) {
			case 1:
				precio = 1.50;

				break;
			case 2:
				precio = 1.55;
				break;
			case 3:
				precio = 1.60;
				break;

			default:
				error=true; //uso el boolean
				break;
			}
			break;
		case "B":
			tipo = Integer.parseInt(JOptionPane.showInputDialog("1-Grande\n2-Mediano\n3-Chico"));
			switch (tipo) {
			case 1:
				precio = 2.05;

				break;
			case 2:
				precio = 1.60;
				break;
			case 3:
				precio = 1.10;
				break;

			default:
				error=true; //uso el boolean
				break;
			}
			break;
		default:
			error = true;
			break;
		}
		if ( error) { //asume error=true
			JOptionPane.showMessageDialog(null, "Erorr en el ingreso");
			
		} else {
			cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
			tot = precio * cant;
			if (tot>100) {
				tot=tot*0.90;
				
			}
			JOptionPane.showMessageDialog(null, "Paga: " + tot);

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
