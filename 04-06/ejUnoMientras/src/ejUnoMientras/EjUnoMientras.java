package ejUnoMientras;

import javax.swing.JOptionPane;

public class EjUnoMientras {

    public static void main(String[] args) {
    	int nota, tp = 0, escrito = 0, desaprobado = 0, aprobado = 0;
    	
    	nota =Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: "));
    	
    	while (nota>=0) {
    		if (nota < 4) {
    			desaprobado++;
				
			} 
				
				
			 else if (nota<7) {
				 escrito++;
				 aprobado++;
				
				
			} else if (nota>=7) {
				tp++;
				aprobado++;
				
			} else {
				JOptionPane.showMessageDialog(null, "error");

		

			}
    		nota =Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: "));
        	
			
		}
    	JOptionPane.showMessageDialog(null, "Cantidad de desaprobados: " + desaprobado + 
    			"\ncantidad que rinden escrito: " + escrito +
    			"\ncantidad que rinden tp: " + tp +
    			"\ncanitdad total de los que aprobaron pero rinden tp o escrito:" + aprobado);
    	
    	
    	
    	
    }
        
     
}
