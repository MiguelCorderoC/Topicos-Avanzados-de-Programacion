package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    JPanel pnlNorte = new JPanel();
    JPanel pnlSur = new JPanel();
    JPanel pnlEste = new JPanel();
    JPanel pnlOeste = new JPanel();
    JPanel pnlCentro = new JPanel();

    JMenu menuPrincipal = new JMenu();
    JToolBar tlbNuevo = new JToolBar("Nuevo");
    JLabel lblTitulo = new JLabel("Bienvenido a paint");

    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Paint");
        setSize(600, 600);
        setVisible(true);

        add(BorderLayout.CENTER, pnlCentro);
        add(BorderLayout.EAST, pnlEste);
        add(BorderLayout.WEST, pnlOeste);
        add(BorderLayout.SOUTH, pnlSur);
        add(BorderLayout.NORTH, pnlNorte);

        initComponents();
    }

    private void initComponents() {
        menuPrincipal.add(tlbNuevo);
        pnlNorte.add(menuPrincipal);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
