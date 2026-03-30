package vehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() { super(); }

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo); // Le envía marca y modelo a Vehiculo
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas;
    }

	
	

}
