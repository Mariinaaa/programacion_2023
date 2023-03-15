package Encapsulacion;

public class Alumno {
	private String nombre;
	private double apellidos;
	private Asignatura notaMedia;
	

	//Alt+sift+s=generate constructor using fields
	public Alumno(String nombre, double d, Asignatura asignatura1) {
		super();
		this.nombre = nombre;
		this.apellidos = d;
		this.notaMedia = asignatura1;
	}
	
    //Alt+shift+s=generate getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public double getNotaMedia() {
		return notaMedia;
	}



	//Constructor para nombre y apellido
	public Alumno(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;	
	}
	
	//Getter y setter
	//public String getNombre() {
		// this.nombre; //Saber el valor del nombre q he puesto en la variable es decir el atributo
	//}
	
	//public void setNombre(String nombre) {
		//this.nombre=nombre; //Modificar el atributo
	//}
	
	
	public Alumno1(String nombre2, double d, Asignatura asignatura1) {
		// TODO Auto-generated constructor stub
	}

	public void Alumno1(String nombre2, double d, Asignatura asignatura1) {
		// TODO Auto-generated constructor stub
	}

	//Método o función(nombre y apellido)
	public void estudiar1() {
		System.out.println("El alumno "+ nombre + apellidos+" esta estudiando");
	}	
}
