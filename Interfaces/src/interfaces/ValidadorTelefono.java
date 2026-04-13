package interfaces;

public class ValidadorTelefono implements Validador {

    @Override
    public boolean validar(String texto) {
        // [0-9]+ verifica que TODO el texto sean números
        // length() == 10 verifica la cantidad exacta
        if (texto.matches("[0-9]+") && texto.length() == 10) {
            return true;
        } else {
            return false;
        }
    }
}