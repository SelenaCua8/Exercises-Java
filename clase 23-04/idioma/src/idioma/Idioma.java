package idioma;

import javax.swing.JOptionPane;

class Idioma {

	public static void main(String[] args) {
		int id;

		id = (int) (Math.random() * 3);
		if (id == 0) {
			JOptionPane.showMessageDialog(null, "Hola");

		} else {
			if (id == 1) {
				JOptionPane.showMessageDialog(null, "Hello");

			} else {
				JOptionPane.showMessageDialog(null, "Bounjour");

			}

		}

	}
}
