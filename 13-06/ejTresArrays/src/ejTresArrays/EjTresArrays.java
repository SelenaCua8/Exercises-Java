package ejTresArrays;

import javax.swing.JOptionPane;

class EjTresArrays {

	public static void main(String[] args) {
		int[]corredores= new int [10];
		double medio, max=1, min=99999, total=0;
		
		for (int i = 0; i < corredores.length; i++) {
			corredores[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempos de corredores: "));
			System.out.println("Tiempos: " + i + ":" + corredores[i]);
			
			total+=corredores[i];
			if(corredores[i]>max) {
				max=corredores[i];
				
				
			
			}
			if(corredores[i]<min) {
				min=corredores[i];
				
			}
			
		
			
			
		}
		for (int i = 0; i < corredores.length; i++) {
			
		}
	
		
		medio = total / 10;
		System.out.println("EL tiempo medio es de:" + medio);
		System.out.println("El perdedor: " + max);
		System.out.println("El ganador: " + min);
		
		
		

	}

}
