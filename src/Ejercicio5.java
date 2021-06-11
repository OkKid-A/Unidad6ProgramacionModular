package src;

import java.util.Scanner;

public class Ejercicio5{

	Scanner scanner;
	int[] arreglo;

	public Ejercicio5(){
		scanner = new Scanner(System.in);
		arreglo = generarArreglo();
		System.out.println("\nLa nota media es " + calcularPromedio());
	}

	public int[] generarArreglo(){
		int[] arreglo = new int[100];
		int cont = 0;
		int agregada = 0;
		do{
			System.out.println("\nIngresa una nota");
			agregada = scanner.nextInt();
			arreglo[cont] = agregada;
			cont++;
		} while(cont < 99 && agregada != -50);
		cont++;
		arreglo[cont] = -50;
		return arreglo;
	}

	public double calcularPromedio(){
		int total = 0;
		int cont = 0;
		for (int k = 0;k < arreglo.length;k++) {
			if (arreglo[k] == -50) {
				break;
			} else {
				total += arreglo[k];
				cont++;
			}
		}
		return ((double)total/(double)cont);
	}

	public static void main(String[] args) {
		Ejercicio5 ex = new Ejercicio5();
	}
}