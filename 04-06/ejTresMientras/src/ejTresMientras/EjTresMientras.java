package ejTresMientras;

import javax.swing.JOptionPane;

class EjTresMientras {

	public static void main(String[] args) {
		double facturasRealizadas=0, montoFacturado=0, totalKv=0;
		String nombre, cliente, direccion;
		int registroInicial, registroFinal, kv;
				
		nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
		
		while (!nombre.equalsIgnoreCase("*")) {
			cliente = JOptionPane.showInputDialog("Ingrese cliente A B C o D");
			direccion =JOptionPane.showInputDialog("Ingrese direccion: ");
			
			registroInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro inicial: "));
			registroFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro Final: "));
			kv = registroFinal - registroInicial;
			
			if (cliente.equalsIgnoreCase("a") || cliente.equalsIgnoreCase("c")) {
				if (kv<140) {
					
				} else {

				}
				
			} else {

			}
			
			
			
			
			
			
		}
			
		}
				
				
			
	

}
