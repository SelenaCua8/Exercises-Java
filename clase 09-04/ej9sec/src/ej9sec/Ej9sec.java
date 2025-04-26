package ej9sec;
import javax.swing.JOptionPane;

class Ej9sec {

	public static void main(String[] args) {
		
		double cantidadHoras, valorHora, sueldoBruto, descuentoObraSocial, jubilacion,
		sueldoNeto;
		cantidadHoras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas: "));
		valorHora = 25;
		sueldoBruto= cantidadHoras*valorHora;
		descuentoObraSocial = sueldoBruto * 0.07;
		jubilacion = sueldoBruto * 0.10;
		sueldoNeto = sueldoBruto - descuentoObraSocial - jubilacion;
		
		JOptionPane.showConfirmDialog(null, "\n Boleta electrónica: " + "\nEL sueldo básico es de: " + sueldoBruto + "\nEl valor de la obra social es " + descuentoObraSocial+ "\nLA jubilación es un total de: " + jubilacion + 
				"\nEl sueldo Neto descontando los impuestos es de: " + sueldoNeto );
		
		
		
		

	}

}
