package eOcho;

class EOcho {

	public static void main(String[] args) {
		int[] numeros = {10,40,33,59,67,88,106,5,3,4,2,200, 400, 20};
		int mayor = 0;
		int menor = numeros[0];
		int array = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] <= menor) {
				menor = numeros[i];
			}else if(numeros[i]>= mayor){
				mayor = numeros[i];
			}
			
			
			
		}
		
		System.out.println("EL mayor es: " + mayor + " y el menor es: " + menor);
	}

}
