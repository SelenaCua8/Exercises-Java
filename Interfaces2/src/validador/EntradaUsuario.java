package validador;

import java.util.Date;

public class EntradaUsuario {
	
	public String usuario;
	public double validadorNum;
	public String texto;
	public Date fecha;
	public EntradaUsuario(String usuario, double validadorNum, String texto, Date fecha) {
		
		this.usuario = usuario;
		this.validadorNum = validadorNum;
		this.texto = texto;
		this.fecha = fecha;
	}
	
	
	

}
