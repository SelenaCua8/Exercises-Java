package vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() { } // Constructor por defecto

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters... (los que ya tenías pero con minúscula)

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
	
	
	
	


