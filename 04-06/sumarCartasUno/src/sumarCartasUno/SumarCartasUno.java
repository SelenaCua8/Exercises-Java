package sumarCartasUno;

import javax.swing.JOptionPane;

public class SumarCartasUno {
    public static void main(String[] args) {
        int tot = 0, c;

        do {
            c = (int)(Math.random() * 12 + 1);
            System.out.println("Carta: " + c);
            tot += c;
        } while (c != 1);

        JOptionPane.showMessageDialog(null, "Suma: " + tot);
    }
}
