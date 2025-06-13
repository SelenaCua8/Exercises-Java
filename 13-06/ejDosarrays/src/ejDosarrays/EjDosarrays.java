package ejDosarrays;

import javax.swing.JOptionPane;

class EjDosarrays {

	public static void main(String[] args) {
		int notaGeneralA, notaGeneralB;
		double promA =0, promB =0, sumaa=0, sumab=0;
		int[]cursoA= new int [5];
		int[]cursoB= new int [5];
		
		
		
		for (int i = 0; i < cursoA.length; i++) {
			cursoA[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota curso A_"));
			System.out.println("Venta: " + i + ":" + cursoA[i]);
			sumaa+=cursoA[i];
			
			
			
			
			
		}
		for (int i = 0; i < cursoB.length; i++) {
			cursoB[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingreso nota curso B: "));
			System.out.println("Venta: " + i + ":" + cursoB[i]);
			sumab+=cursoB[i];
			
			
		}
		promA =sumaa/ 5;
		promB =sumab/ 5;
		
		if (promA>promA) {
			JOptionPane.showMessageDialog(null, "El mayor promedio general lo tiene el curso A y es de: " + promA) ;
			
		} else if (promB>promA) {
			JOptionPane.showMessageDialog(null, "El mayor promedio general lo tiene el curso B y es de: " + promB);
			
		} else {
			JOptionPane.showMessageDialog(null, "Las notas son iguales" + "promedio de A: " + promA + "promedio de B" + promB);

	
			

		}
	}

}
