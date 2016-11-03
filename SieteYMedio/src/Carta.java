
public class Carta {

	// Definición de la clase mediante la palabra reservada 'Carta'.
	
	/*
	 * public class NombreDeLaClase
	 * */
	
	/* Vídeo número dos: 'Las propiedades' (https://vimeo.com/144055333) */
	
	/* Vídeo número tres: 'Ámbito y métodos' (https://vimeo.com/144489375) */
	
	// Vamos a cambiar el carácter 'public' por 'private'.
	private int Numero;
	
	/* Vídeo número tres: 'Ámbito y métodos' (https://vimeo.com/144489375) */
	
	/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	// Vamos a cambiar el carácter 'public' por 'private'.
	private String Palo;
	
	/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	/* */
	
	/* Vídeo número dos: 'Las propiedades' (https://vimeo.com/144055333) */
	
	/* Vídeo número seis: 'Constantes' (https://vimeo.com/144679432) */
	
	public static final String Bastos = "Bastos";
	public static final String Copas = "Copas";
	public static final String Espadas = "Espadas";
	public static final String Oros = "Oros";
	
	/* Vídeo número seis: 'Constantes' (https://vimeo.com/144679432) */
	
	// Constructor
	
	//Punto de entrada ejecutado al crear un objeto 'Carta'
	public Carta() {
		
		System.out.println("Hemos creado un objeto 'Carta'.");
	}
	
	/* Vídeo número tres: 'Ámbito y métodos' (https://vimeo.com/144489375) */
	
	// La naturaleza 'public' de 'Numero' permitía acceder con absoluta libertad al...
	// ... contenido de la variable referida. Tras cambiar su condición 'public' por 'private'...
	// ... carecemos de dicha posibilidad.
	
	// Una vez ejecutado, el siguiente método no proporciona ninguna información. El término...
	// empleado para aludir a una función así es 'void'.
	
	// La sintaxis utilizada para definir un método puede sintetizarse así:
	// (public/private) (Datos de salida) (Nombre del método) (Datos de entrada)
	
	public void SetNumero (int Numero) {
		
	/* Vídeo número cinco: 'If' (https://vimeo.com/144590125) */
		
		// Inicio de sentencia 'if'
		
		if (Numero <1) {
		this.Numero=1;
		} else if (Numero>12) {
		this.Numero=12;
		} else {
		this.Numero=Numero;
		}
		
		// Fin de sentencia 'if'
		
	/* Vídeo número cinco: 'If' (https://vimeo.com/144590125) */
	}

	// A diferencia de la función anterior, el siguiente método facilita información al...
	// ... programador.
	
	public int GetNumero () {
		return Numero;
	}
	
	/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	public void SetPalo (String Palo) {
		
	/* Vídeo número siete: 'Switch' (https://vimeo.com/144679904) */
		
		switch (Palo) {
			case "Bastos":
				this.Palo="Bastos";
				break;
			case "Oros":
				this.Palo="Oros";
				break;
			case "Copas":
				this.Palo="Copas";
				break;
			case "Espadas":
				this.Palo="Espadas";
				break;
			default:
				this.Palo="Bastos";
		}
		
	// La inclusión de una sentencia 'switch' hace innecesaria la siguiente
	// línea de código: this.Palo=Palo;
	// this.Palo=Palo;
		
	/* Vídeo número siete: 'Switch' (https://vimeo.com/144679904) */
	}
	
	public String GetPalo () {
		return Palo;
	}
	/* Vídeo número cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */

}
