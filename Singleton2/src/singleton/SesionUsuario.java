package singleton;

import java.util.Date;

public class SesionUsuario {
	private static SesionUsuario instanciaUnica;
	
	//atributos
	private String nombreUsuario;
	private String rol;
	private Date fechaInicio;
	
	// 1. Constructor privado y VACÍO
    private SesionUsuario() {}
    
    // 2. Método getInstance (SÓLO para obtener la instancia)
    public static SesionUsuario getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new SesionUsuario();
        }
        return instanciaUnica;
    }
    
    // 3. Método para la lógica de negocio (Iniciar Sesión)
    public void iniciarSesion(String user, String rango) {
        this.nombreUsuario = user;
        this.rol = rango;
        this.fechaInicio = new Date(); // Fecha actual
        System.out.println("Sesión iniciada para: " + user);
    }

    public void cerrarSesion() {
        this.nombreUsuario = null;
        this.rol = null;
        this.fechaInicio = null;
        System.out.println("Sesión cerrada.");
    }

    // Getter para probar en el Main
    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
