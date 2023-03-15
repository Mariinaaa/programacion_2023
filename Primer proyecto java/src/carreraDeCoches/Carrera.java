package carreraDeCoches;

public class Carrera {
	//Nombre, circuito, parrillaSalida(array de coches(los coches q van con sus pilotos)), distancia
	//metodo iniciarCarrera()-->Vamos a poner a todos los coches a correr hasta que uno de ellos llegue a la meta
	
	private String nombre;
	private String circuito;
	private Carrera[] parrilaSalida;
	private int distancia;
	
	
	public Carrera(String nombre, String circuito, Carrera[] parrilaSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilaSalida = parrilaSalida;
		this.distancia = distancia;
	}
	//Get and set de Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Get and set de Circuito
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	//Get and set de ParrillaSalida
	public Carrera[] getParrilaSalida() {
		return parrilaSalida;
	}
	public void setParrilaSalida(Carrera[] parrilaSalida) {
		this.parrilaSalida = parrilaSalida;
	}

	//Get and set de Distancia
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void iniciarCarrera() {
		
		boolean hayGanador = false;
		
		while (!hayGanador) {
			for (Carrera Carrera : parrilaSalida) {
				Carrera.correr();
				if(Carrera.getAvance()>this.distancia) {
					System.out.println("El coche "+Carrera.getNumero() +" ha ganado");
					hayGanador = true;
					break;
				}
			}
		}
		System.out.println("La carrera ha finalizado");
    }
}
