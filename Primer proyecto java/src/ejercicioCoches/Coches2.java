package ejercicioCoches;

public class Coches2 {

	public static void main(String[] args) {
		// 2 coches, que te diga la marca de piston de cada coche y el color del volante tambien de cada uno
		//Creo el coche 1
		Piston piston1= new Piston(1,"Marca1");
		Motor motor1=new Motor("MarcaMotor1",120,piston1);
		Volante volante1= new Volante(1,"Tipo1","negro");
		
		Coches coche1=new Coches("1111-ABC","SEAT",motor1,volante1);
		
		System.out.println(coche1.getMatricula());
		System.out.println(coche1.getVolante().getColor());
		System.out.println(coche1.getMotor().getPiston().getId());
		
		
		double velocidad=Math.random()*120;//Clase de java con la q podemos gestionar operaciones matemáticas y lo multiplicamos por 120 para q nos de un avlor entre el 1 y el 120
		coche1.setVelocidad(velocidad);
		coche1.conducir();
		
		
		
	}

}
