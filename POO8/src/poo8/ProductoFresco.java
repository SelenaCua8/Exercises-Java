package poo8;

public class ProductoFresco extends Producto {
	private int diasCaducidad;

	ProductoFresco( String nombre, double precio) {
		this("",0,0);
	}

	public ProductoFresco(String nombre, double precio, int diasCaducidad) {
	    super(nombre, precio); // Esto manda el nombre y precio a la clase Producto
	    this.diasCaducidad = diasCaducidad;
	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	@Override
	public double comprar(int cantidad) throws IllegalArgumentException {
		
		double precioFinal = super.comprar(cantidad);
		
		if(this.diasCaducidad>= 3 && this.diasCaducidad <= 5) {
			precioFinal *=  0.6;
			
		}else if( this.diasCaducidad< 3) {
			precioFinal *= 0.3;
		}
		
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "ProductoFresco [diasCaducidad=" + diasCaducidad + ", getDiasCaducidad()=" + getDiasCaducidad()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
	

}
