package Front;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.Toolkit;

import javax.swing.*;

import Components.*;

public class frmServicioAlta extends JFrame {

	JMenuBarNav navegador = new JMenuBarNav();
	JPanel pnlPrincipal = new JPanel(new FlowLayout(FlowLayout.LEADING));
	JPanel pnlFormulario = new JPanel(new GridLayout(14, 1));
	JPanel pnlImagenes = new JPanel();
	JTextArea txtCuenta = new JTextArea();
	JTextArea txtTarjeta = new JTextArea();
	JTextArea txtNip = new JTextArea();
	JTextArea txtCve = new JTextArea();
	JTextArea txtVencimiento = new JTextArea();
	JButton btnAlta = new JButton("Alta");
	String[] opTipo = { "Credito", "Debito", "Recompensas", "Departamental" };
	JComboBox<String> cmbTipo = new JComboBox<>(opTipo);

	// instancio a nivel de clase los componentes que utilizare

	// Obtengo las dimensiones de la pantalla
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	// Configuracion del frame
	public frmServicioAlta() {
		setTitle("Alta Banco");
		setLayout(new BorderLayout());
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(navegador, BorderLayout.NORTH);
		add(pnlPrincipal, BorderLayout.CENTER);
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		pnlFormulario.add(JTextBorderBottom.createLabel("Cuenta:"));
		pnlFormulario.add(JTextBorderBottom.createBorderedTextArea(txtCuenta));
		pnlFormulario.add(JTextBorderBottom.createLabel("Tarjeta (0000-0000-0000-0000):"));
		pnlFormulario.add(JTextBorderBottom.createBorderedTextArea(txtTarjeta));
		pnlFormulario.add(JTextBorderBottom.createLabel("Tipo:"));
		pnlFormulario.add(cmbTipo);
		pnlFormulario.add(JTextBorderBottom.createLabel("NIP:"));
		pnlFormulario.add(JTextBorderBottom.createBorderedTextArea(txtNip));
		pnlFormulario.add(JTextBorderBottom.createLabel("CVE:"));
		pnlFormulario.add(JTextBorderBottom.createBorderedTextArea(txtCve));
		pnlFormulario.add(JTextBorderBottom.createLabel("Vencimiento:"));
		pnlFormulario.add(JTextBorderBottom.createBorderedTextArea(txtVencimiento));
		pnlFormulario.add(new JLabel(""));
		pnlFormulario.add(btnAlta);

		pnlPrincipal.add(pnlFormulario);
	}

	public static void main(String[] args) {
		new frmServicioAlta();
	}

}
