package ejerciciosclase;

import java.util.Scanner;
import utils.Utilidades;


public class Ejercicio2 {
	//Menu

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
        int opcion=0;
        Scanner cuadrado= new Scanner(System.in);
        int lado=0;
        Scanner entrada = new Scanner(System.in);
		String email;

        while(opcion!=4) {
        String menu_text="1.Opcion1|2.Opcion2|3.Opcion3|4.Salir";
        Utilidades.pintarMenu(menu_text);
        System.out.print("\nSelecciona una opción: ");
        opcion = scan.nextInt();

        switch (opcion) {
            case 1:
            	System.out.println("Por favor ingrese un email:");
            	email = entrada.nextLine();

            	//Contar el numero de @ en el email
            	int cantArroba = 0;
            	for (int i = 0; i< email.length(); i++){
            		if (email.charAt(i) == '@')
            			cantArroba++;
            	}

            	//Comprobar si hay espacios en blanco
            	boolean espaciosBlanco = false;
            	for (int i = 0; i< email.length(); i++){
            		if (email.charAt(i) == ' ')
            			espaciosBlanco = true;
            	}

            	//Comprueba la cantidad de caracteres despues del punto
            	int contadorPunto = 0;
            	for (int i = 0; i< email.length(); i++){
            		if (email.charAt(i) == '.')
            			contadorPunto++;
            	}
            	int cantCaracteresDespuesDelPunto = email.length() - email.lastIndexOf(".") - 1;

            	if (cantArroba == 1 && espaciosBlanco == false && contadorPunto == 1 && cantCaracteresDespuesDelPunto >=2 && cantCaracteresDespuesDelPunto <= 6 )
            		System.out.println("El email es valido");
            	else {
            		System.out.println("El email no es valido");
            		if (cantArroba != 1)
            			System.out.println("Solo debe haber una @");
            		if (espaciosBlanco == true)
            			System.out.println("No debe haber espacios en blanco");
            		if (contadorPunto != 1)
            			System.out.println("Debe haber solo un punto");
            		if (cantCaracteresDespuesDelPunto < 2 || cantCaracteresDespuesDelPunto > 6)
            			System.out.println("La cantidad de caracteres despues del punto debe estar entre 2 y 6");
            	}
       
                break;
            case 2:
            	System.out.println(("Introduce el lado del cuadrado:"));
				lado=cuadrado.nextInt();
				for(int i=0;i<lado;i++) {
					for(int j=0;j<lado;j++) {
						if(i==0 || i==lado-1 ) {
							System.out.print("*");
							if(j==lado-1) {
								System.out.println();
							}else {
								System.out.print(" ");
							}
						}else if (j==0 || j==lado -1) {
							System.out.print("*");
							if (j==lado-1) {
								System.out.println();
							}else {
								System.out.print("  ");
							}
						}else {
							System.out.print("  ");
						}
					}
				}
                break;
            case 3:
                System.out.println("\nHa seleccionado la opción 3: Mostrar datos");
                break;
            case 4:
                System.out.println("\nHa seleccionado la opción 4: Salir");
                break;
            default:
                System.out.println("\nOpción no válida");
        }
        }
	 }
}

