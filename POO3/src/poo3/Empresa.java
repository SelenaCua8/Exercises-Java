package poo3;

public class Empresa {
	
	private String CIF;
	private String nombre;
	
	Empresa(String cIF, String nombre) {
		super();
		CIF = cIF;
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empresa [CIF=" + CIF + ", nombre=" + nombre + ", getCIF()=" + getCIF() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
