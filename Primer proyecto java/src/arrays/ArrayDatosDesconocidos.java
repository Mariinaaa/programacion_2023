package arrays;

import java.util.Scanner;

public class ArrayDatosDesconocidos {

	public static void main(String[] args) {
		int [][] numeros = new int[2][3]; //2 Filas y 3 Columnas
		numeros[1][1]=8;
		System.out.println(numeros[1][1]);
		System.out.println("Número de filas "+numeros.length);
		System.out.println("Número de columnas "+numeros[1].length);
		
		
		//Ejercicio: mostrar los numeros de la matriz y lugeo rellenarla con numeros y que te pregunte que numero quieres meter en esa posición
		
		for(int i=0; i<numeros.length;i++){ //Recorre las filas
			for(int j=0; j<numeros[i].length ;j++) { //Recorre las columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println(); //Lo pone en forma de matriz
		}
		//Asignamos datos a la matriz
		for(int i=0; i<numeros.length;i++) {
			for(int j=0; j<numeros[i].length ;j++) {
				Scanner scan =new Scanner(System.in);
				System.out.println("Introduce el valor de la posición["+i+"],["+j+"]");
				numeros[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0; i<numeros.length;i++){ //Recorre las filas
			for(int j=0; j<numeros[i].length ;j++) { //Recorre las columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println(); //Lo pone en forma de matriz
		}
		
	}
}
