package Components;

import javax.swing.*;

public class JMenuBarNav extends JMenuBar {
	public JMenuBarNav() {
		// Crear el menú "File"
		JMenu fileMenu = new JMenu("File");

		// Crear los elementos de menú
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");

		// Agregar los elementos de menú al menú "File"
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator(); // Añade un separador entre elementos
		fileMenu.add(exitItem);

		// Agregar el menú "File" a la barra de menú
		this.add(fileMenu);
	}
}