import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	// Variables o propiedades
	private JPanel contentPane;

	/* M�todo 'main' */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Constructor */
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		//Tipo Nombre = new Tipo ();
		
		/* V�deo n�mero dos: 'Las propiedades' (https://vimeo.com/144055333)*/
		
		Carta SieteDeBastos=new Carta();
		Carta UnoDeOros=new Carta();
		
		/* V�deo n�mero tres: '�mbito y m�todos' (https://vimeo.com/144489375) */
		
			// La naturaleza 'public' de 'Numero' permit�a acceder con absoluta libertad al...
			// ... contenido de la variable citada. Tras cambiar su condici�n 'public' por 'private'...
			// ... carecemos de dicha posibilidad.
		
			// Antes de modificar 'public' por 'private' podiamos acceder a las variables...
			// ... de la clase 'Carta'. 
			// En la siguiente l�nea figuraba el c�digo 'SieteDeBastos.Numero=7'.
			// A continuaci�n utilizamos la funci�n 'SetNumero' de la clase 'Carta'.
		
		SieteDeBastos.SetNumero(50);
		
		/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
		
			// Efectuamos el mismo cambio realizado con la anterior l�nea de c�digo.
		
		SieteDeBastos.SetPalo("Bastos");
		
		/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
		
		System.out.println("Mi carta es el " + SieteDeBastos.GetNumero() + " de " + SieteDeBastos.GetPalo() + ".");
		
		/* V�deo n�mero tres: '�mbito y m�todos' (https://vimeo.com/144489375) */
		
			/* Comentario
		
			UnoDeOros.Numero=1;
			UnoDeOros.Palo="Oros";
		
			 */
		
		
		/* V�deo n�mero dos: 'Las propiedades' (https://vimeo.com/144055333) */
	}
	
	
	
	
	
	
}
