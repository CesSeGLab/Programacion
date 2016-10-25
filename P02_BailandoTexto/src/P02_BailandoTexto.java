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
		
		//Ventana de la aplicaci�n
		setTitle("P02_BailandoTexto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Bot�n situado en la zona superior de la ventana
		JButton BotonSuperior = new JButton("---> Copia de texto");
		BotonSuperior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			CajaTextoIzquierda.setText(CajaTextoDerecha.getText());
			
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
		
		//Bot�n situado en la zona superior de la ventana
		JButton BotonInferior = new JButton("<--- Copia de texto");
		BotonInferior.setBounds(144, 216, 153, 23);
		contentPane.add(BotonInferior);
	}
}
