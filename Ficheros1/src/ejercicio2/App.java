package ejercicio2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class App {

	public static void main(String[] args) {
		/*
		 * 
		 * Pide un número positivo por teclado.
		 * Escribe en el fichero numeros.txt los numeros del 1 al número introducido.
		 * Despues, lee el fichero y muestra su contenido.
		*/
		
		Scanner sn = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Introduce un numero positivo: ");
			numero = sn.nextInt();
			if(numero<0) {
				System.out.println("El número debe ser positivo");
			}
			
			
		} while (numero<0);
		
		File fichero = new File("numeros.txt");
		
		try(FileWriter fw = new FileWriter(fichero);
				FileReader fr = new FileReader(fichero);
				) {
			for (int i = 1; i <= numero; i++) {
				fw.write(i+"\r\n");
				
			}
			
			fw.flush(); 
			
			int valor;
			while((valor = fr.read()) != -1)	{
				System.out.println((char) valor);
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	
	/*
	 * Para entender el flush(), imaginate que el FileWriter es como un camión de
	 *  basura o un repartidor.

🚛 La Analogía del Repartidor
Si vos tenés que mandar 100 cartas, el repartidor no va a ir al correo 100 veces 
(una por cada carta) porque gastaría mucha nafta y tiempo. Lo que hace es llenar
 su bolso (el buffer) y, recién cuando el bolso está lleno o cuando termina su turno,
  va y las entrega todas juntas.

El Buffer: Es una memoria temporal donde Java guarda lo que escribís con write() para
 no estar accediendo al disco rígido a cada segundo (que es lento).

El flush(): Es como decirle al repartidor: "Che, no esperes a que se llene el bolso, 
entregá lo que tenés YA" o "Vaciá el bolso en el buzón ahora mismo".

🔍 ¿Por qué es obligatorio en tu código?
Fijate que en tu bloque try-with-resources tenés abiertos el FileWriter (para escribir)
 y el FileReader (para leer) al mismo tiempo.

Vos hacés el for y escribís los números.

Java los guarda en el "bolso" (el buffer), pero todavía no los escribió físicamente en 
el archivo numeros.txt.

Si intentás leer con el FileReader sin haber hecho flush(), el archivo va a estar vacío, porque los datos siguen "en el bolso" de Java y no en el disco.

Al poner fw.flush(), obligás a Java a volcar los datos al archivo para que, un 
milisegundo después, el FileReader pueda encontrarlos ahí.

🕵️‍♀️ Tips de "guía" para este código:
El close() automático: Como usaste el try(...), cuando el programa sale de las llaves,
 Java hace un close() automático. El close() hace un flush() interno antes de cerrar, 
 pero como vos necesitás leer adentro del mismo bloque, el flush() manual es 
 indispensable.

El (char) valor: Este método de lectura (fr.read()) lee de a un solo caracter. Si el 
número es "10", te va a imprimir primero el '1' y después el '0' en líneas separadas.

Dato técnico: En sistemas reales, el flush() se usa mucho en redes (sockets). 
Si mandás un mensaje de chat, no querés que Java espere a llenar 8KB de texto para
 mandarlo; querés que salga apenas apretás Enter.

¿Te imaginabas que Java "se guardaba" las cosas antes de escribirlas o pensabas que
 iba directo al archivo? Es un truco que usa la compu para ser más rápida, pero a
  veces nos hace estas jugadas. 🚀🐧💻
	 * 

	 * 
	 * */
	
	
	

}
