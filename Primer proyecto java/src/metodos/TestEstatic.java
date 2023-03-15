package metodos;

public class TestEstatic {
	//Un metodo sobrecargado es un metodo que tiene el mismo nombre pero que tienen diferente  numeros o parametros

	public static void main(String[] args) {
		MetodosEstaticos.metodo2();
		
		MetodosEstaticos.dato="Cambio";
		
		MetodosEstaticos me =new MetodosEstaticos();
		me.metodo3();
//		me.metodo3(1);
//		me.metodo3("En un lugar de la Mncha...");
		me.dato="ME";
		
		MetodosEstaticos me2 =new MetodosEstaticos();
		me2.dato="ME2";
		
		
		System.out.println(me.dato);
		System.out.println(me2.dato);
		System.out.println(MetodosEstaticos.dato);
	}

}
