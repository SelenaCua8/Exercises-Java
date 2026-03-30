package poo1;

import java.util.Objects;

public class Libro {
	private String isbn;
	private String titulo;
	private int paginas;
	private String autor;
	private boolean prestado = false;
	
	
	//Getters && Setters
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//constructor
	Libro(String isbn, String titulo, int paginas, String autor, boolean prestado) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.paginas = paginas;
		this.autor = autor;
		this.prestado = prestado;
	}
	Libro() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	public void prestar() {
		if(this.prestado) {
			System.out.println("Este libro ya esta prestadp");
		}else {
			this.prestado = true;
			System.out.println("El libro se ha prestado");
		}
	}
	
	public void devolver() {
		if(!this.prestado) {
			System.out.println("Este libro no esta prestado");
		}else {
			this.prestado = false;
			System.out.println("El libro se ha devuelto");
		}
		
	}
	
	public double imprimir(double costo) {
		return costo * this.paginas;
	}
	
	
	
	@Override
	public String toString() {
		
		
		String mensaje = "El libro " + this.isbn + " con titulo " + this.titulo + " y autor" +
 this.autor	+ " tiene " + this.paginas;
		
		if(!this.prestado) {
			mensaje += " no esta prestado";
		}
		
		mensaje += "esta prestado";
		
		return mensaje;
	}
	
	
	
	
	

}
