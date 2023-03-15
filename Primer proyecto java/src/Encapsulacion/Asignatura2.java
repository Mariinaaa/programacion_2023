package Encapsulacion;

public class Asignatura2 {
	public static void main(String[] args) {
		Alumno alumno=new Alumno("Alumno1",8.9, null);
		alumno.setNombre("Angel");
		alumno.estudiar1();
		System.out.println(alumno.getNombre());
		Asignatura asignatura1 = new Asignatura();
		Alumno alumno1=new Alumno("Alumno", 9.0, asignatura1);
		
		
	}
}
	


