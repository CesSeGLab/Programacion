import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P01_MiPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField CajaNombre;
	private JLabel EtiquetaApellidos;
	private JTextField CajaApellidos;
	private JLabel EtiquetaEdad;
	private JTextField CajaEdad;
	private JLabel EtiquetaEMail;
	private JTextField CajaEMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P01_MiPerfil frame = new P01_MiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P01_MiPerfil() {
		setTitle("P01_MiPerfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel EtiquetaNombre = new JLabel("Nombre");
		EtiquetaNombre.setBounds(10, 11, 210, 14);
		contentPane.add(EtiquetaNombre);
		
		CajaNombre = new JTextField();
		CajaNombre.setText("C\u00E9sar");
		CajaNombre.setBounds(10, 25, 210, 20);
		contentPane.add(CajaNombre);
		CajaNombre.setColumns(10);
		
		EtiquetaApellidos = new JLabel("Apellidos");
		EtiquetaApellidos.setBounds(10, 56, 210, 14);
		contentPane.add(EtiquetaApellidos);
		
		CajaApellidos = new JTextField();
		CajaApellidos.setText("Segura Laborda");
		CajaApellidos.setBounds(10, 71, 210, 20);
		contentPane.add(CajaApellidos);
		CajaApellidos.setColumns(10);
		
		EtiquetaEdad = new JLabel("Edad");
		EtiquetaEdad.setBounds(10, 102, 210, 14);
		contentPane.add(EtiquetaEdad);
		
		CajaEdad = new JTextField();
		CajaEdad.setText("39");
		CajaEdad.setBounds(10, 117, 210, 20);
		contentPane.add(CajaEdad);
		CajaEdad.setColumns(10);
		
		EtiquetaEMail = new JLabel("Correo electr\u00F3nico");
		EtiquetaEMail.setBounds(10, 148, 210, 14);
		contentPane.add(EtiquetaEMail);
		
		CajaEMail = new JTextField();
		CajaEMail.setText("csegura@alumni.unav.es");
		CajaEMail.setBounds(10, 164, 210, 20);
		contentPane.add(CajaEMail);
		CajaEMail.setColumns(10);
	}
}
