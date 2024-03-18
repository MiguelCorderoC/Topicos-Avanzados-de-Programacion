package Frontend;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//Esta es el package para importar las librerias que yo mismo hice
import Components.*;

public class frmRegistro extends JFrame {

	// instancio a nivel de clase los componentes que utilizare
	JPanel pnlNorte = new JPanel();
	JPanel pnlSur = new JPanel();
	JPanel pnlCentro = new JPanel();
	JPanel pnlRegistro = new JPanel();
	JPanel pnlImagen = new JPanel();
	JTextArea txtNombre = new JTextArea();
	JTextArea txtUsuario = new JTextArea();
	JTextArea txtContrasena = new JTextArea();
	JTextArea txtCorreo = new JTextArea();
	JTextArea txtUrl = new JTextArea(1, 20);
	JButton btnRegistrar = new JButton("Registrar");
	Font fontContacto = new Font("Arial", Font.PLAIN, 16);
	JLabel lblContacto = new JLabel("Programa hecho por: Miguel Cordero");
	String[] opTipo = { "Pagina web", "App movil", "App desktop", "Banco" };
	JComboBox<String> cmbTipo = new JComboBox<>(opTipo);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	JMenuBarNav navegador = new JMenuBarNav();

	// Configuracion del frame
	public frmRegistro() {
		setTitle("Registro");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(screenSize.width, screenSize.height);
		getContentPane().setBackground(Color.decode("#c9ccd1"));
		// Aqui estoy importando mi componente que el menu de navegacion JMenuBarNav
		setJMenuBar(navegador);
		initComponents();
		setVisible(true);

	}

	private void initComponents() {
		// Agregar los componentes al panel pnlRegistro
		pnlRegistro.add(JTextBorderBottom.createLabel("Nombre:"));
		pnlRegistro.add(JTextBorderBottom.createBorderedTextArea(txtNombre));
		pnlRegistro.add(JTextBorderBottom.createLabel("Usuario:"));
		pnlRegistro.add(JTextBorderBottom.createBorderedTextArea(txtUsuario));
		pnlRegistro.add(JTextBorderBottom.createLabel("Contrase�a:"));
		pnlRegistro.add(JTextBorderBottom.createBorderedTextArea(txtContrasena));
		pnlRegistro.add(JTextBorderBottom.createLabel("Correo:"));
		pnlRegistro.add(JTextBorderBottom.createBorderedTextArea(txtCorreo));
		pnlRegistro.add(JTextBorderBottom.createLabel("URL:"));
		pnlRegistro.add(JTextBorderBottom.createBorderedTextArea(txtUrl));
		pnlRegistro.add(JTextBorderBottom.createLabel("Tipo:"));
		pnlRegistro.add(new Label());
		pnlRegistro.add(cmbTipo);
		pnlRegistro.add(new Label());
		pnlRegistro.add(btnRegistrar);

		// Cambio el layout del contenedor del formulario
		pnlRegistro.setLayout(new GridLayout(15, 1));
		pnlRegistro.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

		// Agregar imagen al panel pnlImagen
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/Assets/imgRegistro.png"));
		JLabel lblImagen = new JLabel(imageIcon);
		pnlImagen.add(lblImagen);

		// Cambio colores y otros estilos
		pnlRegistro.setBackground(Color.decode("#ffffff"));
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(Color.decode("#0866ff"));

		pnlCentro.setLayout(new FlowLayout(FlowLayout.LEFT, 200, 120));
		add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.add(pnlRegistro);
		pnlCentro.add(pnlImagen);

	}

	public static void main(String[] args) {
		new frmRegistro();
	}
}
