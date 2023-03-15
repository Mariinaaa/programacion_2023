package Encapsulacion;

public class Aula {

	public static void main(String[] args) {
		
		Alumno alumno1=new Alumno("nombre1","Apellido1",8.9);
		//alumno1.nombre="Juan";
		alumno1.setNombre("Angel");
		alumno1.getNombre();
		//alumno1.getApellidos("Sanchez");
		alumno1.getApellidos();
		//alumno1.getNotaMedia("8.9");
		alumno1.getNotaMedia();
		
		
		Alumno alumno2=new Alumno("nombre2"," Apellido2");
		alumno2.estudiar1();
		System.out.println(alumno2.getNombre());
		
	}

}
