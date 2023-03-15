package ejercicioCoches;

public class Piston {
	//id,marca
	private long id;
	private String marca;
	
	public Piston(long id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}

	//Get and set de Id
	public long getId() {
		return id;	
	}
	public void setId(long id) {
		this.id = id;
	}

	//Get and set de Marca
	public String getMarca() {
		return marca;
	}

	public void setMarcaPiston(String marca) {
		this.marca = marca;
	}

	
	
	
	
	

}
