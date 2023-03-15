package arrays;

public class Aula {

	public static void main(String[] args) {
		Asignatura asignatura1Alumno1=new Asignatura("Física",6.0);
		Asignatura asignatura2Alumno1=new Asignatura("Matemáticas",7.0);
		Asignatura[] asignaturaAlumno1= {asignatura1Alumno1,asignatura2Alumno1}; //Crear array de las dos anteriores asignaturas
		Alumno alumno1 = new Alumno("nombre1","apellido1",asignaturaAlumno1);
		
		Asignatura asignatura1Alumno2=new Asignatura("Física",8.0);
		Asignatura asignatura2Alumno2=new Asignatura("Matemáticas",5.0);
		Asignatura[] asignaturaAlumno2= {asignatura1Alumno2,asignatura2Alumno2}; //Crear array de las dos anteriores asignaturas
		Alumno alumno2 = new Alumno("nombre2","apellido2",asignaturaAlumno2);
		
		Alumno [] alumnos= {alumno1,alumno2}; //Creo el aula con los alumnos
		System.out.println("Hay "+alumnos.length+" alumnos en el aula"); //Saber cuantos alumnos hay en el aula
		System.out.println(" ");
		
		for (Alumno alumno : alumnos) { //Recorrer un array
			System.out.println(alumno.getNombre()); //Saber los nombres de los alumnos
			System.out.println(" ");
			Asignatura[] asignaturaAlumno=alumno.getAsignatura();
			for (Asignatura asignatura : asignaturaAlumno) {
				System.out.println("\t"+asignatura.getNombre()+" nota: "+asignatura.getNota()); //Asignatura y nota
			}
		}
		
		//Nota media
		double notasAlumnos=0;
		int totalAsignaturas=0;
		for (Alumno alumno : alumnos) { //Recorrer un array
			System.out.println(alumno.getNombre()); //Saber los nombres de los alumnos
			System.out.println(" ");
			Asignatura[] asignaturaAlumno=alumno.getAsignatura();
			int numAsignaturasAlumno=asignaturaAlumno.length;
			totalAsignaturas+=numAsignaturasAlumno;
			for (Asignatura asignatura : asignaturaAlumno) {
				notasAlumnos+=asignatura.getNota();		
			}
		}
		System.out.println("La nota media de todos los alumnos es: "+notasAlumnos+totalAsignaturas);	
		
		
		//Indicar que alumno tiene la nota media más alta
		double notaMediaMasAlta=0;
		Alumno alumnoNotaMediaMasAlta=null;
		for (Alumno alumno : alumnos) { //Recorrer un array
			double notasAlumno=0;
			Asignatura[] asignaturaAlumno=alumno.getAsignatura();
			int numAsignaturasAlumno=asignaturaAlumno.length;
			for (Asignatura asignatura : asignaturaAlumno) {
				notasAlumno+=asignatura.getNota();	
			}
			double mediaAlumno=notasAlumno/numAsignaturasAlumno;
			if (mediaAlumno>notaMediaMasAlta) {
				notaMediaMasAlta=mediaAlumno;
				alumnoNotaMediaMasAlta=alumno;
			}
		}
		System.out.println("El alumno con la nota media más alta es "+alumnoNotaMediaMasAlta.getNombre()+" con un "+notaMediaMasAlta);
	
	}

}
