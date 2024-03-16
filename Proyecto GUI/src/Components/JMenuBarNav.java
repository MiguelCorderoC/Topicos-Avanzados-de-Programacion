package Components;

import javax.swing.*;

public class JMenuBarNav extends JMenuBar {
	public JMenuBarNav() {
		// Crear el men� "File"
		JMenu fileMenu = new JMenu("File");

		// Crear los elementos de men�
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");

		// Agregar los elementos de men� al men� "File"
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator(); // A�ade un separador entre elementos
		fileMenu.add(exitItem);

		// Agregar el men� "File" a la barra de men�
		this.add(fileMenu);
	}
}