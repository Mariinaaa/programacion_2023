package arrays;

public class Alumno {
	private String nombre;
	private String apellido;
	private Asignatura [] asignatura;
	
	
	
	
	public Alumno(String nombre, String apellido, Asignatura[] asignatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.asignatura = asignatura;
	}
	//Get and set de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Get and set de apellido
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Get and set de Asignatura
	public Asignatura[] getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}

}
