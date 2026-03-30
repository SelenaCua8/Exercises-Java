package poo1;

class App {

	public static void main(String[] args) {
		Libro libro = new Libro("123475895", "Cien años de soledad", 500, "Gabrieñ GarciaMarquez", false);
		System.out.println(libro);
		
		libro.prestar();
		System.out.println(libro);
		libro.devolver();
		libro.devolver();
		System.out.println(libro);
		
		double costeImpresion = libro.imprimir(5);
		
		System.out.println("El costo ha sido de " + costeImpresion);
		
	}

}
