package validador;

public class ValidadorRango implements ValidadorFormulario{

	@Override
	public boolean validar(Formulario form) {
		if(form.validadorRango >= 1 && form.validadorRango <= 100) {
		    return true;
		} else {
		    return false;
		}
	}

}
