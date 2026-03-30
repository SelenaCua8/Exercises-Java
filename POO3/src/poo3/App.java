package poo3;

class App {

	public static void main(String[] args) throws Exception {
		
		Empresa empresa = new Empresa("123", "empresa");
	    
	    try {
	        Empleado empleado1 = new Empleado("12345678A", " Fernando", 34, Departamento.INFORMATICA, true, empresa);
	        Empleado empleado2 = new Empleado("2345B", "Selena", 26, Departamento.DIRECCION, false, empresa);
	        
	        System.out.println("Empleados creados con éxito");
	        System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
	        System.out.println("Sueldo empleado w: " + empleado2.calcularSueldo());
	        
	        Empleado.setSalarioBase(3000);
	        System.out.println("Con cambio de salario");
	        System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
	        System.out.println("Sueldo empleado w: " + empleado2.calcularSueldo());
	        
	        
	    } catch (Exception e) {
	        System.out.println("Error al crear empleado: " + e.getMessage());
	    }
	    
	    
}}
