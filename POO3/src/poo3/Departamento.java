package poo3;

public enum Departamento {

	CONTABILIDAD(50),
	INFORMATICA(80),
	DIRECCION(100);
	
	private double plus;

	private Departamento(double plus) {
		this.plus = plus;
	}

	public double getPlus() {
		return plus;
	}

	
	
	
}

/*¿Qué es un enum y por qué no es una class común?
En Java, un enum es un tipo de dato especial que se usa 
para definir un conjunto de constantes que no van a cambiar.

Seguridad de Tipos: Si usás una String para el departamento,
 alguien podría escribir "contavilidad" (con error de ortografía) y tu programa fallaría. Con el enum, Java solo te permite elegir una de las opciones que definiste.

Legibilidad: En tu código de Spring Boot o JPA, es mucho más claro 
leer Departamento.CONTABILIDAD que un simple número o texto.*/
