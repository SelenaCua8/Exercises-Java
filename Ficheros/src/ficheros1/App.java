package ficheros1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class App {

	public static void main(String[] args) {
		
		Path directorio = Paths.get("ficheros"); //directorio
		Path fichero = Paths.get(directorio.toString(), "example.txt"); 
		
		try {
			Files.createFile(directorio);
			Files.createFile(fichero);
			
			System.out.println("Existe el directorio: " + directorio.toString() + Files.exists(directorio));
			System.out.println("Existe el fichero: " + fichero.toString() + Files.exists(fichero));
			
			System.out.println("Tamaño: " + Files.size(fichero));
			
			for(Path path : Files.newDirectoryStream(directorio)) {
				if(Files.isRegularFile(path)) {
					System.out.println(path.toString());
				}
			}
			
			Files.delete(fichero);
			Files.delete(directorio);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
