package utils;

public class Utilidades {
	public static void pintarmenu() {
		/**
		 * Metodo para pintar menu por defecto
		 */
		System.out.println("\nMENÚ DE OPCIONES\n");
	    System.out.println("1. Validar email");
	    System.out.println("2. Pintar el cuadrado");
	    System.out.println("3. Mostrar datos");
	    System.out.println("4. Salir");
	}	
	
	public static void pintarMenu(String menu) {
		String[] opciones = menu.split("\\|");
		pintarMenu(opciones);	
	}
	
	public static void pintarMenu(String[] menu) {
		for (String opcion:menu) {
			System.out.println(opcion);
		}
		
	}
}
