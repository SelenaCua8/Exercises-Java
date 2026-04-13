package validador;

public class ValidadorTexto implements ValidadorEntrada{

	@Override
	public boolean validar(EntradaUsuario entrada) {
		// Esto ya devuelve true o false automáticamente
	    return entrada.texto.length() > 0;
	}

}
