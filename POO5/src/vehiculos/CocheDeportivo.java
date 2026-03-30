package vehiculos;

public class CocheDeportivo extends Coche {
    private boolean esDescapotable;

    public CocheDeportivo() { super(); }

    public CocheDeportivo(String marca, String modelo, int numeroPuertas, boolean esDescapotable) {
        super(marca, modelo, numeroPuertas); // Le envía todo al constructor de Coche
        this.esDescapotable = esDescapotable;
    }

    @Override
    public String toString() {
        return super.toString() + ", ¿Es descapotable?: " + (esDescapotable ? "Sí" : "No");
    }

	

}
