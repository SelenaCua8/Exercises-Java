package singleton;

/*
 * Imagina que estás trabajando en un sistema que necesita almacenar y acceder a 
 * la configuración global del programa.
 * Crea una clase llamada ConfiguracionSistema, que actuará como un Singleton para
 * gestionar la configuración del sistema. La clase debe tener atributos representando
 * configuraciones clave (por ejemplo, directorio de archivos, configuraciones de red, etc.).
 * Implementa un método estático getInstance que devuelva la única instancia de
 * ConfiguracionSistema. Crea métodos para obtener y modificar las configuraciones.
 * En el programa principal, utiliza la instancia única para acceder y modificar las 
 * configuraciones del sistema desde diferentes partes del código. Reflexiona sobre cómo
 * el patrón Singleton asegura que siempre estemos trabajando con la misma configuración
 * del sistema en todo el programa.
 * */

class Main {

	public static void main(String[] args) {
		// Obtenemos la instancia por primera vez
        ConfiguracionSistema configA = ConfiguracionSistema.getInstance();
        System.out.println("Directorio Inicial: " + configA.getDirectorioArchivos());

        // Modificamos la configuración desde configA
        configA.setDirectorioArchivos("/var/www/html/blog");

        // Obtenemos la instancia en otra parte del código (configB)
        ConfiguracionSistema configB = ConfiguracionSistema.getInstance();
        
        // ¡Magia! configB ya tiene el cambio que hizo configA
        System.out.println("Directorio visto desde B: " + configB.getDirectorioArchivos());

        if (configA == configB) {
            System.out.println("✅ Confirmado: Es la misma instancia.");
	
	}}


}
