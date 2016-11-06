package Juego;

public class Jugador {

// (2) A continuación definimos las variables de la clase 'Jugador' y, en concreto, vamos
// a conferirles carácter 'private' para así prevenir cambios realizados desde el exterior
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
	
// (3) Como hemos señalado con anterioridad, hemos otorgado rasgo 'private' a las variables
// de la presente clase. En consecuencia, la clase 'Principal' no puede acceder a la
// información contenida en 'Jugador'. Solucionaremos dicho problema creando diversos métodos.
	
	
	/* El método 'GetNombre' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'Nombre' al usuario.
	 */
	
	public String GetNombre () {
	return Nombre;
	}
	
	/* El método 'SetNombre' no suministra información al usuario del 'software'. 
	 * Sólo asigna un valor a la variable 'Nombre'.
	 */
	
	public void SetNombre (String NombreEntrada) {
		Nombre = NombreEntrada;
	}
	
	/* El método 'GetApellido1' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'Apellido1' al usuario.
	 */
	
	public String GetApellido1 () {
	return Apellido1;
	}
	
	/* El método 'SetApellido1' no suministra información al usuario del 'software'. 
	 * Sólo asigna un valor a la variable 'Apellido1'.
	 */
	
	public void SetApellido1 (String Apellido1Entrada) {
		Apellido1 = Apellido1Entrada;
	}
	
	/* El método 'GetApellido2' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'Apellido2' al usuario.
	 */
	
	public String GetApellido2 () {
	return Apellido2;
	}
	
	/* El método 'SetApellido2' no suministra información al usuario de la aplicación. 
	 * Sólo asigna un valor a la variable 'Apellido2'.
	 */
	
	public void SetApellido2 (String Apellido2Entrada) {
		Apellido2 = Apellido2Entrada;
	}
	
	/* El método 'GetEdad' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'Edad' al usuario.
	 */
	
	public int GetEdad (){
	return Edad;
	}
	
	/* El método 'SetEdad' no suministra información al usuario de la aplicación. 
	 * Sólo asigna un valor a la variable 'Edad'.
	 */
	
	public void SetEdad (int EdadEntrada) {
	Edad = EdadEntrada;
	}
		
	/* El método 'GetID' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'ID' al usuario.
	 */
	
	public int GetID (){
	return ID;
	}
	
	/* El método 'SetID' no suministra información al usuario de la aplicación. 
	 * Sólo asigna un valor a la variable 'ID'.
	 */
	
	public void SetID (int IDEntrada) {
	ID = IDEntrada;
	}
	
	/* El método 'GetPuntuacion' -accesible por cualquier clase externa gracias a su carácter
	 * 'public' - facilita los datos contenidos en 'Puntuacion' al usuario.
	 */
	
	public int GetPuntuacion (){
	return Puntuacion;
	}
	
	/* El método 'SetID' no suministra información al usuario de la aplicación. 
	 * Sólo asigna un valor a la variable 'ID'.
	 */
	
	public void SetPuntuacion (int PuntuacionEntrada) {
	Puntuacion = PuntuacionEntrada;
	
	
	}

}
