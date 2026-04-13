package interface1;

public class ValidarMonto implements InterfazValidador{

	@Override
	public boolean validar(Transaccion transaccion) {
		
		return transaccion.trans1 > 0;
	}

}
