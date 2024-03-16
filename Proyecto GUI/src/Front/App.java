package Front;

//Importo las librerias necesarias
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.Dimension;

public class App extends JFrame {

	// instancio a nivel de clase los componentes que utilizare
	JPanel pnlNorte = new JPanel();
	JPanel pnlSur = new JPanel();
	JPanel pnlEste = new JPanel();
	JPanel pnlOeste = new JPanel();
	JPanel pnlCentro = new JPanel();
	JButton btnAgua = new JButton();

	// Obtengo las dimensiones de la pantalla
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	// Configuracion del frame
	public App() {
		setTitle("Home");
		setLayout(new BorderLayout());
		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		initComponents();
	}

	public static void initComponents() {

	}

	// Metodo main para iniciar mi aplicacion
	public static void main(String[] args) {
		new App();
	}
}
