package validador;

public class ValidadorNumerico implements ValidadorEntrada{

	@Override
	public boolean validar(EntradaUsuario entrada) {
		
		if(entrada.validadorNum >= 0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	

}
