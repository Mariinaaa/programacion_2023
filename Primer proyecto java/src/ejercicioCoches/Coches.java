package ejercicioCoches;

public class Coches {
	//marca,matricula,motor,volante
	private String marca;
	private String matricula;
	private Motor motor;
	private Volante volante;
	private double velocidad;
	
	
	public Coches(String marca, String matricula, Motor motor, Volante volante) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
		this.volante = volante;
	}

	//Get and set de Marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Get and set de Matricula
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	//Get and set de motor
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	//Get and set de Volante
	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad=velocidad;
	}
	
	public void conducir() {
		System.out.println("El coche con matrícula "+ this.matricula+ " va a una velocidad de " + this.velocidad);
	}

}
