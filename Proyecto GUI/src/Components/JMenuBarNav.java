package Components;

import javax.swing.*;

public class JMenuBarNav extends JMenuBar {
	public JMenuBarNav() {
		// Crear el menu "File"
		JMenu fileMenu = new JMenu("File");
		JMenu menuBanco = new JMenu("Banco");
		JMenu menuServicio = new JMenu("Servicio");

		// Crear los elementos de menu
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");

		JMenuItem itemAlta = new JMenuItem("Alta");
		JMenuItem itemBaja = new JMenuItem("Baja");
		JMenuItem itemActualizar = new JMenuItem("Actualizar");
		JMenuItem itemConsultar = new JMenuItem("Consultar");

		JMenuItem itemServicioAlta = new JMenuItem("Alta");
		JMenuItem itemServicioBaja = new JMenuItem("Baja");
		JMenuItem itemServicioActualizar = new JMenuItem("Actualizar");
		JMenuItem itemServicioConsultar = new JMenuItem("Consultar");

		// Agregar los elementos de men� al men� "File"
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator(); // A�ade un separador entre elementos
		fileMenu.add(exitItem);

		// Agregar los elementos de men� al men� "File"
		menuBanco.add(itemAlta);
		menuBanco.add(itemActualizar);
		menuBanco.add(itemBaja);

		menuBanco.addSeparator(); // A�ade un separador entre elementos
		menuBanco.add(itemConsultar);

		// Agregar los elementos de men� al men� "File"
		menuServicio.add(itemServicioAlta);
		menuServicio.add(itemServicioActualizar);
		menuServicio.add(itemServicioBaja);

		menuServicio.addSeparator(); // A�ade un separador entre elementos
		menuServicio.add(itemServicioConsultar);

		// Agregar el men� "File" a la barra de men�
		this.add(fileMenu);
		this.add(menuBanco);
		this.add(menuServicio);
	}
}