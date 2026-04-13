package interface1;

public class ValidarCuentaActiva implements InterfazValidador{

	@Override
	public boolean validar(Transaccion transaccion) {
		
		return transaccion.cuentaOrigenActiva; // Si es true, pasa la validación
	}
	
	

}
