package ejerciciosclase;

import java.util.Scanner;

public class Ejercicio1 {
	//Sucesión de fibonacci

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        int numero1=0, numero2=1, numero3, n;
        	
        	System.out.println("Introduce el numero de elementos que tenga la serie: ");
        	n=teclado.nextInt();
         
        for (int i=0; i <n; i++) {
             
            // muestro el valor inicial
            System.out.println(numero1);
             
            //primero sumamos
            numero3=numero1+numero2;
            //Despues, cambiamos la segunda variable por la primera
            numero1=numero2;
            //Por ultimo, cambiamos la suma por la segunda variable
            numero2=numero3;
             
             
        }
    }
 
}

