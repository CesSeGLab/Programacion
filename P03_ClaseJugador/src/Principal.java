import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

//(1) El presente proyecto debe incluir dos 'packages'. El primero ('default package') contiene
//la clase 'Principal' y el segundo ('Juego') incluye la clase 'Jugador'.
//'Principal' no puede acceder al contenido de 'Jugador' y, por tanto, debemos importar
//los archivos ubicados en 'Juego' recurriendo a la siguiente línea de código:
//import Juego.Jugador;
//El comentario de número correlativo puede encontrarse en la clase 'Jugador'.

public class Principal extends JFrame {

	private JPanel contentPane;

// Punto de entrada
	
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

	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
// (4) Acto seguido procedemos a crear un objeto de clase 'Jugador' al cual
// bautizaremos como 'Player1' y otorgaremos valores a sus diferentes
// variables recurriendo a los métodos creados en la clase 'Jugador'.
		
		Jugador Player1 = new Jugador();
		Player1.SetNombre("César");
		Player1.SetApellido1("Segura");
		Player1.SetApellido2("Laborda");
		Player1.SetEdad(39);
		Player1.SetID(1);
		Player1.SetPuntuacion(0);
		
		
// (5) 
		System.out.println("El nombre del jugador es " + Player1.GetNombre() +
		" y sus apellidos " + Player1.GetApellido1() + " " +Player1.GetApellido2()+ 
		".");
	}
	
	
	
	

}
