
public class Carta {

	// Definici�n de la clase mediante la palabra reservada 'Carta'.
	
	/*
	 * public class NombreDeLaClase
	 * */
	
	/* V�deo n�mero dos: 'Las propiedades' (https://vimeo.com/144055333) */
	
	/* V�deo n�mero tres: '�mbito y m�todos' (https://vimeo.com/144489375) */
	
	// Vamos a cambiar el car�cter 'public' por 'private'.
	private int Numero;
	
	/* V�deo n�mero tres: '�mbito y m�todos' (https://vimeo.com/144489375) */
	
	/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	// Vamos a cambiar el car�cter 'public' por 'private'.
	private String Palo;
	
	/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	/* */
	
	/* V�deo n�mero dos: 'Las propiedades' (https://vimeo.com/144055333) */
	
	/* V�deo n�mero seis: 'Constantes' (https://vimeo.com/144679432) */
	
	public static final String Bastos = "Bastos";
	public static final String Copas = "Copas";
	public static final String Espadas = "Espadas";
	public static final String Oros = "Oros";
	
	/* V�deo n�mero seis: 'Constantes' (https://vimeo.com/144679432) */
	
	// Constructor
	
	//Punto de entrada ejecutado al crear un objeto 'Carta'
	public Carta() {
		
		System.out.println("Hemos creado un objeto 'Carta'.");
	}
	
	/* V�deo n�mero tres: '�mbito y m�todos' (https://vimeo.com/144489375) */
	
	// La naturaleza 'public' de 'Numero' permit�a acceder con absoluta libertad al...
	// ... contenido de la variable referida. Tras cambiar su condici�n 'public' por 'private'...
	// ... carecemos de dicha posibilidad.
	
	// Una vez ejecutado, el siguiente m�todo no proporciona ninguna informaci�n. El t�rmino...
	// empleado para aludir a una funci�n as� es 'void'.
	
	// La sintaxis utilizada para definir un m�todo puede sintetizarse as�:
	// (public/private) (Datos de salida) (Nombre del m�todo) (Datos de entrada)
	
	public void SetNumero (int Numero) {
		
	/* V�deo n�mero cinco: 'If' (https://vimeo.com/144590125) */
		
		// Inicio de sentencia 'if'
		
		if (Numero <1) {
		this.Numero=1;
		} else if (Numero>12) {
		this.Numero=12;
		} else {
		this.Numero=Numero;
		}
		
		// Fin de sentencia 'if'
		
	/* V�deo n�mero cinco: 'If' (https://vimeo.com/144590125) */
	}

	// A diferencia de la funci�n anterior, el siguiente m�todo facilita informaci�n al...
	// ... programador.
	
	public int GetNumero () {
		return Numero;
	}
	
	/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */
	
	public void SetPalo (String Palo) {
		
	/* V�deo n�mero siete: 'Switch' (https://vimeo.com/144679904) */
		
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
		
	// La inclusi�n de una sentencia 'switch' hace innecesaria la siguiente
	// l�nea de c�digo: this.Palo=Palo;
	// this.Palo=Palo;
		
	/* V�deo n�mero siete: 'Switch' (https://vimeo.com/144679904) */
	}
	
	public String GetPalo () {
		return Palo;
	}
	/* V�deo n�mero cuatro: 'Segundo ejemplo: Uso de 'this' (https://vimeo.com/144490651) */

}
