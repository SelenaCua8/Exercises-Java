package ej5cond;
import javax.swing.JOptionPane;
class Ej5cond {

	public static void main(String[] args) {
		int cont = 0;
		String respuestaUno;
		String respuestaDos;
		String respuestaTres;
		
		respuestaUno = JOptionPane.showInputDialog("Ingrese la respuesta)"
				+ "correcta \n ¿Cua´s es la raiz cuadrada de 144?");
		if (respuestaUno.equals("12")) {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: 12");
			cont = cont +1;
			
		} else {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: " + respuestaUno);

		}
		respuestaDos = JOptionPane.showInputDialog("Ingrese la respuesta)"
				+ "correcta \n ¿Quién fundó Bs As?");
		if (respuestaDos.equalsIgnoreCase("Pedro Mendoza")) {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: Pedro Mendoza");
			cont =  cont +1;
			
		} else {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: " + respuestaDos);

		}
		respuestaTres = JOptionPane.showInputDialog("Ingrese la respuesta)"
				+ "correcta \n ¿Cuál es la capital de Francia?");
		if (respuestaTres.equalsIgnoreCase("paris")) {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: París");
			cont = cont +1;
			
		} else {
			JOptionPane.showConfirmDialog(null, "Su respuesta fue: " + respuestaTres);

		}
JOptionPane.showMessageDialog(null, "Cantidad de respuestas correctas: " + cont); 
	}
	

}
