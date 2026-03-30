package EDos;

import javax.swing.JOptionPane;

class EDos {

	public static void main(String[] args) {
		
		// 1. Guardamos la entrada en un String primero
				String input = JOptionPane.showInputDialog("Ingrese el valor del producto y le diremos cuánto queda con IVA: ");
				
				// 2. Convertimos el String a float usando Float.parseFloat
				float number = Float.parseFloat(input);
				
				float resultado = 0;
				
				if(number != 0) {
					// Ojo: Si multiplicas por 1.21, ya estás sumando el 21%. 
					// Si después le sumás 'number' otra vez, ¡estás cobrando el IVA doble!
					// La cuenta correcta es solo: number * 1.21
					resultado = number * 1.21f; 
				}
				
				// 3. Corregí el error de tipeo: era 'resultado', no 'resutlado'
				JOptionPane.showMessageDialog(null, "El valor del producto con IVA es de: " + resultado);
	}

}
