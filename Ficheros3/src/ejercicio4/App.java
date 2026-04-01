package ejercicio4;

import java.io.*;
import java.nio.file.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
class App {

    public static void main(String[] args) {
        Path path = Paths.get("password.txt");

        try {
            // 1. Lógica de control: ¿Creamos o validamos?
            if (!Files.exists(path)) {
                System.out.println("El archivo no existe. Generando...");
                generaFicheroPassword(path);
            } else if (!validaFicheroLineas(path, 20)) {
                System.out.println("El archivo existe pero no tiene 20 líneas. Regenerando...");
                generaFicheroPassword(path);
            }

            // 2. Obtener una línea aleatoria (entre 1 y 20)
            Random random = new Random();
            int filaAleatoria = random.nextInt(1, 21); // El 21 es exclusivo

            String password = obtenerLinea(path, filaAleatoria);
            System.out.println("En la fila " + filaAleatoria + " el password es: " + password);

        } catch (IOException e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "Error en el sistema de archivos", e);
        }
    }

    // MÉTODO: Generar el archivo con 20 passwords
    public static void generaFicheroPassword(Path path) throws IOException {
        // BufferedWriter es más rápido para escribir muchas líneas
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (int i = 0; i < 20; i++) {
                bw.write(generaPassword(8));
                bw.newLine(); // Salto de línea automático
            }
        }
    }

    // MÉTODO: Validar si el archivo tiene al menos N líneas
    public static boolean validaFicheroLineas(Path path, int numLineas) throws IOException {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            while (br.readLine() != null) {
                contador++;
                if (contador >= numLineas) return true; // Si ya llegamos, no seguimos leyendo
            }
        }
        return false;
    }

    // MÉTODO: Generar un password aleatorio de longitud N
    public static String generaPassword(int longitud) {
        StringBuilder sb = new StringBuilder(); // Más eficiente que String +=
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(1, 4); // 1, 2 o 3
            switch (tipo) {
                case 1 -> sb.append((char) random.nextInt('a', 'z' + 1));
                case 2 -> sb.append((char) random.nextInt('A', 'Z' + 1));
                case 3 -> sb.append(random.nextInt(0, 10));
            }
        }
        return sb.toString();
    }

    // MÉTODO: Leer una línea específica
    public static String obtenerLinea(Path path, int numLinea) throws IOException {
        String lineaResult = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            for (int i = 0; i < numLinea; i++) {
                lineaResult = br.readLine();
                if (lineaResult == null) break; 
            }
        }
        return lineaResult; // El return siempre fuera del try
    }
}