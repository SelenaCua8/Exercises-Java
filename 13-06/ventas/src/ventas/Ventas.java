package ventas;

import javax.swing.JOptionPane;

class Ventas {

	public static void main(String[] args) {
		double tot= 0, max=1, min=999999;
		double[]vta= new double [7];
		for (int i = 0; i < vta.length; i++) {
			vta[i]=Double.parseDouble(JOptionPane.showInputDialog("Venta"));
			System.out.println("Venta: " + i + ":" + vta[i]);
			
			
		}
		for (int i = 0; i < vta.length; i++) {
			tot+=vta[i];
			if(vta[i]>max) {
				max=vta[i];
			}
			if(vta[i]<min) {
				min=vta[i];
			}
		}
JOptionPane.showMessageDialog(null, "Total de ventas: " + tot + "\nventa maxima: " + max + "\nVenta minima: " + min);
	}

}
