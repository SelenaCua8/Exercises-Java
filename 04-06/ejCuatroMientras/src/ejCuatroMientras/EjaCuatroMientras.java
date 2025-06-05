package ejCuatroMientras;

import javax.swing.JOptionPane;

class EjaCuatroMientras {

	public static void main(String[] args) {
		String sexo;
		int matricula, contMujer=0, contVaron=0;
		double promedio, promMujer=0, promVaron=0;
		
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matricula o 0(cero) para salir"));
		
		while (matricula != 0) {
			
			sexo = JOptionPane.showInputDialog("Ingrese sexo F = femenino M = masculino");
			promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio: "));
			
			if (sexo.equalsIgnoreCase("f")) {
				contMujer++;
				if (promedio>promMujer) {
					promMujer = promedio;
					
				}
				
			} else if (sexo.equalsIgnoreCase("m")) {
				contVaron++;
				if (promedio>promVaron) {
					promVaron = promedio;
				}
				
			} else {
				JOptionPane.showMessageDialog(	null, "Error de datos");

			
				

			}
			matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matricula o 0(cero) para salir"));
			
			
		}
		JOptionPane.showMessageDialog(null, "Porcentaje poblacion fem: " + contMujer + 
				"\nporcentaje población másculino: " + contVaron + 
				"\nmejor promedio cuatrimestral femenino: " + promMujer 
				+ "\nMejor promedio cuatrimestral masculino: " + promVaron );
		
		
		

	}

}
