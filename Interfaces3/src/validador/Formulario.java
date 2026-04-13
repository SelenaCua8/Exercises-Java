package validador;

public class Formulario {
	
	boolean campoObligatorio = false;
	int validadorRango = 0;
	String validadorFormatoEmail = "";
	
	
	public Formulario(boolean campoObligatorio, int validadorRango, String validadorFormatoEmail) {
		super();
		this.campoObligatorio = campoObligatorio;
		this.validadorRango = validadorRango;
		this.validadorFormatoEmail = validadorFormatoEmail;
	}

}
