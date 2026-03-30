package poo3;

public class Validator {
	
	public static void validarDNI(String DNI) {
	    if (DNI == null || !DNI.matches("\\d{1,8}[A-Za-z]")) {
	        throw new IllegalArgumentException("DNI Inválido");
	    }
	
		
	}

}
