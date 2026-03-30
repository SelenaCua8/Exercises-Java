package poo2;

import java.util.Objects;

public class ordenador {
	private String marca;
	private String modelo;
	private int ram = 4;
	private int discoDuro = 50;
	private double utilizado = 0;
	private boolean encendida = false;
	ordenador(String marca, String modelo, int ram, int discoDuro) throws Exception {
		
		
		if(!esPotenciaDe2(ram)) {
			throw new IllegalArgumentException("La RAM no es potencia de 2");
		}
		
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.discoDuro = discoDuro;
		
	}
	
	
	ordenador(int ram, int discoDuro) {
		super();
		this.ram = ram;
		this.discoDuro = discoDuro;
	}


	ordenador(int ram) {
		super();
		this.ram = ram;
	}


	ordenador() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}
	public double getUtilizado() {
		return utilizado;
	}
	public void setUtilizado(double utilizado) {
		this.utilizado = utilizado;
	}
	public boolean isEncendida() {
		return encendida;
	}
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ordenador other = (ordenador) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}
	
	
	public void prender() {
		if(!this.encendida) {
			System.out.println("El ordenador se esta prendiendo");
			this.encendida = true;
		}else {
			System.out.println("El ordenador esta apagado");
			
		}
	}
	
	public void apagar() {
		if(this.encendida) {
			System.out.println("El ordenador se esta apagando");
			this.encendida = false;
		}
	}
	
	public void transferirArchivos(int gb) {
		if(this.encendida) {
			
			if(this.utilizado + ram + gb <= this.discoDuro) {
				this.utilizado += gb;
				System.out.println("Transferidos " + gb + "  GB. Espacio actual: " + this.utilizado);
			}else {
				System.out.println("No hay espacio suficiente");
			}
			
			
			
		}else {
			System.out.println("El ordenador esta apagado");
		}
	}
	
	public void eliminarArchivoss(int gb) {
		if(this.encendida) {
			
			if(this.utilizado -  gb < 0) {
				this.utilizado = 0;
				System.out.println("Transferidos " + gb + "  GB. Espacio actual: " + this.utilizado);
			}else {
				this.utilizado -= gb;
			}
			
			
			
		}else {
			System.out.println("El ordenador esta apagado");
		}
	}
	
	private boolean esPotenciaDe2(int numero) {
		if(numero <= 0) {
			return false;
		}
		double logBase2 = Math.log(numero)/Math.log(2);
		return logBase2 == (int) logBase2;
	}
	
	@Override
	public String toString() {
		
		String estadoEncendido = "no";
		if(this.encendida) {
			estadoEncendido = "si";
		}
		
		
		return "ordenador [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", discoDuro=" + discoDuro
				+ ", utilizado=" + utilizado + ", encendida=" + encendida + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getRam()=" + getRam() + ", getDiscoDuro()=" + getDiscoDuro()
				+ ", getUtilizado()=" + getUtilizado() + ", isEncendida()=" + isEncendida() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
