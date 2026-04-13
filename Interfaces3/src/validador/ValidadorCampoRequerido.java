package validador;

public class ValidadorCampoRequerido implements ValidadorFormulario{

	@Override
	public boolean validar(Formulario form) {
		
		
		// Simplemente devolvemos el valor del boolean.
        // Si es true, devuelve true. Si es false, devuelve false.
        if (form.campoObligatorio) { 
            return true;
        } else {
            return false;
        }
	}
	

}
