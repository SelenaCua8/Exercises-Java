package interface1;

public class ValidarLimiteDiario implements InterfazValidador {

    @Override
    public boolean validar(Transaccion transaccion) {
        // ¿El monto que quiero gastar es menor o igual a mi límite?
        // Esto devuelve TRUE si está todo bien, o FALSE si me pasé del límite.
        return transaccion.trans1 <= transaccion.limiteDisponible; 
    }
}