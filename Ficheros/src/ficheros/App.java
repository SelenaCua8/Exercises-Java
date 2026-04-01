package ficheros;

import java.io.File;
import java.io.IOException;

class App {

	public static void main(String[] args) throws IOException {
		
		File directorio = new File("ficheros");
		File fichero = new File(directorio, "example.txt");
		
		directorio.mkdir();
		fichero.createNewFile();
		
		//saber si existe
		System.out.println("¿Existe el directorio: ? " + directorio.getName() + directorio.exists());
		
		System.out.println("¿Existe el fichero: ? " + fichero.getName() + fichero.exists());
		//cuanto pesa
		System.out.println("Bytes del fichero: " + fichero.length());
		
		System.out.println("Ficheros dentro de " + directorio.getName());
		for (String nombreFichero: directorio.list()) {
			File ficheroPrueba = new File(directorio, nombreFichero);
			if (ficheroPrueba.isFile()) {
				System.out.println(nombreFichero);
				
			}
		
		}
		
		fichero.delete();
		directorio.delete();
		
		//saber si existe
		System.out.println("¿Existe el directorio: ? " + directorio.getName() + directorio.exists());
		
		System.out.println("¿Existe el fichero: ? " + fichero.getName() + fichero.exists());
		
		

	}

}
