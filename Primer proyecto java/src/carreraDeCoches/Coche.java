package carreraDeCoches;

import java.util.Random;

public class Coche {
	//escuderia, motor, numero, piloto, velocidad, avance  
	//Metodo correr()-->generar un numero aleatorio entre 1 y 10 mas la velocidad mas la experiencia del piloto 
	
	private String escuderia;
	private String motor;
	private int numero;
	private double velocidad;
	private int avance;
	private Piloto piloto;
	

	public Coche(String escuderia, String motor, int numero, double velocidad, int avance, Piloto piloto) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.velocidad = velocidad;
		this.avance = avance;
		this.piloto = piloto;
	}
	
	
	public Coche(String escuderia, String motor, int numero, double velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.velocidad = velocidad;
		this.avance = avance;
	}



	//Get and set de Escuderia
	public String getEscuderia() {
		return escuderia;
	}
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	//Get and set de Motor
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}

	//Get and set de Numero
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//Get and set de Piloto
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	//Get and set de Velocidad
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	//Get and set de Avance
	public int getAvance() {
		return avance;
	}
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	public void correr() {
		int valorAleatorio = new Random().nextInt(100);
		//valorAleatorio = Math.random()*10
		int valor = valorAleatorio + (int)this.velocidad + this.piloto.getExperiencia();
		System.out.println("El coche "+this.getNumero() + " ha avanzado " + valor);
		
		this.avance += valor;
		System.out.println("El coche "+this.getNumero() + " lleva avanzado " + this.avance);
	}
	

}
