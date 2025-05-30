package ej5for;

import javax.swing.JOptionPane;

class Ej5for {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int n, personas, contUno, contDos, contTres, contCuatro;
		personas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas son: "));
		
		for (int i = 1; i <= personas; i++) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo: "));
			if (n<=500) {
				contUno= n;
				System.out.println("Usted esta de bajo o igual de los 500" + "cobra;" + contUno);
				
				
			}else if (n<=1000) {
				contDos= n;
				System.out.println("Usted esta de bajo o igual de los 1000" + "cobra;" + contDos);
				
			} else if (n<=2000) {
				contTres= n;
				System.out.println("Usted esta entre 1000 y 2000" + "cobra;" + contTres);
				
			} else if (n>=2000) {
				contCuatro= n;
				System.out.println("Usted esta arriba de los 2000" + "cobra;" + contCuatro);
			} else {
				System.out.println("Usted es desempleado");

			
				

			

			}
		}*/ 
		int n,cd=0, c1=0, c2=0, c3=0, c4=0;
		double s, tot=0, max=-1;
		String nom, nmax="";
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad:" ));
		for (int i = 0; i <= n; i++) {
			nom=JOptionPane.showInputDialog("Ingrese nombre: ");
			s=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo:"));
			tot+=s;
			if (s==0) {
				cd++;
				
			} else if (s<500) {
				c1++;
				
			} else if (s<1000) {
				c2++;
				
			} else if (s<2000) {
				c3++;
			} else {
				c4++;

			

			}
			if (s>max) {
				max=s;
				nmax=nom;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "Sueldo pagados: " +  tot + " \nSueldo maximo: " + max
				+ "\nnombre sueldo maximo: " + nmax + "\ncant de desocupados: " + cd +
				"\ncant <500: " + c1 + "\ncant entre 500 y 100:" + c2 + "\ncant entre 1000 y 2000:" + c3 +
				"\ncant mayor a 2000:" + c4);
		

		
		
	

}}
