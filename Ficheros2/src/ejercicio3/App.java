package ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class App {

	public static void main(String[] args) {
		/*
		 * Genera un fichero index.html que contenga una etiqueta h1 con un hola mundo.
			Debe estar tabulado como un html.
		 */
		
		Path path = Paths.get("index.html");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString()));) {
			
			
			bw.write("<html>");
			bw.newLine();
			bw.write("\t<head>");
			bw.newLine();
			bw.write("\t\t<title>Ejercicio 3</title>");
			bw.newLine();
			
			
			
			bw.newLine();
			bw.write("\t</head>");
			
			bw.newLine();
			bw.write("\t<body>");
			bw.newLine();
			bw.write("\t\t<h1>Hola mundo</h1>");
			bw.newLine();
			
			
			
			bw.newLine();
			bw.write("\t</body>");

			bw.newLine();
			bw.write("</html>");
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}
