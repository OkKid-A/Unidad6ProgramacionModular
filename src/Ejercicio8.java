package src

import java.util.Scanner;

public class Ejercicio8{

	String[] array1;
	String[] array2;
	Scanner scanner;

	public Ejercicio8(){
		scanner = new Scanner(System.in);
		array2 = new String[5];
		llenarArray(array2);
		array1 = new String[5];
		llenarArray(array1);
		for (int i = 0;i < array1.length;i++) {
			System.out.println("\nEl indice " + i + " del array 1 tiene un tamaño de" + array1[i].length + ". Y el indice " + i + " del array 2 tiene un tamaño de " + array2[i].length + ". Por lo tanto: "+ compararIndices(i));
		}
	}

	public String pedirPalabra(int indice){
		System.out.println("\nIngresa una palabra para el indice " + indice);
		String palabra = scanner.nextLine();
		return palabra;
	}

	public void llenarArray(String[] array){
		for (int i = 0;i < array.length;i++) {
			array[i] = pedirPalabra(i);
		}
	}

	public String compararIndices(int indice){
		if (array1[indice].length == array2[indice].length) {
			return "Son iguales";
		} else {
			return "No son iguales";
		}
	}
}