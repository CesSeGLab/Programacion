import javax.print.attribute.standard.PrinterLocation;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//N�meros enteros
		
		int NumeroEntero = 10;
		int NumeroNegativo = -10;
		int NumeroSinDefinir;
		NumeroSinDefinir = 0;
		
		
		//N�meros decimales
		/* Como puede apreciarse en la informaci�n expuesta a continuaci�n,
		 *  para definir una variable 'float' debe agregarse una
		 * efe despu�s del �ltimo d�gito num�rico. */
		
		float DecimalNumeroUno = 10.5f;
		double DecimalNumeroDos = 10.5;
		
		//'Char' y 'String'
		
		/* El valor de una variable 'char' debe definirse con el uso de comillas simples.
		 * En cuanto al tipo 'String', el valor de la variable debe presentarse recurriendo
		 * a un entrecomillado convencional. */
		
		char Letra = 'A';
		String LetraString ="A";
		
		//Boolean
		/* Una variable 'boolean' puede presentar s�lo dos valores. En concreto, 'true'
		 * o 'false'. */
		boolean Semaforo = true;
		
		System.out.println(NumeroEntero);
		System.out.println(NumeroSinDefinir);
		System.out.println(NumeroNegativo);
		System.out.println(DecimalNumeroUno);
		System.out.println(DecimalNumeroDos);
		System.out.println(Letra);
		System.out.println(LetraString);
		System.out.println(Semaforo);
		
		

	}

}
