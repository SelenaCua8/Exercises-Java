package validador;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        // 1. Creamos un objeto de prueba (Simulamos una entrada de usuario)
        // Datos: usuario, numero, texto, fecha
        EntradaUsuario miEntrada = new EntradaUsuario("Selena", 25.5, "Hola Mundo", new Date());

        // 2. Instanciamos los validadores
        ValidadorTexto vTexto = new ValidadorTexto();
        ValidadorNumerico vNum = new ValidadorNumerico();
        ValidadorFecha vFecha = new ValidadorFecha();

        // 3. Ejecutamos las validaciones individuales
        boolean textoValido = vTexto.validar(miEntrada);
        boolean numeroValido = vNum.validar(miEntrada);
        boolean fechaValida = vFecha.validar(miEntrada);

        // 4. Mostramos resultados por consola
        System.out.println("--- RESULTADOS DE VALIDACIÓN ---");
        System.out.println("¿Texto tiene contenido?: " + (textoValido ? "SÍ ✅" : "NO ❌"));
        System.out.println("¿Número es positivo?: " + (numeroValido ? "SÍ ✅" : "NO ❌"));
        System.out.println("¿Fecha es correcta?: " + (fechaValida ? "SÍ ✅" : "NO ❌"));

        System.out.println("---------------------------------");

        // 5. VALIDACIÓN COMPLEJA (Combinamos todo)
        // Imaginemos que para que el formulario sea válido, TODO debe estar bien
        if (textoValido && numeroValido && fechaValida) {
            System.out.println("🌟 ÉXITO: Todos los campos son correctos.");
        } else {
            System.out.println("⚠️ ERROR: Algunos campos no cumplen los requisitos.");
        }
    }
}