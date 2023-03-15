package POO;

public class Universidad {

	public static void main(String[] args) {
		Persona personal=new Persona();
		personal.nombre="Maria";
		
		Persona persona2=personal;
		persona2.nombre="Juan";
		
		System.out.println(personal.nombre);
		
		Persona persona3=new Persona();
		persona3.nombre="Eva";
		System.out.println(persona3.nombre);
		
		persona2=persona3;
				
		persona3=null;
		System.out.println(persona2.nombre);
				
		

	}

}
