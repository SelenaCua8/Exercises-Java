package ejercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * Gestionar una lista de productos en un sistema de compras.
 * Se podra hacer lo siguiente:
 * Añadir producto: El sistema debe permitir al usuario elegir 
 * entre tres productos predefinidos:
 * Camiseta (20.5€)
 * Pantalón (30€)
 * Zapatos (50€)
 * Mostrar productos: El sistema debe mostrar todos los productos añadidos 
 * hasta el momento, mostrando su nombre y precio. Muestra el total
 * Eliminar producto: El sistema debe permitir al usuario elegir un producto de 
 * la lista para eliminarlo, solicitando al usuario que ingrese el número del producto 
 * que desea eliminar.
 * Eliminar todos los productos: El sistema debe permitir limpiar la lista de productos, 
 * eliminando todos los productos almacenados.
 * Salir: El sistema debe permitir al usuario salir del programa.
 * */
public class App {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            try {
                System.out.println("\n1.Añadir producto");
                System.out.println("2.Mostrar productos");
                System.out.println("3.Eliminar producto");
                System.out.println("4.Eliminar todos los productos");
                System.out.println("5.Salir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("1. Camiseta (20.5€)");
                        System.out.println("2. Pantalon (30€)");
                        System.out.println("3. Zapatos (50€)");
                        int subOpcion = sn.nextInt();
                        
                        Producto producto = null;
                        
                        // Switch anidado para elegir el producto
                        switch (subOpcion) {
                            case 1 -> productos.add(new Producto("Camiseta", 20.5));
                            case 2 -> productos.add(new Producto("Pantalon", 30));
                            case 3 -> productos.add(new Producto("Zapatos", 50));
                            default -> System.out.println("Opción de producto no válida");
                        }
                    }
                    if(producto != null) {
                    	prodcutos.add(producto);
                    	System.out.println("Se ha añadido un producto" + producto.getNomebre());
                    }else {
                    	System.out.println("No se ha seleccionado un producto");
                    }
                    
                    case 2 -> {
                        System.out.println("--- Lista de Productos ---");
                        if(productos.isEmpty()) {
                        	System.out.println("No hay productos");
                        }else {
                        	double total = 0;
                        	for(Producto producto : productos) {
                        		System.out.println(producto);
                        		
                        	}
                        }
                    }
                    case 3 -> {
                        System.out.println("¿Qué número de producto deseas eliminar?");
                        // Aquí va tu lógica para eliminar por índice
                    }
                    case 4 -> {
                        productos.clear();
                        System.out.println("Lista vaciada.");
                    }
                    case 5 -> salir = true;
                    default -> System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                sn.next(); // Limpiamos el buffer
                System.out.println("Solo se pueden introducir números");
            }
        }
    }
}