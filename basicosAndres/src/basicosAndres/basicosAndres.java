package basicosAndres;

public class basicosAndres {
	static String mensaje="Hola Mundo";
	static int a=3, b=8;

	 public static void numericos() {
		 //Estos son los tipos b�sicos
	        byte elMasPeque;
	        short chiquitin;
	        int entero;
	        long duplicaEntero;
	        float grande;
	        double doble;	
	        
	      //Ejemplos de asignaci�n de valores a las variables de tipos b�sicos
	        entero = 10;
	        doble = 5.6;

	        //Mostrar en pantalla el contendido de las variables de tipos b�sicos.
	        System.err.println("Valor entero");
	        System.out.println(entero);
	        System.out.println("Valor doble");
	        System.out.println(doble);
	 }

	public static void cadenas(String msj){
		
		System.out.println(msj);
	}
	 

	 
	 public static void logicos() {
			
			if (a>b) {
				
				System.out.println("a es mayor que b");
				
			} else if (a<b) {
				System.out.println("b es mayor que a");
				
			} else if (a==b) {
				System.out.println("a y b son iguales");
			}
		}

	
	
	
		
	public static void main (String [] args) {
		
		logicos();
		cadenas(mensaje);
	    numericos();
		
	}
	
}
		


