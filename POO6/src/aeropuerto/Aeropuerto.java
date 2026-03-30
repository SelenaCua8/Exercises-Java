package aeropuerto;



public abstract class Aeropuerto {
	
	private int id;
	private String nombre;
	private int anioInauguracion;
	private int capacidad;
	
	//para que sea incrementado el id
	
	private static int idAutonumerado = 1;
	
	public Aeropuerto() {
		this("", 0, 0);
		
		
	}


	public Aeropuerto(String nombre, int anioInauguracion, int capacidad) {
		super();
		
		this.nombre = nombre;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		this.id = Aeropuerto.idAutonumerado++;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnioInauguracion() {
		return anioInauguracion;
	}


	public void setAnioInauguracion(int anioInauguracion) {
		this.anioInauguracion = anioInauguracion;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public static int getIdAutonumerado() {
		return idAutonumerado;
	}


	public static void setIdAutonumerado(int idAutonumerado) {
		Aeropuerto.idAutonumerado = idAutonumerado;
	}
	
	
	// BIEN: Solo la firma del método
	public abstract void gananciasTotales(int cantidad);


	@Override
	public String toString() {
		return "Aeropuerto [id=" + id + ", nombre=" + nombre + ", anioInauguracion=" + anioInauguracion + ", capacidad="
				+ capacidad + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getAnioInauguracion()="
				+ getAnioInauguracion() + ", getCapacidad()=" + getCapacidad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	
	

}
