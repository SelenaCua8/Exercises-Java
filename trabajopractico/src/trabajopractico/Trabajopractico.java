package trabajopractico;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Trabajopractico {

	public static void main(String[] args) {
		
		String nombre;
		
		JOptionPane.showMessageDialog(null, "Trivia de perros", "Escuchamos pero no juzgamos", JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
		nombre=(String) JOptionPane.showInputDialog(null, "ingrese su nombre: ", "Trivia de perros", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/perrosonriente.gif")), null, null);

		JOptionPane.showConfirmDialog(null, "Hola " + nombre + "\n Bienvenido a la Trivia de perros" + "\nEste juego consiste en 6 preguntas"
				+ "si respondes 4 o más podes adoptar un perro");
		
		String respuesta;
		int cont = 0;
		String preguntaUno;
		String preguntaDos;
		String preguntaTres;
		String preguntaCuatro;
		String preguntaCinco;
		String preguntaSeis;
		
		
		//PRIMERA PREGUNTA
		preguntaUno=JOptionPane.showInputDialog(null, "¿Hasta cuanto pueden vivir los perros aproximadamente?" + "\nA)30-50 años" + "\nB)1-3 años "
		+ "\nC)8-15 " + "\nD) Pasa palabra"); 
		
	if (preguntaUno.equalsIgnoreCase("a")) {
		
		JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
		cont = 0;
	}
		
	else if(preguntaUno.equalsIgnoreCase("b")) {
		JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
		cont = 0;
	}else if(preguntaUno.equalsIgnoreCase("c")) {
		JOptionPane.showMessageDialog(null, "¡Siii, bailemos!", "Tu respuesta fue acertada", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/dancing-dog.gif")));
		cont++;
	}else if (preguntaUno.equalsIgnoreCase("d")){
		JOptionPane.showMessageDialog(null, "Ni siquiera lo intentaste", "Mirada que juzga", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
		cont = 0;
	}else {
		JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
		cont = 0;
	}
	//SEGUNDA PREGUNTA
		preguntaDos=(String)JOptionPane.showInputDialog(null, "¿Por qué los perros sacan la lengua y jadean?" + "\nA)Estan enojados" + "\nB)Quieren ir al baño "
				+ "\nC)Quieren salir a correr " + "\nD)En la mayoria de los casos están cansados y tienen sed", null, JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Trabajopractico.class.getResource("/img/sacandolengua.jpg")), null, null);
		if (preguntaDos.equalsIgnoreCase("a")) {
			
			JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
			
		}
		else if(preguntaDos.equalsIgnoreCase("b")) {
			JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
		}else if(preguntaDos.equalsIgnoreCase("c")) {
			JOptionPane.showMessageDialog(null, "Ni siquiera lo intentaste", "Mirada que juzga", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
		}else if(preguntaDos.equalsIgnoreCase("d")) {
			JOptionPane.showMessageDialog(null, "¡Siii, bailemos!", "Tu respuesta fue acertada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/dancing-dog.gif")));
			cont++;
		}else {
			JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
			cont = 0;
		}
		
		//TERCERA PREGUNTA
		preguntaTres=(String)JOptionPane.showInputDialog(null, "Cuál es el principal sentido que usan los perros para reconocer a las personas?" + "\nA)La vista" + "\nB)El tacto "
		+ "\nC)El olfato " + "\nD)El oido");
		if (preguntaTres.equalsIgnoreCase("a")) {
	
	JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
	cont = 0;
	
}
else if(preguntaTres.equalsIgnoreCase("b")) {
	JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
	cont = 0;
}else if(preguntaTres.equalsIgnoreCase("c")) {
	JOptionPane.showMessageDialog(null, "Siiii", "Perrito olfateador", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Trabajopractico.class.getResource("/img/perro-oliendo.gif")));
	cont++;
}else if(preguntaTres.equalsIgnoreCase("d")) {
	JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
	cont = 0;
}
else {
	JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
	cont = 0;
}
		//CUARTA PREGUNTA
		preguntaCuatro=(String)JOptionPane.showInputDialog(null, " ¿Qué raza de perro es famosa por su lengua de color azul-negro??" + "\nA)Chow Chow" + "\nB)Dalmata "
				+ "\nC)Labrador " + "\nD)Ovejero Alemán");
				if (preguntaCuatro.equalsIgnoreCase("a")) {
			
					JOptionPane.showMessageDialog(null, "Correcto", "ChowChow", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajopractico.class.getResource("/img/chowchow.jpeg")));
			cont++;
			
		}
		else if(preguntaCuatro.equalsIgnoreCase("b")) {
			JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
		}else if(preguntaCuatro.equalsIgnoreCase("c")) {
			JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
		}else if(preguntaCuatro.equalsIgnoreCase("d")) {
			JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
			cont = 0;
		}else {
			JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
			cont = 0;
		}
				
		
		//QUINTA PREGUNTA
				preguntaCinco=(String)JOptionPane.showInputDialog(null, " ¿Cada cuantos meses una perra puede quedar preñada??" + "\nA)Cada 1 mes" + "\nB)Cada dos meses "
						+ "\nC)Cada 6 " + "\nD)Cada 9");
						if (preguntaCinco.equalsIgnoreCase("a")) {
					
							JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
							cont = 0;
				}
				else if(preguntaCuatro.equalsIgnoreCase("b")) {
					JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
					cont = 0;
				}else if(preguntaCinco.equalsIgnoreCase("c")) {

					JOptionPane.showMessageDialog(null, "¡Siii, bailemos!", "Tu respuesta fue acertada", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajopractico.class.getResource("/img/dancing-dog.gif")));
					cont++;
				}else if(preguntaCinco.equalsIgnoreCase("d")) {
					JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
					cont = 0;
				}else {
					JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
					cont = 0;
				}
		//SEXTA PREGUNTA
						preguntaSeis=(String)JOptionPane.showInputDialog(null, " ¿Cuál es una de las principales razones por las que los perros se convierten en callejeros?" + "\nA)Se escapan debido a la falta de ejercicio" +
								"\nB)Son abandonados por sus dueños"
								+ "\nC)Son maltratados y se rebelan" + "\nD)Se pierden durante los paseos");
								if (preguntaSeis.equalsIgnoreCase("a")) {
							
									JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
									cont = 0;
						}
						else if(preguntaSeis.equalsIgnoreCase("b")) {
							JOptionPane.showMessageDialog(null, "Recordá, adopta no compres", "Tu respuesta fue acertada", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajopractico.class.getResource("/img/adopta.gif")));
							cont++;
						}else if(preguntaSeis.equalsIgnoreCase("c")) {

							JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
							cont = 0;
						}else if(preguntaSeis.equalsIgnoreCase("d")) {
							JOptionPane.showMessageDialog(null, "No te juzgo... o si", "Tu respuesta fue errada", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajopractico.class.getResource("/img/juzga.jpg")));
							cont = 0;
						}else {
							JOptionPane.showConfirmDialog(null, "Error de tipeo, lo siento pregunta perdida");
							cont = 0;
						}
		
		
		
		//RESPUESTA FINAL
		if(cont >= 4) {
			JOptionPane.showMessageDialog(null, "Hiciste un total de: "+  cont  + " preguntas correctas" + "\nAhora si podes adoptar un perrito", "GRACIAS", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/gracias.gif")));
		}else {
			JOptionPane.showMessageDialog(null, "Hiciste un total de: "+  cont  + " preguntas correctas" + "\nNo alcanzaste los puntos necesarios para adoptar un perrito", "GRACIAS PERO NO", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Trabajopractico.class.getResource("/img/sad.gif")));
			
		}
JOptionPane.showConfirmDialog(null, "Gracias por participar en nuestra trivia espero que hayas aprendido algo de perritos");
	}
	
			
		
	}

	
	


