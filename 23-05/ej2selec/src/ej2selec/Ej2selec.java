package ej2selec;

import javax.swing.JOptionPane;

class Ej2selec {

	public static void main(String[] args) {
		double cantidadHoras, cantidadExtras, precioHora = 0, precioExtra = 0, total = 0;
		int categoria;
		
		cantidadHoras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas: "));
		cantidadExtras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas extras trabajadas: "));
		categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese categoria: " + "\n 1\n2\n3"));
		
		switch (categoria) {
		case 1:
			precioHora = 14;
			precioExtra = 20.50;
			
			break;
	case 2:
		precioHora = 17;
		precioExtra = 24;
			
			break;
	case 3:
		precioHora =21;
		precioExtra =34;
		break;

		}
		if (cantidadExtras>=30) {
			total = (precioHora * cantidadHoras) + (precioExtra * cantidadExtras) * 0.93;
			
		}else {
            total = (precioHora * cantidadHoras) + (precioExtra * cantidadExtras);
        }
		
		JOptionPane.showMessageDialog(null, "USted eligio la categoria: " + categoria +"\nSu precio por hora es de: " + precioHora + "\nPrecio cantidad horas extra: " + precioExtra + "\nUsted"
				+ "hizo un total de " + cantidadHoras + "de horas \n y un total de horas extras : " + cantidadExtras
				+"\nY se le va a pagar un total de: " +total);
	}
	

}
