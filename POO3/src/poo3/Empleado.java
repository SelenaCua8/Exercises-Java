package poo3;

import java.util.Objects;

public class Empleado {
	
	private String dni;
	private String nombre;
	private int edad;
	private Departamento departamento;
	private boolean teletrabajo;
	private Empresa empresa;

	public static double salarioBase = 1000;

	Empleado(String dni, String nombre, int edad, Departamento departamento, boolean teletrabajo, Empresa empresa) throws Exception {
	
		
		try {
			Validator.validarDNI(dni);	
		}catch(Exception ex){
			throw new IllegalArgumentException(ex.getMessage());
			
		}
		
		if(empresa == null) {
			throw new IllegalArgumentException("La empresa es obligatoria");
			
		}
		
		
		
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.teletrabajo = teletrabajo;
		this.empresa = empresa;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public boolean isTeletrabajo() {
		return teletrabajo;
	}

	public void setTeletrabajo(boolean teletrabajo) {
		this.teletrabajo = teletrabajo;
	}

	// El Getter corregido
	public Empresa getEmpresa() {
	    return empresa;
	}

	// El Setter corregido
	public void setEmpresa(Empresa empresa) {
	    this.empresa = empresa;
	}

	public static double getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(double salarioBase) {
		Empleado.salarioBase = salarioBase;
	}
	
	public double calcularSueldo() {
		double salario = Empleado.salarioBase;
		
		if(this.edad>30) {
			salario += 200;
		}
		
		salario += this.departamento.getPlus();
		
		if(this.teletrabajo) {
			salario += 30;
		}
		return salario;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
				+ ", teletrabajo=" + teletrabajo + ", empresa=" + empresa + "]";
	}
	
	
	
	
	
	
	

}
