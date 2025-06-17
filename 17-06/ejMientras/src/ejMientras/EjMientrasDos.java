package ejMientras;

import javax.swing.JOptionPane;

class EjMientrasDos {

    public static void main(String[] args) {
        int cantVentasTarjeta = 0;
        int totalVentaTarjetas = 0;
        int totalEfectivo = 0;
        int montoTotalDia = 0;
        int ventaMaxima = 0;
        String vendedorMaxima = "";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese qué operación quiere hacer \n1- Pagar con tarjeta \n2- Pagar al contado \n3- Salir"));

        while (opcion != 3) {

            String vendedor = JOptionPane.showInputDialog("Ingrese nombre del vendedor:");
            int medioDePago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese medio de pago:\n1- Tarjeta\n2- Contado"));
            int montoPagar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a pagar:"));

            if (medioDePago == 1) {
                cantVentasTarjeta++;
                totalVentaTarjetas += montoPagar;
            } else if (medioDePago == 2) {
                totalEfectivo += montoPagar;
            } else {
                JOptionPane.showMessageDialog(null, "Medio de pago no válido.");
                continue; // vuelve al menú sin sumar nada
            }

            montoTotalDia += montoPagar;

            if (montoPagar > ventaMaxima) {
                ventaMaxima = montoPagar;
                vendedorMaxima = vendedor;
            }

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese qué operación quiere hacer \n1- Pagar con tarjeta \n2- Pagar al contado \n3- Salir"));
        }

        JOptionPane.showMessageDialog(null,
                "Cantidad de ventas con tarjeta: " + cantVentasTarjeta +
                "\nTotal en efectivo (arqueo): $" + totalEfectivo +
                "\nTotal ventas con tarjeta: $" + totalVentaTarjetas +
                "\nMonto total de ventas del día: $" + montoTotalDia +
                "\nVenta máxima: $" + ventaMaxima +
                "\nVendedor de la venta máxima: " + vendedorMaxima);
    }
}

