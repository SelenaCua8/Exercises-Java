package prestable;

public class Prestamo implements Prestable{
	
	private double cantidad;
	private double adeudo;
	private String titular;
	
	
	
	

	Prestamo(double cantidad, String titular) {
		super();
		this.cantidad = cantidad;
		this.titular = titular;
		this.adeudo = 0;
	}
	
	
	

	public double getCantidad() {
		return cantidad;
	}




	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}




	public String getTitular() {
		return titular;
	}




	public void setTitular(String titular) {
		this.titular = titular;
	}




	@Override
	public void prestar() {
	  this.adeudo += this.cantidad +(this.cantidad * 0.05);
	  System.out.println("Se ha prestado: " + this.cantidad + " $ al titular:  " + this.titular + "Adeudo total: " + this.adeudo);
		
	}

	@Override
	public void devolver() {
		if(this.adeudo<this.cantidad) {
			this.adeudo = 0;
		}else {
			this.adeudo -= this.cantidad;
		}
		
		System.out.println("Se ha devuelto: " + this.cantidad + " $ al titular:  " + this.titular + "Adeudo total: " + this.adeudo);
		
	}
	

}
