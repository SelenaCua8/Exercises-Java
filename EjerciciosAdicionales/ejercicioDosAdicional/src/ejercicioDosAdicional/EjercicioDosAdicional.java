package ejercicioDosAdicional;
import javax.swing.JOptionPane;

/*Una despensa desea calcular los sueldos de sus empleados
 * los puestos tienen 3 categorias
 * 1- repositor
 * 2- cajero
 * 3 supervisor
 * Repositor: cobra 15890 + 10% de bono
 * cajero: 25630.89 fijos
 * supervisor: 35560.20, se le descuenta un 11% de jubilacion
 * 
 * Se necesita un progama que dependiendo el tipo de empleado se calcule
 * y muestre en pantalla el correspondiente sueldo*/

class EjercicioDosAdicional {

	public static void main(String[] args) {
		double repositor = 15890;
		double cajero = 25630.89;
		double supervisor = 35560.29;
		String dato;
		double sueldo;
		
		dato = JOptionPane.showInputDialog(null, "Ingrese tipo de empleado" + 
				"\n A = 'Repositor'"  +
				"\n B = 'Cajero'"  +
				"\n C = 'Supervisor'" );
		if (dato.equalsIgnoreCase("A")) {
			sueldo = repositor + (repositor * 0.10);
			JOptionPane.showMessageDialog(null, "El sueldo del Repositor es de: $" + sueldo);

		} else if (dato.equalsIgnoreCase("B")) {
			sueldo = cajero;
			JOptionPane.showMessageDialog(null, "El sueldo del Cajero es de: $" + sueldo);

		} else if (dato.equalsIgnoreCase("C")) {
			sueldo = supervisor - (supervisor * 0.11);
			JOptionPane.showMessageDialog(null, "El sueldo del Supervisor es de: $" + sueldo);

		} else {
			JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese A, B o C.");
		}
		
	

	}
}
