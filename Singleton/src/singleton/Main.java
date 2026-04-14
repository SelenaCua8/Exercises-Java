package singleton;

/*
 * CONSIGNAS EJERCICIO
 * aplicar el patron singleton para crear una instancia unica que maneje 
 * las transferencias del banco
 * 
 * 🛠️ ¿Cómo se construye un Singleton?
 * Para que una clase sea Singleton, tenés que seguir tres reglas de oro:
 * 1-Constructor privado: Para que nadie pueda hacer un new GestorTransferencias() 
 * desde afuera.
 * 2-Atributo estático privado: Donde guardamos la "única instancia".
 * 3-Método estático público: (Generalmente llamado getInstance()) que es la única puerta de entrada para obtener esa instancia.
 * */

class Main {

	public static void main(String[] args) {
		// NO PODÉS HACER ESTO (Daría error):
        // GestorTransferencias g = new GestorTransferencias();

        // LA FORMA CORRECTA:
        GestorTransferencias gestor1 = GestorTransferencias.getInstance();
        GestorTransferencias gestor2 = GestorTransferencias.getInstance();

        gestor1.transferir(1500.0, "Cuenta A", "Cuenta B");

        // Comprobación de que son el mismo:
        if (gestor1 == gestor2) {
            System.out.println("✅ ¡Son la misma instancia! El Singleton funciona.");
        }

	}

}
