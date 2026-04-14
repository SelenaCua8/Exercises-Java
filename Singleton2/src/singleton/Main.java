package singleton;

public class Main {
    public static void main(String[] args) {
        // Pedimos la sesión
        SesionUsuario sesion = SesionUsuario.getInstance();
        
        // Iniciamos sesión (Simulamos lo que pide la consigna: Administrador) [cite: 26, 31]
        sesion.iniciarSesion("Selena", "Administrador");

        // En otra parte del código, pedimos la sesión de nuevo
        SesionUsuario otraReferencia = SesionUsuario.getInstance();
        
        System.out.println("Usuario logueado: " + otraReferencia.getNombreUsuario());
        
        if (sesion == otraReferencia) {
            System.out.println("✅ Es la misma sesión en todo el sistema.");
        }
    }
}