package javaucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		
		int numero1=10;
		int numero2=9;
		
		//Condiciones con if:
		if(numero1>numero2 || numero1>0) {
			System.out.println("Numero1 es mayor");
	
		}else if (numero2>0) {
			System.out.println("Numero2 es mayor de cero");
		}else {
			System.out.println("No se cumple ninguna condición");
		}

		}

	//Condiciones con switch:
	switch (numero1) {
		case 1:System.out.println("Valor1");
		case 2:System.out.println("Valor2");
		case 10:System.out.println("Valor10");
		defaut:
			System.out.println("Otro Valor");
			break;
	}
	}




