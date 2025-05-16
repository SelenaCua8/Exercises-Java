package ejercicioCuatro;

import javax.swing.JOptionPane;

class EjercicioCuatro {

	public static void main(String[] args) {
		
		double notaUno, notaDos, notaTres, prom;
		
		notaUno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer nota: "));
		notaDos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
		notaTres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercer nota: "));
		
		
		
		if ((notaUno>=4) && (notaDos>=4) && (notaTres>=4)) {
			prom = (notaUno+notaDos+notaTres) / 3;
			JOptionPane.showConfirmDialog(null, "La materia está aprobada"+ "\nSu promedio es de: " + prom);
			
		} else if ((notaUno>=4) || (notaDos>=4) || (notaTres>=4)) {
			JOptionPane.showConfirmDialog(null, "Solo debe recuperar en la primer fecha");
		} else {
			JOptionPane.showConfirmDialog(null, "Debe presentarse en las dos fechas de recuperación :(");
		

		}

	}

}
