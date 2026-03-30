package poo8;



public class Producto implements Comparable<Producto>{
	
	private int id;
	private String nombre;
	private double precio;
	
	private static int idAutoincrementado = 1;

	Producto(String nombre, double precio) {
		
		if(precio<0) {
			throw new IllegalArgumentException("El precio debe ser positivo");
		}
	
		this.nombre = nombre;
		this.precio = precio;
		this.id = Producto.idAutoincrementado++; //para que se autoincremente
	}

	Producto() {
		this("", 0);
		
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getIdAutoincrementado() {
		return idAutoincrementado;
	}

	public static void setIdAutoincrementado(int idAutoincrementado) {
		Producto.idAutoincrementado = idAutoincrementado;
	}

	public double comprar(int cantidad)	throws IllegalArgumentException{
		
		if(cantidad<0) {
			throw new IllegalArgumentException("El precio debe ser positivo");
		}
		
		
		return this.precio * cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Producto o) {
		if(this.precio<o.getPrecio()) {
			return -1;
		}else if(this.precio>o.getPrecio()){
			return 1;
			
		}
		return 0;
	}
	
	
	
	

}
