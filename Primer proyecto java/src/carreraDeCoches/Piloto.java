package carreraDeCoches;

public class Piloto {
	//nombre, experiencia, equipo, numVictoria
	private String nombre;
	private int experiencia;
	private String equipo;
	private int numVictoria;
	
	public Piloto(String nombre, int experiencia, String equipo, int numVictoria) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
		this.numVictoria = numVictoria;
	}
	
	
	//Get and set de Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Get and set de Experiencia
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	
	//Get and set de Equipo
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	//Get and set de NumVictoria
	public int getNumVictoria() {
		return numVictoria;
	}
	public void setNumVictoria(int numVictoria) {
		this.numVictoria = numVictoria;
	}
}
