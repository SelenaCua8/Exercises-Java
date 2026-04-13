package interfaces;

public class ValidadorEmail implements Validador{

	@Override
	public boolean validar(String texto) {
		if(texto.contains("@" ) && texto.length()>5) {
			return true;
			
		}else {
			return false;
		}
	}
	

}
