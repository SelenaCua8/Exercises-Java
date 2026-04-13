package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Creamos las instancias de tus validadores
        Validador vEmail = new ValidadorEmail();
        Validador vPassword = new ValidadorContrasena();
        Validador vTelefono = new ValidadorTelefono();

        // Datos de prueba
        String emailPrueba = "juan@mail.com";
        String passPrueba = "abc"; // Muy corta, debería fallar
        String telPrueba = "1234567890";

        System.out.println("--- RESULTADOS DE VALIDACIÓN ---");
        
        System.out.println("¿Email válido? (" + emailPrueba + "): " + vEmail.validar(emailPrueba));
        System.out.println("¿Pass válida? (" + passPrueba + "): " + vPassword.validar(passPrueba));
        System.out.println("¿Teléfono válido? (" + telPrueba + "): " + vTelefono.validar(telPrueba));

        // --- BONUS: El poder de las interfaces ---
        // Podemos meter todos en una lista porque todos "son" un Validador
        System.out.println("\n--- PROBANDO LISTA DE VALIDADORES ---");
        
        List<Validador> listaDeValidadores = new ArrayList<>();
        listaDeValidadores.add(vEmail);
        listaDeValidadores.add(vPassword);
        listaDeValidadores.add(vTelefono);

        for (Validador v : listaDeValidadores) {
            // Ejecutamos validar sin saber de qué tipo es cada uno
            boolean resultado = v.validar("texto_de_prueba@");
            System.out.println("Resultado de " + v.getClass().getSimpleName() + ": " + resultado);
        }
    }
}