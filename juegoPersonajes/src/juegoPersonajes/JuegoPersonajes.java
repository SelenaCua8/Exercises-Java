package juegoPersonajes;

import javax.swing.JOptionPane;

class JuegoPersonajes {

	public static void main(String[] args) {
		String preguntaUno, preguntaDos, preguntaTres;
		String personaje;
		
		preguntaUno = JOptionPane.showInputDialog("¿Es mujer? ");
		preguntaDos = JOptionPane.showInputDialog("¿Pertenece a la casa Stark o es muy cercano a ellos?");
		preguntaTres = JOptionPane.showInputDialog("¿Tiene una característica física distintiva?");

		if(preguntaUno.equalsIgnoreCase("si") && preguntaDos.equalsIgnoreCase("si") && preguntaTres.equalsIgnoreCase("si")) {
			personaje = "Briene";
			
		} else if (preguntaUno.equalsIgnoreCase("si") && preguntaDos.equalsIgnoreCase("si") && preguntaTres.equalsIgnoreCase("no")) {
			personaje = "Arya";
			
		} else if (preguntaUno.equalsIgnoreCase("si") && preguntaDos.equalsIgnoreCase("no") && preguntaTres.equalsIgnoreCase("si")) {
			personaje = "no se quien es tu personaje";
			
		} else if (preguntaUno.equalsIgnoreCase("si") && preguntaDos.equalsIgnoreCase("no") && preguntaTres.equalsIgnoreCase("no")) {
			personaje = "Cersei";
		} else if (preguntaUno.equalsIgnoreCase("no") && preguntaDos.equalsIgnoreCase("si") && preguntaTres.equalsIgnoreCase("si")) {
			personaje = "Bran";
		} else if (preguntaUno.equalsIgnoreCase("no") && preguntaDos.equalsIgnoreCase("si") && preguntaTres.equalsIgnoreCase("si")) {
			personaje = "Jon";
		} else if (preguntaUno.equalsIgnoreCase("si") && preguntaDos.equalsIgnoreCase("no") && preguntaTres.equalsIgnoreCase("si")) {
			personaje = "Tyron";
		} else {
			personaje = "Jaime";

		

		}
		JOptionPane.showConfirmDialog(null, "Su personaje es: " + personaje);
		
			
		
		
	}

}
