package Producto;

class App {

	public static void main(String[] args) {
		
		
		        System.out.println("--- 🛒 INICIO DE PRUEBAS DE PRODUCTOS ---");

		        // 1. Prueba de Producto Normal
		        Producto p1 = new Producto("Cafe en Grano", 1000);
		        System.out.println(p1.toString());
		        System.out.println("Compra 2 unidades de Cafe: $" + p1.comprar(2));

		        System.out.println("\n--- ❄️ PRUEBAS DE PRODUCTOS FRESCOS (Descuentos) ---");

		        // 2. Producto Fresco con muchos días (Precio Normal)
		        ProductoFresco lecheOk = new ProductoFresco("Leche Larga Vida", 500, 20);
		        System.out.println(lecheOk.getNombre() + " (20 días): $" + lecheOk.comprar(1));

		        // 3. Producto Fresco entre 3 y 5 días (Descuento 40%)
		        ProductoFresco yogurtPromo = new ProductoFresco("Yogurt", 500, 4);
		        System.out.println(yogurtPromo.getNombre() + " (4 días - 40% OFF): $" + yogurtPromo.comprar(1));

		        // 4. Producto Fresco < 3 días (Descuento 70%)
		        ProductoFresco carneLiquidacion = new ProductoFresco("Carne", 500, 2);
		        System.out.println(carneLiquidacion.getNombre() + " (2 días - 70% OFF): $" + carneLiquidacion.comprar(1));

		        System.out.println("\n--- 🧊 PRUEBAS DE PRODUCTOS REFRIGERADOS ---");

		        // 5. Producto Refrigerado
		        ProductoRefrigerado p3 = new ProductoRefrigerado("Cerveza", 1200, 5);
		        System.out.println(p3.toString());

		        System.out.println("\n--- ⚠️ PRUEBA DE ERRORES (Excepciones) ---");
		        try {
		            System.out.println("Intentando comprar cantidad negativa...");
		            p1.comprar(-5);
		        } catch (IllegalArgumentException e) {
		            System.out.println("ERROR CAPTURADO: " + e.getMessage());
		        }
		    }
}

