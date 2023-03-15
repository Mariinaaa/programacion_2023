package javaejercicios;

import java.util.Scanner;


public class ejerciciosclase {

	public static void main(String[] args) {
		
		String mes="Enero"; 
		Scanner scan=new Scanner (System.in);
		System.out.println("Escribe el nombre del mes: ");
		mes=scan.nextLine();
		System.out.println("Mes incluido: "+mes);
		//Realizamos con el if
		String estacion="";
		if(mes=="Enero" || mes=="Febrero" || mes=="Marzo") {
			estacion="Invierno";
		}
		System.out.println("La estación del mes " +mes+ "es " +estacion);
		
	}
}