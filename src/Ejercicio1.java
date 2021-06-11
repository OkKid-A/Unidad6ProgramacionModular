package src;

import java.util.Scanner;

public class Ejercicio1{
	public int[] arreglo;
	public Scanner scanner;

	public Ejercicio1(){
		arreglo = new int[5];
		scanner = new Scanner(System.in);
		for (int i = 0;i < arreglo.length;i++ ) {
			arreglo[i] = recolectarValor(i);
		}
		for (int i = 0;i < arreglo.length;i++ ) {
			mostrarValor(i);
		}
		double promedio = calcularPromedio(arreglo);
		System.out.println("\nEl promedio es: " + promedio);
	}

	public double calcularPromedio(int[] arreglo){
		double total = 0;
		for (int i = 0;i < arreglo.length;i++ ) {
			total += arreglo[i];
		}
		double promedio = total/arreglo.length;
		return promedio;
	}

	public int recolectarValor(int indice){
		System.out.print("\nIngresa el valor para el indice " + indice + ": ");
		int nuevoValor = scanner.nextInt();
		return nuevoValor;
	}

	public void mostrarValor(int indice){
		System.out.println("\nEl valor en el indice "+indice+" es: " + arreglo[indice]);
	}

	public static void main(String[] args) {
		Ejercicio1 ex = new Ejercicio1();
	}
}