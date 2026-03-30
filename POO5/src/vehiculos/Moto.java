package vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // 1. Constructor con parámetros (El más importante)
    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo); // Le envía la marca y el modelo al constructor de Vehiculo
        this.tieneSidecar = tieneSidecar;
    }

    // 2. Constructor por defecto
    public Moto() {
        super(); // Llama al constructor vacío de Vehiculo
    }

    // 3. Getter y Setter (Encapsulamiento)
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // 4. toString optimizado
    @Override
    public String toString() {
        // Usamos super.toString() para traer Marca y Modelo y le sumamos el Sidecar
        return super.toString() + ", ¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No");
    }
}