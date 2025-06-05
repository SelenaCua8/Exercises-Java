package ejCincoMientras;

import javax.swing.JOptionPane;

public class EjCincoMientras {

	public static void main(String[] args) {
		int totalAlumnas = 0, totalAlumnos = 0, alumnasAptas = 0, alumnosAptos = 0;
		int porcentajeAlumnasAptas = 0, porcentajeAlumnosAptos = 0, totalAlumnes = 0;
		double peso, altura;
		String sexo, registro;

		registro = JOptionPane.showInputDialog("¿Quiere ingresar un registro de alumnos aptos para jugar al básquet? (sí/no)");

		while (!registro.equalsIgnoreCase("no")) {
			sexo = JOptionPane.showInputDialog("Ingrese sexo (M = masculino, F = femenino)");

			peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso en kg:"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura en metros:"));

			if (sexo.equalsIgnoreCase("f")) {
				totalAlumnas++;

				if (altura >= 1.73 && peso >= 55 && peso <= 83) {
					alumnasAptas++;
				}

			} else if (sexo.equalsIgnoreCase("m")) {
				totalAlumnos++;

				if (altura >= 1.83 && peso >= 73 && peso <= 105) {
					alumnosAptos++;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error: sexo ingresado no válido.");
			}

			registro = JOptionPane.showInputDialog("¿Quiere ingresar otro registro? (sí/no)");
		}

		
		totalAlumnes = totalAlumnas + totalAlumnos;

		if (totalAlumnas > 0) {
			porcentajeAlumnasAptas = alumnasAptas * 100 / totalAlumnas;
		}
		if (totalAlumnos > 0) {
			porcentajeAlumnosAptos = alumnosAptos * 100 / totalAlumnos;
		}

		JOptionPane.showMessageDialog(null,
				"Total alumnas relevadas: " + totalAlumnas +
				"\nCantidad alumnas aptas para jugar: " + alumnasAptas +
				"\nPorcentaje de alumnas aptas: " + porcentajeAlumnasAptas + "%" +
				"\nTotal alumnos relevados: " + totalAlumnos +
				"\nCantidad alumnos aptos para jugar: " + alumnosAptos +
				"\nPorcentaje de alumnos aptos: " + porcentajeAlumnosAptos + "%" +
				"\nTotal de alumnos relevados: " + totalAlumnes);
	}
}

