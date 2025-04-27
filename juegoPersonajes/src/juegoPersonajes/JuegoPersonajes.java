package juegoPersonajes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class JuegoPersonajes {

    public static void main(String[] args) {
        int susanaGimenez = 1;  // Está vivo, es mujer, no es político 1 +1 +1 +1 = 4
        int lilitaCarrio = 2;   // Está vivo, es mujer, es política 2 + 1 +1 +1 =5
        int lionelMessi = 4;    // Está vivo, es hombre, no es político 4 + 1 + 1 + 1 =7
        int sergioMassa = 0;    // Está vivo, es hombre, es político 0 + 1 +1 +1 = 3
        int domingoSarmiento = 6; // No está vivo, es hombre, es político  6 + 1 + 1 + 1 =9
        
        String preguntaUno;
        String preguntaDos;
        String preguntaTres;
        String preguntaCuatro;

        // Introducción del juego
        JOptionPane.showMessageDialog(null, "Juego de personajes" + "\nEl juego consiste en vos tenes que elegir entre estos personajes:"
                + "\n A) Lionel Messi \nB)Lilita Carrio \nC) Sergio Massa \nD)Susana Gimenez \nE)Domingo Sarmiento" + "\nUna vez que vos ya pensaste uno de los personajes yo te hago 3 preguntas y tengo que tratar de adivinarlo." + "\nBueno, empecemos...", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                new ImageIcon(JuegoPersonajes.class.getResource("/img/logo.png")));

        preguntaUno = JOptionPane.showInputDialog(null, "¿El personaje que elegiste está vivo? \nResponder Si o No");
        preguntaDos = JOptionPane.showInputDialog(null, "¿El personaje que elegiste es hombre? \nResponder Si o No");

       
        if (preguntaUno.equalsIgnoreCase("si")) {
            susanaGimenez++; // 1 + 1 = 2
            lilitaCarrio++;  // 2 + 1 = 3
            lionelMessi++;   // 4 + 1 = 5
            sergioMassa++;   // 0 + 1 = 1
            domingoSarmiento = 0; // 
        } else {
            susanaGimenez = 0; // No está vivo, Susana queda con 0
            lilitaCarrio = 0;  // No está vivo, Lilita queda con 0
            lionelMessi = 0;   // No está vivo, Messi queda con 0
            sergioMassa = 0;   // No está vivo, Massa queda con 0
            domingoSarmiento++; 
        }

      
        if (preguntaDos.equalsIgnoreCase("si")) {
            domingoSarmiento++; // 6 + 1 = 7
            lionelMessi++;      // 5 + 1 = 6
            sergioMassa++;      // 1 + 1 = 2
        } else {
            lilitaCarrio++;    // 3 + 1 = 4
            susanaGimenez++;   // 2 + 1 = 3
        }

     
        preguntaCuatro = JOptionPane.showInputDialog(null, "¿El personaje que elegiste es político? \nResponder Si o No");

        if (preguntaCuatro.equalsIgnoreCase("si")) {
            sergioMassa++;     // 2 + 1 = 3
            domingoSarmiento++; // 7 + 1 = 8
            lilitaCarrio++;    // 4 + 1 = 5
        } else {
            susanaGimenez++;   // 3 + 1 = 4
            lionelMessi++;     // 6 + 1 = 7
        }

       
        if (sergioMassa == 3) {
            JOptionPane.showMessageDialog(null, "Su personaje es: Sergio Massa", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                    new ImageIcon(JuegoPersonajes.class.getResource("/img/sergiomassa.png")));
        } else if (lionelMessi == 7) {
            JOptionPane.showMessageDialog(null, "Su personaje es: Lionel Messi", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                    new ImageIcon(JuegoPersonajes.class.getResource("/img/messi.jpg")));
        } else if (domingoSarmiento == 9) {
            JOptionPane.showMessageDialog(null, "Su personaje es: Domingo Sarmiento", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                    new ImageIcon(JuegoPersonajes.class.getResource("/img/domingosarmiento.png")));
        } else if (lilitaCarrio == 5) {
        	JOptionPane.showMessageDialog(null, "\nSu personaje es: Lilita Carrio ", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
        			new ImageIcon(JuegoPersonajes.class.getResource("/img/lilita-carrio.jpg")));
        	
        } else if (susanaGimenez == 4) {
            JOptionPane.showMessageDialog(null, "Su personaje es: Susana Gimenez", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                    new ImageIcon(JuegoPersonajes.class.getResource("/img/susanagimenez.png")));
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, no pudimos adivinarlo. ¡Intente de nuevo!", "Bienvenido al mundo del genio", JOptionPane.DEFAULT_OPTION, 
                    new ImageIcon(JuegoPersonajes.class.getResource("/img/genio.png")));
        }

        JOptionPane.showConfirmDialog(null, "Gracias por participar, nos vemos pronto");
    }
}

