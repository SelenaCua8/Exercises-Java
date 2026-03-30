package prestable;

class App {

	public static void main(String[] args) {
		Videojuego v = new Videojuego("Super Mario", 60, false, 0);
		
		v.prestar();
		v.devolver();
		v.prestar();
		v.devolver();
		v.prestar();
		v.prestar();
		v.devolver();		v.devolver();
	}

}
