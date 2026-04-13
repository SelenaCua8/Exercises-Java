
	
	
	package interface1;
	
	/*
	 * 
	 * La clase Transaccion debe ser un "contenedor" de datos 
	 * (como una factura o un ticket). No debería validar nada ella misma,
	 *  solo tener la información.
	 * 
	 * */


	public class Transaccion {
	    public double trans1; // El monto de la operación
	    public double limiteDisponible; // El máximo permitido
	    public boolean cuentaOrigenActiva; // <--- AGREGÁ ESTO

	    public Transaccion(double monto, double limite, boolean cuentaOrigenActiva) {
	        this.trans1 = monto;
	        this.limiteDisponible = limite;
	        this.cuentaOrigenActiva = cuentaOrigenActiva;
	        
	    }
	}
			
			
			
		
	
		
		
		
	


