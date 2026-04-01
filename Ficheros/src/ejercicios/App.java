package ejercicios;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
class App {

	public static void main(String[] args) {
		/*
		Crea un directorio llamado pruebas.
		Crea 10 ficheros dentro del directorio pruebas con el siguiente formato:

		file-.txt donde se sustituira por el numero del fichero

		Lista los fichero dentro de la carpeta pruebas.

		Si el directorio pruebas existe, lo borraremos antes de empezar a crear.

		Puedes hacerlo con File o Path.*/
		try {
		Path directorio = Paths.get("pruebas");	
		
		if(Files.exists(directorio)) {
			Files.walkFileTree(directorio,new SimpleFileVisitor<Path>() { //para borrar carpeta con archivos adentro
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
					Files.delete(file);
					return FileVisitResult.CONTINUE;
				}
				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException{
					Files.delete(dir);
					return FileVisitResult.CONTINUE;
				}
				
			});
			System.out.println("Directorio borrado");
			
		}
		
			Files.createDirectory(directorio);
			System.out.println("Directorio creado");
			
			for (int i = 1; i < 10; i++) {
				Path fichero = Paths.get(directorio.toString(), "file-" + i + ".txt");
				Files.createFile(fichero);
				
			}
			System.out.println("Ficheros creados");
			System.out.println("Listar ficheros");
			
			for(Path path: Files.newDirectoryStream(directorio)) {
				System.out.println(path.getFileName().toString());
			}
			
		} catch (IOException e) {
		    // Usá "e" que es como la llamaste arriba
		    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e); 
		}
		
		
		
		//Path rutaProfunda = Paths.get("respaldos/2026/marzo/ejercicios");
		//Files.createDirectories(rutaProfunda); 
		// Crea 'respaldos', adentro '2026', adentro 'marzo' y adentro 'ejercicios'.
		
		
		
	}

}
