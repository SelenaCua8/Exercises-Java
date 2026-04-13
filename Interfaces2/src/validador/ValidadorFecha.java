package validador;

import java.sql.Date;

public class ValidadorFecha implements ValidadorEntrada{

	@Override
	public boolean validar(EntradaUsuario entrada) {
		
		Date hoy = new Date(0); // Crea una fecha con el momento actual
	    
	    // Si la fecha existe Y es anterior a "ahora"
	    return entrada.fecha != null && entrada.fecha.before(hoy);
	}

}
