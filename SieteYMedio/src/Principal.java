import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	// Variables o propiedades
	private JPanel contentPane;

	/* Método 'main' */
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
		
		/* Vídeo número dos: 'Las propiedades' (https://vimeo.com/144055333)*/
		
		Carta SieteDeBastos=new Carta();
		Carta UnoDeOros=new Carta();
		
		/* Vídeo número tres: 'Ámbito y métodos' (https://vimeo.com/144489375) */
		
			// La naturaleza 'public' de 'Numero' permitía acceder con absoluta libertad al...
			// ... contenido de la variable citada. Tras cambiar su condición 'public' por 'private'...
			// ... carecemos de dicha posibilidad.
		
			// Antes de modificar 'public' por 'private' podiamos acceder a las variables...
			// ... de la clase 'Carta'. 
			// En la siguiente línea figuraba el código 'SieteDeBastos.Numero=7'.
			// A continuación utilizamos la función 'SetNumero' de la clase 'Carta'.
		
		SieteDeBastos.SetNumero(50);
		
		/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
		
			// Efectuamos el mismo cambio realizado con la anterior línea de código.
		
		SieteDeBastos.SetPalo("Bastos");
		
		/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
		
		System.out.println("Mi carta es el " + SieteDeBastos.GetNumero() + " de " + SieteDeBastos.GetPalo() + ".");
		
		/* Vídeo número tres: 'Ámbito y métodos' (https://vimeo.com/144489375) */
		
			/* Comentario
		
			UnoDeOros.Numero=1;
			UnoDeOros.Palo="Oros";
		
			 */
		
		
		/* Vídeo número dos: 'Las propiedades' (https://vimeo.com/144055333) */
	}
	
	
	
	
	
	
}
