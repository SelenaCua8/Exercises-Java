package validador;

public class ValidadorFormatoEmail implements ValidadorFormulario{

	@Override
	public boolean validar(Formulario form) {
		// Accedemos a la variable de texto dentro del formulario
        if (form.validadorFormatoEmail.contains("@") && form.validadorFormatoEmail.length() > 5) {
            return true;
        } else {
            return false;
        }
	}
	}


