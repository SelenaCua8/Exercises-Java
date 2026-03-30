package eNueve;

class ENueve {

	public static void main(String[] args) {
		
		String [] nombres = {"Fernando", "Manuel", "Alfredo"};
		int[] edades = {33,40,18};
		
		int indiceMayor = 0;
		
		for (int i = 0; i < edades.length; i++) {
			if(edades[i]> edades[indiceMayor]) {
				indiceMayor = i;
			}
			
		}

		System.out.println("La persona con mas edad: " + edades[indiceMayor] + nombres[indiceMayor]);
	}

}
