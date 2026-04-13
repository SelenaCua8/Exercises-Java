package interfaces;

public class ValidadorContrasena implements Validador{

	@Override
	public boolean validar(String texto) {
		if(texto.matches("a-z" ) && texto.length()>5) {
			return true;
			
		}else {
			return false;
		}
		
	}

	
	/*OTRA FORMA DE HACERLO
	 * 
	 * 
	 * @Override
	 * public boolean validar(String texto) {
	 * return texto.contains("@") && texto.length() > 5;
	 * }
	 * 
	 * 
	 * 
	 * */
}
