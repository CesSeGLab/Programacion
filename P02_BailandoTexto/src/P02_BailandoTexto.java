import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P02_BailandoTexto extends JFrame {

	//Variables
	
	private JPanel contentPane;
	private JTextField CajaTextoIzquierda;
	private JTextField CajaTextoDerecha;
	
	//Cadena de caracteres a teclear en la caja de texto situada a la izquierda.
	private String MensajeADuplicarIzquierdaDerecha;
	
	//Cadena de caracteres a teclear en la caja de texto localizada a la derecha.
	private String MensajeADuplicarDerechaIzquierda;

	//Punto de entrada
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P02_BailandoTexto frame = new P02_BailandoTexto();
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
	public P02_BailandoTexto() {
		
		//Ventana de la aplicación
		setTitle("P02_BailandoTexto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botón situado en la zona superior de la ventana
		JButton BotonSuperior = new JButton("---> Copia de texto");
		BotonSuperior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		/*'String' introducido en el campo de texto situado a la izquierda
		 * cuya información obtendremos gracias al método 'GetText'. */
		MensajeADuplicarIzquierdaDerecha = CajaTextoIzquierda.getText();
		
		/*El método 'SetText' recibe la información almacenada en
		 * el 'String' MensajeADuplicarIzquierdaDerecha. */  
		CajaTextoDerecha.setText(MensajeADuplicarIzquierdaDerecha);
			
		/*El entrecomillado tecleado en el campo 'String' del método 'SetText'
		 * no incluye ninguna información y, en consecuencia, "imprime" en la caja de texto
		 * su contenido; es decir, nada. */
		CajaTextoIzquierda.setText("");
			
			}
		});
		BotonSuperior.setBounds(144, 11, 153, 23);
		contentPane.add(BotonSuperior);
		
		//Caja de texto situada a la izquierda
		CajaTextoIzquierda = new JTextField();
		CajaTextoIzquierda.setBounds(10, 98, 130, 20);
		contentPane.add(CajaTextoIzquierda);
		CajaTextoIzquierda.setColumns(10);
		
		//Caja de texto situada a la derecha
		CajaTextoDerecha = new JTextField();
		CajaTextoDerecha.setBounds(294, 98, 130, 20);
		contentPane.add(CajaTextoDerecha);
		CajaTextoDerecha.setColumns(10);
		
		//Botón situado en la zona superior de la ventana
		JButton BotonInferior = new JButton("<--- Copia de texto");
		BotonInferior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			/*'String' introducido en el campo de texto situado a la derecha
			* cuya información obtendremos gracias al método 'GetText'. */
			MensajeADuplicarDerechaIzquierda = CajaTextoDerecha.getText();
			
			/*El método 'SetText' recibe la información almacenada en
			 * el 'String' MensajeADuplicarDerechaIzquierda. */
			CajaTextoIzquierda.setText(MensajeADuplicarDerechaIzquierda);
			
			/*El entrecomillado tecleado en el campo 'String' del método 'SetText'
			 * no incluye ninguna información y, en consecuencia, "imprime" en la caja de texto
			 * su contenido; es decir, nada. */
			CajaTextoDerecha.setText("");
			}
		});
		BotonInferior.setBounds(144, 216, 153, 23);
		contentPane.add(BotonInferior);
	}
}
