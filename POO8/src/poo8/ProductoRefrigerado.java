package poo8;

public class ProductoRefrigerado extends Producto{
	private int cajon;

	ProductoRefrigerado(String nombre, double precio) {
		this(0,"", 0);
	}

	public ProductoRefrigerado(String nombre, double precio, int cajon) {
	    super(nombre, precio); // Esto manda el nombre y precio a la clase Producto
	    this.cajon = cajon;
	}
	
	
	public ProductoRefrigerado(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getCajon() {
		return cajon;
	}

	public void setCajon(int cajon) {
		this.cajon = cajon;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [cajon=" + cajon + ", getCajon()=" + getCajon() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
