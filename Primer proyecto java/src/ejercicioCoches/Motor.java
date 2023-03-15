package ejercicioCoches;

public class Motor {
	//Marca,numcaballos,piston
	private String marca;
	private int numCaballos;
	private Piston piston;
	
	public Motor(String marca, int numCaballos, Piston piston) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
		this.piston = piston;
	}
	
	public Motor(String marca, int numCaballos) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
	}

	//Get and set de marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	//Get and set de Numcaballos
	public int getNumCaballos() {
		return numCaballos;
	}
	public void setNumCaballos(int numCaballos) {
		this.numCaballos = numCaballos;
	}

	
	//Get and set de Piston
	public Piston getPiston() {
		return piston;
	}

	public void setPiston(Piston piston) {
		this.piston = piston;
	}


}
