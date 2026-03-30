package poo8;

import java.util.Arrays;

class App {

    public static void main(String[] args) {
        
        // Cargamos datos reales en el constructor (Nombre, Precio, Especial)
        Producto[] productos = {
                new Producto("Aceite", 1200),
                new Producto("Pera", 500),
                new ProductoFresco("Manzana", 400, 2),    // 2 días para vencer
                new ProductoRefrigerado("Leche", 800, 3), // Cajón 3
                new ProductoRefrigerado("Yogur", 600, 8), // Cajón 8
                new ProductoFresco("Banana", 300, 10)     // 10 días para vencer
        };
        
        // Si tenés implementado Comparable, esto los ordena
        // Arrays.sort(productos); 
        
        int numGenericos = 0;
        int numFrescos = 0;
        int numRefrigerados = 0;
        double totalImporte = 0;
        
        ProductoRefrigerado masAlejado = null;
        ProductoFresco masProximo = null;
        
        System.out.println("--- LISTA DE PRODUCTOS ---");
        
        for(Producto p : productos) {
            System.out.println(p.toString());
            
            totalImporte += p.comprar(5); // Calculamos precio por 5 unidades
            
            if(p instanceof ProductoRefrigerado) {
                numRefrigerados++;
                ProductoRefrigerado refri = (ProductoRefrigerado) p;
                
                // Buscamos el cajón más alto (el más alejado)
                if(masAlejado == null || refri.getCajon() > masAlejado.getCajon()) {
                    masAlejado = refri;
                }
                
            } else if(p instanceof ProductoFresco) {
                numFrescos++;
                ProductoFresco fresco = (ProductoFresco) p;
                
                // Buscamos el que tenga MENOS días (el más próximo a vencer)
                if(masProximo == null || fresco.getDiasCaducidad() < masProximo.getDiasCaducidad()) {
                    masProximo = fresco;
                }
                
            } else {
                numGenericos++;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total Compra: $" + totalImporte);
        System.out.println("Genéricos: " + numGenericos);
        System.out.println("Frescos: " + numFrescos);
        System.out.println("Refrigerados: " + numRefrigerados);
        
        System.out.println("\n--- DESTACADOS ---");
        if(masAlejado != null) 
            System.out.println("❄️ El más alejado: " + masAlejado.getNombre() + " (Cajón " + masAlejado.getCajon() + ")");
        
        if(masProximo != null) 
            System.out.println("🍎 El más próximo a vencer: " + masProximo.getNombre() + " (" + masProximo.getDiasCaducidad() + " días)");
    }
}