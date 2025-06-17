package ejMientras;

import javax.swing.JOptionPane;

class EjMientras {

    public static void main(String[] args) {
        double capital = 0;
        double montoFinal = 0;
        int tiempo, meses;
        double tasa;

        int retira = Integer.parseInt(JOptionPane.showInputDialog(
            "¿Quiere retirar la plata del banco? \n1- Sí \n2- No"));

        while (retira != 2) {

            capital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital a invertir: "));

            tiempo = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuánto tiempo desea dejarlo? \n1- 3 meses (3% mensual) \n2- 6 meses (10% mensual) \n3- 1 año (25% mensual)"
            ));

            if (tiempo == 1) {
                tasa = 0.03;
                meses = 3;
            } else if (tiempo == 2) {
                tasa = 0.10;
                meses = 6;
            } else if (tiempo == 3) {
                tasa = 0.25;
                meses = 12;
            } else {
                JOptionPane.showMessageDialog(null, "Opción de tiempo no válida.");
                continue; // vuelve a pedir datos
            }

            // Cálculo con interés compuesto
            montoFinal = capital * Math.pow(1 + tasa, meses);

            JOptionPane.showMessageDialog(null,
                "Capital invertido: $" + capital +
                "\nInterés mensual: " + (tasa * 100) + "%" +
                "\nTiempo: " + meses + " meses" +
                "\nMonto final (con interés compuesto): $" + String.format("%.2f", montoFinal));

            retira = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Quiere hacer otra inversión? \n1- Sí \n2- No"));
        }

        JOptionPane.showMessageDialog(null, "¡Gracias por confiar en el banco!");
    }
}
