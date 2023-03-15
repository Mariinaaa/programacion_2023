package Encapsulacion;

public class Asignatura {
	public class Alumno {
		private String nombre;
		private double nota;
		private Asignatura asignatura;
	
	
	public Alumno(String nombre, double nota, Asignatura asignatura) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		this.asignatura = asignatura;
	}
	
	
	//Set y get de el nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//Set y get de la nota
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// Constructor, getters y setters
	public Asignatura getAsignatura() {
		return asignatura;
	}
		  
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;	  
	}
	public void estudiar() {
		System.out.println();
	}
	public void estudiar1() {
		System.out.println("El"+ nombre + "tiene esta nota: "+nota);
	}
	}
}
