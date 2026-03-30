package eSiete;

class ESiete {

	public static void main(String[] args) {
		int[] numeros = {10,40,33,59,67,88};
		int suma = 0;
	
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
			
			
			
		}
		
		double media = (double) suma / numeros.length;	
		System.out.println("La suma es de: " + suma);
		System.out.println("La media es de: " + media);

}
}
