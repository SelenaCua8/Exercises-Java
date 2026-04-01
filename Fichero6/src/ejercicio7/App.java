package ejercicio7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Vamos a gestionar una serie de personas.
 * Cada registro tiene el siguiente formato:
 * Nombre: String de 10 caracteres
 * Edad: int
 * Altura: float
 * Peso: float
 * Pide una persona al iniciar el programa y guardalo al final del fichero.
 * Antes de acabar debes mostrar:
 * El numero de personas que hay en el fichero
 * Media de edad
 * Nombre de la persona mas alta
 * Suma de todos los pesos*/

public class App {

	public static void main(String[] args) throws IOException {
	    Scanner sn = new Scanner(System.in);
	    sn.useLocale(Locale.US); // Para que el punto decimal sea . y no ,

	    // Misión 1: Pedir datos (Usando nextLine para evitar el error que tuviste)
	    System.out.println("Introduce el nombre: ");
	    String nombreUser = sn.nextLine();
	    System.out.println("Introduce la edad: ");
	    int edadUser = Integer.parseInt(sn.nextLine()); // Más seguro que nextInt()
	    System.out.println("Introduce la altura: ");
	    float alturaUser = Float.parseFloat(sn.nextLine());
	    System.out.println("Introduce el peso: ");
	    float pesoUser = Float.parseFloat(sn.nextLine());

	    // Misión 2: Escribir al final del archivo
	    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat", true))) {
	        dos.writeUTF(nombreUser);
	        dos.writeInt(edadUser);
	        dos.writeFloat(alturaUser);
	        dos.writeFloat(pesoUser);
	        dos.flush();
	    }

	    // Misión 3: Leer todo el archivo y calcular estadísticas
	    int numPersonas = 0;
	    int sumaEdades = 0;
	    String nombreMasAlta = "";
	    float mayorAltura = 0;
	    float sumaPesos = 0;

	    try (DataInputStream dis = new DataInputStream(new FileInputStream("example.dat"))) {
	        // available() nos dice cuántos bytes quedan por leer
	        while (dis.available() > 0) {
	            String n = dis.readUTF();
	            int e = dis.readInt();
	            float a = dis.readFloat();
	            float p = dis.readFloat();

	            // Cálculos
	            numPersonas++;
	            sumaEdades += e;
	            sumaPesos += p;
	            if (a > mayorAltura) {
	                mayorAltura = a;
	                nombreMasAlta = n;
	            }
	        }
	    } catch (FileNotFoundException e) {
	        System.out.println("Archivo no encontrado, se creará uno nuevo.");
	    }

	    // Mostrar resultados
	    if (numPersonas > 0) {
	        System.out.println("\n--- ESTADÍSTICAS ---");
	        System.out.println("Número de personas: " + numPersonas);
	        System.out.println("Media de edad: " + (float) sumaEdades / numPersonas);
	        System.out.println("Persona más alta: " + nombreMasAlta + " (" + mayorAltura + "m)");
	        System.out.println("Suma total de pesos: " + sumaPesos + "kg");
	    }
	}
}
