package carreraDeCoches;

import javaucjc.ejercicios.carreracoches.pojos.Carrera;
import javaucjc.ejercicios.carreracoches.pojos.CocheCarreras;
import javaucjc.ejercicios.carreracoches.pojos.Piloto;

public class Circuito {
	private String nombre;
	
	public static void main(String[] args) {
		
		Circuito circuito = new Circuito(args[0]);
		circuito.abrirCircuito();
		//System.out.println(circuito.getNombre());
	}

	public Circuito(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void abrirCircuito () {
		Piloto piloto1 = new Piloto("Nombre1",45,"Equipo1",3);
		Piloto piloto2 = new Piloto("Nombre2",65,"Equipo3",1);
		Piloto piloto3 = new Piloto("Nombre3",35,"Equipo2",0);
		
		Carrera coche1 = new Carrera("Escuderia1","Motor1",1,200);
		coche1.setPiloto(piloto1);
		Carrera coche2 = new Carrera("Escuderia2","Motor2",2,piloto2,200);
		Carrera coche3 = new Carrera("Escuderia3","Motor3",3,piloto3,200);
		
		Carrera carrera1 = new Carrera("Carrera1", this.getNombre(), 2000);
		
		Carrera[] cochesCarrera = {coche1,coche2,coche3};
		carrera1.setParrilaSalida(cochesCarrera);
		
		
		carrera1.iniciarCarrera();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}

