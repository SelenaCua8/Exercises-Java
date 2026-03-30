package poo2;

class app {

	public static void main(String[] args) {
		try {
            System.out.println("--- Creando Ordenador 1 (Válido) ---");
            ordenador pc1 = new ordenador("HP", "Pavilion", 8, 500);
            System.out.println(pc1.toString());

            // 1. Probar encendido y apagado
            System.out.println("\n--- Probando encendido ---");
            pc1.prender(); // Debería prender
            pc1.prender(); // Debería decir que ya está prendido (o corregir el mensaje en tu código)

            // 2. Probar transferencia de archivos
            System.out.println("\n--- Probando transferencia ---");
            pc1.transferirArchivos(100); // Suma 100
            pc1.transferirArchivos(500); // Debería fallar por espacio

            // 3. Probar eliminar archivos
            System.out.println("\n--- Probando eliminación ---");
            pc1.eliminarArchivoss(50); // Quedan 50
            pc1.eliminarArchivoss(200); // Debería resetear a 0

            // 4. Probar apagado y acciones bloqueadas
            pc1.apagar();
            pc1.transferirArchivos(10); // Debería decir que está apagado

            System.out.println("\n--- Intentando crear Ordenador con RAM inválida ---");
            // Esto lanzará la excepción IllegalArgumentException
            ordenador pc2 = new ordenador("Dell", "G5", 7, 1000); 

        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }

	}

}
