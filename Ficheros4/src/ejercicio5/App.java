package ejercicio5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class App {

	public static void main(String[] args) {
		/*
		 * 
		 * Usa un Scanner para pedir lineas de texto al usuario y guardalas
		 *  con un PrintWriter.
		 *  Si ya tiene contenido, se lo añadiremos al final.
		 *  Lee el fichero resultante con otro Scanner.
		 * 
		 * 
		 * */
		
		Scanner sn = new Scanner(System.in);
		sn.useDelimiter("\n");
		
		Path path = Paths.get("lineas-usuario.txt");
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(path.toString(), true)); 
		Scanner snFichero = new Scanner(path)){
			boolean continuar;
			String linea;
			
			do {
				System.out.println("Introduce una linea: ");
				linea = sn.next();
				pw.println(linea);
				
				System.out.println("Quieres continuar? Y/N");
				continuar = sn.next().toUpperCase().charAt(0) == 'Y';
				
			} while (continuar);
			pw.flush();
			while (snFichero.hasNext()) {
				System.out.println(snFichero.nextLine());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
