package aeropuerto;

class App {

	public static void main(String[] args) {
		
		AeropuertoPublico ap =  new AeropuertoPublico(100000,10,"adolfo suarez",1999, 20000);
		AeropuertoPrivado apr =  new AeropuertoPrivado("Palomar",1999,3560, 5);
		
		
		System.out.println(ap);
		System.out.println(apr);
		
		ap.gananciasTotales(2000);
		apr.gananciasTotales(20000);
	}

}
