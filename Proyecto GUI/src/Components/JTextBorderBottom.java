package Components;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class JTextBorderBottom {

	// Método para crear un JTextArea con un borde inferior
	public static JTextArea createBorderedTextArea(JTextArea textArea) {
		// Crear un borde compuesto con un borde inferior y un borde vacío
		Border border = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK), // Borde
																														// inferior
				BorderFactory.createEmptyBorder(0, 0, 5, 0) // Borde vacío para espacio entre el texto y el borde
		);
		textArea.setBorder(border); // Aplicar el borde compuesto al JTextArea
		return textArea;
	}

	// Método para crear un JLabel con estilo
	public static JLabel createLabel(String text) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.BLACK);
		return label;
	}

}
