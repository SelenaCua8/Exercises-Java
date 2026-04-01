package ejercicio1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/*
 * 
 * Teniendo una cola de personas de un cine.
 * Hay un 50% de posibilidades de que al atender a una persona llegue otra a la cola
 * Hay otro 50% de posibilidades de que esa persona sea VIP y se ponga al principio de la cola:
 * atendiendo primero a los menores de edad.
 * Calcula la entrada de cada uno de ellos, siendo los precios los siguientes:
 * Adultos (+18): 7.5€
 * Niños (-18): 4.5€
 * La pelicula tendra una clasificacion por edades son las siguientes:
 * A: Todas las edades
 * 7: mayores de 7 años
 * 12: mayores de 12 años
 * 16: mayores de 16 años
 * 18: mayores de 18 años
 * Si una persona no cumple con los requisitos de edad no podrá ver la pelicula.

 * */
public class App {

    public static void main(String[] args) {
        ArrayDeque<Persona> colaCine = new ArrayDeque<>();
        
        colaCine.offer(new Persona("Selena", 26));
        colaCine.offer(new Persona("MArta", 21));
        colaCine.offer(new Persona("Fernando", 12));
        colaCine.offer(new Persona("Flor", 5));
        colaCine.offer(new Persona("Exe", 18));
        colaCine.offer(new Persona("Juan", 40));
        
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Carlos","Andres","Sofia","Maria","Pepe"));
        
        ClasificacionPelicula clasificacion = ClasificacionPelicula.MAYOR_18;
        
        double totalEntradas = 0;
        int totalEntradasVendidas = 0;
        final double PRECIO_ADULTO = 7.5;
        final double PRECIO_NINO = 4.5;
        
        Random random = new Random();
        
        while(!colaCine.isEmpty()) {
            Persona persona = colaCine.poll();
            System.out.println("Atendiendo a: " + persona.getNombre() + " de " + persona.getEdad() + " años");
        
            if(persona.getEdad() >= clasificacion.getEdadMinima()) {
                double precio;
                if(persona.mayorEdad()) {
                    precio = PRECIO_ADULTO;
                } else {
                    precio = PRECIO_NINO;
                }
                System.out.println("Se ha cobrado: " + precio + " $ por la entrada");
                
                totalEntradas += precio;
                totalEntradasVendidas++;
                
            } else {
                System.out.println("No puede entrar a ver la pelicula, la edad minima es de: " + clasificacion.getEdadMinima());
            }
            
            boolean vieneNuevaPersona = random.nextBoolean();
            
            if(vieneNuevaPersona) {
                System.out.println("Ha llegado una nueva persona a la cola");
                
                // CORRECCIÓN AQUÍ: Elegimos un índice al azar entre 0 y el tamaño de la lista
                int indiceAleatorio = random.nextInt(nombres.size());
                Persona nuevaPersona = new Persona(nombres.get(indiceAleatorio), random.nextInt(5,30));
                
                boolean esVip = random.nextBoolean();
                if(esVip) {
                    System.out.println("Es VIP y se pone al principio de la cola");
                    colaCine.offerFirst(nuevaPersona);
                } else {
                    System.out.println("No es VIP y se pone al final de la cola");
                    colaCine.offerLast(nuevaPersona);
                }
            }
        }
        
        System.out.println("El total de las entradas son: " + totalEntradas);
        System.out.println("El total de las entradas vendidas son: " + totalEntradasVendidas);
    }
}