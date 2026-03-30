package eCuatro;

import java.util.Scanner;

class ECuatro {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        System.out.println("Introduce una frase con mayúsculas y minúsculas: ");
        String frase = sn.next();
        
        char caracter;
        int minusculas = 0;
        int mayusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            // Usamos métodos estáticos de la clase Character
            if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
            // Ignoramos espacios o números automáticamente con este IF
        }
        
        int totalLetras = minusculas + mayusculas;

        System.out.println("--- Resultados ---");
        System.out.println("Total de letras: " + totalLetras);
        System.out.println("Cantidad de minúsculas: " + minusculas);
        System.out.println("Cantidad de mayúsculas: " + mayusculas);
        
        sn.close(); // Buena práctica: siempre cerrar el Scanner
    }
}