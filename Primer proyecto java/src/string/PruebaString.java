package string;

public class PruebaString {

	public static void main(String[] args) {
		String nombre="Caperucita roja";
		nombre=nombre.toUpperCase();
		System.out.println(nombre);
		
		String lobo1="Lobo";
		String lobo2="Lobo";
		System.out.println(lobo1==lobo2);
		System.out.println();
		
		lobo2=nombre.toLowerCase();
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		nombre.endsWith(".txt"); //Saber como acaba
		System.out.println(nombre.endsWith("JA"));
		System.out.println(nombre.indexOf("A")); //Saber en que podicion esta esa letra empezando a buscar por delante
		System.out.println(nombre.lastIndexOf("A")); //Saber en que podición esta esa letra empezandoa buscar por detrás
		System.out.println("  asd  asdasd  ".trim());
		System.out.println("  asd  asdasd  ".replace(" ",""));
		System.out.println(nombre.substring(3)); //Quita las tres primeras posiciones
		System.out.println(nombre.substring(3,7)); //Quita las tres primeras posiciones y las siete ultimas
		
		int posicion=nombre.indexOf("ROJA");
		System.out.println(nombre.substring(posicion));//Que solo imprima roja
		int posicion2=nombre.indexOf(" ");
		System.out.println(nombre.substring(posicion2+1));//Que solo imprima roja y mas 1 para que quite el espacio de delante
		int posicion3=nombre.indexOf("ROJA");
		System.out.println(nombre.substring(posicion3).trim());//Que solo imprima roja
		
		String cadena="N1;A1;DNI1;23;Madrid";
		String[] valores=cadena.split(";");
		for (String valor : valores) {
			System.out.println(valor);
		}
		
		

	}

}
