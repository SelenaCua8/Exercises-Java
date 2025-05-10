package signosParteDos;

import javax.swing.JOptionPane;

class Signos {

    public static void main(String[] args) {
        int dia;
        String mes, mensaje, categoria;

        mes = JOptionPane.showInputDialog("Ingrese mes de nacimiento: ");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día de nacimiento: "));

        if (mes.equalsIgnoreCase("enero")) {
            if (dia >= 1 && dia <= 20) {
                mensaje = "Capricornio";
            } else if (dia >= 21 && dia <= 31) {
                mensaje = "Acuario";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("febrero")) {
            if (dia >= 1 && dia <= 18) {
                mensaje = "Tu signo es acuario";
            } else if (dia >= 19 && dia <= 28) {
                mensaje = "Piscis";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("marzo")) {
            if (dia >= 1 && dia <= 20) {
                mensaje = "Piscis";
            } else if (dia >= 21 && dia <= 31) {
                mensaje = "Aries";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("abril")) {
            if (dia >= 1 && dia <= 20) {
                mensaje = "Aries";
            } else if (dia >= 21 && dia <= 30) {
                mensaje = "Tauro";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("mayo")) {
            if (dia >= 1 && dia <= 21) {
                mensaje = "Tauro";
            } else if (dia >= 22 && dia <= 31) {
                mensaje = "Geminis";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("junio")) {
            if (dia >= 1 && dia <= 21) {
                mensaje = "Geminis";
            } else if (dia >= 22 && dia <= 30) {
                mensaje = "Cancer";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("julio")) {
            if (dia >= 1 && dia <= 22) {
                mensaje = "Cancer";
            } else if (dia >= 23 && dia <= 31) {
                mensaje = "Leo";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("agosto")) {
            if (dia >= 1 && dia <= 23) {
                mensaje = "Leo";
            } else if (dia >= 24 && dia <= 31) {
                mensaje = "Virgo";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("septiembre")) {
            if (dia >= 1 && dia <= 23) {
                mensaje = "Virgo";
            } else if (dia >= 24 && dia <= 30) {
                mensaje = "Libra";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("octubre")) {
            if (dia >= 1 && dia <= 23) {
                mensaje = "Libra";
            } else if (dia >= 24 && dia <= 31) {
                mensaje = "Escorpio";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("noviembre")) {
            if (dia >= 1 && dia <= 22) {
                mensaje = "Escorpio";
            } else if (dia >= 23 && dia <= 30) {
                mensaje = "Sagitario";
            } else {
                mensaje = "Error de tipeo";
            }

        } else if (mes.equalsIgnoreCase("diciembre")) {
            if (dia >= 1 && dia <= 21) {
                mensaje = "Sagitario";
            } else if (dia >= 22 && dia <= 31) {
                mensaje = "Capricornio";
            } else {
                mensaje = "Error de tipeo";
            }

        } else {
            mensaje = "Mes inválido";
        }
        if (mensaje.equals("Aries") || mensaje.equals("Leo") || mensaje.equals("Sagitario")) {
        	categoria = "Fuego";
			
		} else if(mensaje.equals("Tauro") ||mensaje.equals("Virgo") || mensaje.equals("Capricornio")){
			categoria="Tierra";
		} else if(mensaje.equals("Geminis") ||mensaje.equals("Libra") || mensaje.equals("Acuario")){
			categoria="Aire";
		} else if(mensaje.equals("Cancer") ||mensaje.equals("Escorpio") || mensaje.equals("Piscis")){
			categoria="Agua";
			
		}
		 else {
			    categoria = "Desconocida"; // En caso de error
			}
        JOptionPane.showMessageDialog(null, "Tu signo es: " + mensaje + "\nY sos de la categoria: " + categoria );
      
    }
    
}
