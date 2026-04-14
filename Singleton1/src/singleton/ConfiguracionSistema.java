package singleton;

public class ConfiguracionSistema {
	// 1. El atributo que guarda la instancia única (lo que ya tenías)
    private static ConfiguracionSistema instanciaUnica;
 // ATRIBUTOS DE CONFIGURACIÓN (Ejemplos de la consigna)
    private String directorioArchivos;
    private String configuracionRed;
    
 // 2. EL CONSTRUCTOR: Debe ser PRIVATE
    // Si intentaste generarlo con el IDE, seguro te lo puso PUBLIC y eso rompe el Singleton
    private ConfiguracionSistema() {
        // Valores por defecto
        this.directorioArchivos = "C:/usuarios/default";
        this.configuracionRed = "192.168.1.1";
    }
    
 // 3. Método getInstance
    public static ConfiguracionSistema getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new ConfiguracionSistema();
        }
        return instanciaUnica;
    }
    
 // MÉTODOS PARA OBTENER Y MODIFICAR (Getters y Setters)
    public String getDirectorioArchivos() { return directorioArchivos; }
    public void setDirectorioArchivos(String directorio) { this.directorioArchivos = directorio; }

    public String getConfiguracionRed() { return configuracionRed; }
    public void setConfiguracionRed(String red) { this.configuracionRed = red; }

}
