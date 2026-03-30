package aeropuerto;

public class AeropuertoPublico extends Aeropuerto{
	
	private int financiacion;
	private int numeroTrabajadoresDiscapacitados;
	
	
	
	

	AeropuertoPublico() {
		this(0,0,"",0,0);
	}





	





	AeropuertoPublico(int financiacion, int numeroTrabajadoresDiscapacitados, String nombre, int anioInauguracion, int capacidad) {
		super(nombre, anioInauguracion,capacidad);
		this.financiacion = financiacion;
		this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
	}


	









	public int getFinanciacion() {
		return financiacion;
	}











	public void setFinanciacion(int financiacion) {
		this.financiacion = financiacion;
	}











	public int getNumeroTrabajadoresDiscapacitados() {
		return numeroTrabajadoresDiscapacitados;
	}











	public void setNumeroTrabajadoresDiscapacitados(int numeroTrabajadoresDiscapacitados) {
		this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
	}











	@Override
	public void gananciasTotales(int cantidad) {
		double ganancias = cantidad + this.financiacion + (this.numeroTrabajadoresDiscapacitados*1000);
		System.out.println("Las ganancias han sido de : " + ganancias);
	}











	@Override
	public String toString() {
		return super.toString() + "AeropuertoPublico: financiacion=" + financiacion + ", numeroTrabajadoresDiscapacitados="
				+ numeroTrabajadoresDiscapacitados ;
	}












	
	
	

}
