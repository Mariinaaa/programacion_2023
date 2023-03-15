package metodos;

public class MetodosEstaticos {
	static String dato="dato1";
	

	public static void metodo1() {
		System.out.println("Método1 estático");
		metodo2();
	}
	public static void metodo2() {
		dato="Hola";
		System.out.println("Método2 estático");
	}
	public void metodo3() {
		metodo1();
		metodo3(0);
		System.out.println("Método3 no estático");
	}
	
	public void metodo3(int num) {
		System.out.println(num);
	}
	
//	public void metodo3(String texto) {
//		System.out.println(texto);
//	}

}
