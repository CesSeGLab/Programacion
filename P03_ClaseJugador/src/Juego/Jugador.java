package Juego;

public class Jugador {

// (2) A continuaci�n definimos las variables de la clase 'Jugador' y, en concreto, vamos
// a conferirles car�cter 'private' para as� prevenir cambios realizados desde el exterior
// de la clase.
	
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private int Edad;
	private int ID;
	private int Puntuacion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Usted ha creado un nuevo perfil de jugador.");
		
		}
	
// (3) Como hemos se�alado con anterioridad, hemos otorgado rasgo 'private' a las variables
// de la presente clase. En consecuencia, la clase 'Principal' no puede acceder a la
// informaci�n contenida en 'Jugador'. Solucionaremos dicho problema creando diversos m�todos.
	
	
	/* El m�todo 'GetNombre' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'Nombre' al usuario.
	 */
	
	public String GetNombre () {
	return Nombre;
	}
	
	/* El m�todo 'SetNombre' no suministra informaci�n al usuario del 'software'. 
	 * S�lo asigna un valor a la variable 'Nombre'.
	 */
	
	public void SetNombre (String NombreEntrada) {
		Nombre = NombreEntrada;
	}
	
	/* El m�todo 'GetApellido1' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'Apellido1' al usuario.
	 */
	
	public String GetApellido1 () {
	return Apellido1;
	}
	
	/* El m�todo 'SetApellido1' no suministra informaci�n al usuario del 'software'. 
	 * S�lo asigna un valor a la variable 'Apellido1'.
	 */
	
	public void SetApellido1 (String Apellido1Entrada) {
		Apellido1 = Apellido1Entrada;
	}
	
	/* El m�todo 'GetApellido2' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'Apellido2' al usuario.
	 */
	
	public String GetApellido2 () {
	return Apellido2;
	}
	
	/* El m�todo 'SetApellido2' no suministra informaci�n al usuario de la aplicaci�n. 
	 * S�lo asigna un valor a la variable 'Apellido2'.
	 */
	
	public void SetApellido2 (String Apellido2Entrada) {
		Apellido2 = Apellido2Entrada;
	}
	
	/* El m�todo 'GetEdad' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'Edad' al usuario.
	 */
	
	public int GetEdad (){
	return Edad;
	}
	
	/* El m�todo 'SetEdad' no suministra informaci�n al usuario de la aplicaci�n. 
	 * S�lo asigna un valor a la variable 'Edad'.
	 */
	
	public void SetEdad (int EdadEntrada) {
	Edad = EdadEntrada;
	}
		
	/* El m�todo 'GetID' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'ID' al usuario.
	 */
	
	public int GetID (){
	return ID;
	}
	
	/* El m�todo 'SetID' no suministra informaci�n al usuario de la aplicaci�n. 
	 * S�lo asigna un valor a la variable 'ID'.
	 */
	
	public void SetID (int IDEntrada) {
	ID = IDEntrada;
	}
	
	/* El m�todo 'GetPuntuacion' -accesible por cualquier clase externa gracias a su car�cter
	 * 'public' - facilita los datos contenidos en 'Puntuacion' al usuario.
	 */
	
	public int GetPuntuacion (){
	return Puntuacion;
	}
	
	/* El m�todo 'SetID' no suministra informaci�n al usuario de la aplicaci�n. 
	 * S�lo asigna un valor a la variable 'ID'.
	 */
	
	public void SetPuntuacion (int PuntuacionEntrada) {
	Puntuacion = PuntuacionEntrada;
	
	
	}

}
