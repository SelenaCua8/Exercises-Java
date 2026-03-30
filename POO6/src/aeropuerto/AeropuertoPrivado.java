package aeropuerto;


public class AeropuertoPrivado extends Aeropuerto {
	private int numeroSocios;

	// Cambiá tu constructor por este:
	public AeropuertoPrivado(String nombre, int anio, int capacidad, int numeroSocios) {
	    super(nombre, anio, capacidad); // <--- Esto es la clave: le avisamos a la madre
	    this.numeroSocios = numeroSocios;
	}

	public AeropuertoPrivado() {
	    this("", 0, 0, 0); 
	}

	public int getNumeroSocios() {
		return numeroSocios;
	}

	public void setNumeroSocios(int numeroSocios) {
		this.numeroSocios = numeroSocios;
	}

	@Override
	public void gananciasTotales(int cantidad) {
		double ganancias = cantidad / this.numeroSocios;
		System.out.println("Cada socio ha ganado:  " + ganancias);
	}

	@Override
	public String toString() {
		return super.toString() + "AeropuertoPrivado [numeroSocios=" + numeroSocios + "]";
	}
	
	
	
	
	

}
