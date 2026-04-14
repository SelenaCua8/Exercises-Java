package singleton;

public class GestorTransferencias {
	// 1. Atributo estático que guardará nuestra única instancia
    private static GestorTransferencias instanciaUnica;
    
    // 2. Constructor PRIVADO: Nadie de afuera puede usar "new"
    private GestorTransferencias() {
        System.out.println("--- Gestor de Transferencias Inicializado ---");
    }
    
    // 3. Método público para obtener la instancia
    public static GestorTransferencias getInstance() {
        if (instanciaUnica == null) {
            // Solo se crea la primera vez que lo piden
            instanciaUnica = new GestorTransferencias();
        }
        return instanciaUnica;
    }
    
    // Un método cualquiera para probar que funciona
    public void transferir(double monto, String origen, String destino) {
        System.out.println("Transfiriendo $" + monto + " de " + origen + " a " + destino);
    }

}

/*
 * En el código que vimos:
 * 	private static GestorTransferencias instanciaUnica;
 * private: Es un modificador de acceso (esta sí es palabra reservada).
 * Significa que nadie desde fuera de la clase puede verla o tocarla.
 * static: (Palabra reservada). Es la más importante aquí. Significa que la variable 
 * pertenece a la clase y no a un objeto específico. Gracias a esto, todos los que llamen 
 * a la clase verán la misma variable.
 * GestorTransferencias: Es el tipo de dato (en este caso, la misma clase que estamos 
 * creando).
 * instanciaUnica: Es el identificador (el nombre que vos elegiste).*/
