package Front;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Components.*;

public class frmBancoAlta extends JFrame {

	JMenuBarNav navegador = new JMenuBarNav();
	JPanel pnlPrincipal = new JPanel(new GridLayout(1, 2));
	JPanel pnlFormulario = new JPanel(new GridLayout(14, 1));
	JPanel pnlImagenes = new JPanel(new GridLayout(2, 2));
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
	public frmBancoAlta() {
		setTitle("Alta Banco");
		setLayout(new BorderLayout());
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(navegador, BorderLayout.NORTH);
		add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setBackground(Color.YELLOW);
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

		// Agregar imagen al panel pnlImagenes
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/Assets/imgTarjeta.png"));
		JLabel lblImagen = new JLabel(imageIcon);
		pnlImagenes.add(lblImagen);
		// Agregar imagen al panel pnlImagenes
		ImageIcon imgTarjetaCard = new ImageIcon(getClass().getResource("/Assets/imgTarjetaCard.png"));
		JLabel lblTarjetaCard = new JLabel(imgTarjetaCard);
		pnlImagenes.add(lblTarjetaCard);
		// Agregar imagen al panel pnlImagenes
		ImageIcon imgCard = new ImageIcon(getClass().getResource("/Assets/imgCredit.png"));
		JLabel lblCard = new JLabel(imgCard);
		pnlImagenes.add(lblCard);

		// Agregar imagen al panel pnlImagenes
		ImageIcon imgTarjet = new ImageIcon(getClass().getResource("/Assets/imgTarjet.png"));
		JLabel lblTarjet = new JLabel(imgTarjet);
		pnlImagenes.add(lblTarjet);

		// pnlImagenes.setBorder(new EmptyBorder(100, 100, 0, 0)); // Ajusta el valor de
		// 20 según tus preferencias
		// pnlFormulario.setBorder(new EmptyBorder(100, 100, 0, 0)); // Ajusta el valor
		// de 20 según tus preferencias
		pnlFormulario.setBorder(new EmptyBorder(20, 20, 20, 20));
		pnlFormulario.setBackground(Color.PINK);
		pnlImagenes.setBackground(Color.green);
		pnlPrincipal.add(pnlFormulario);
		pnlPrincipal.add(pnlImagenes);
	}

	public static void main(String[] args) {
		new frmBancoAlta();
	}

}
