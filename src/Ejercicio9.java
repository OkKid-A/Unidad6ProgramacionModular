package src;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9{

	int [][] matriz1;
	int [][] matriz2;
	int [][] matrizSumada;
	Random random;
	Scanner scanner;
	int filas;
	int columnas;

	public Ejercicio9(){
		filas = 0;
		columnas = 0;
		scanner = new Scanner(System.in);
		random = new Random();
		System.out.println("\nIngresa el número de filas de la matriz 1");
		filas = scanner.nextInt();
		System.out.println("\nIngresa el número de columnas de la matriz 1");
		columnas = scanner.nextInt();
		matriz1 = generarMatriz(filas, columnas);
		dibujarMatriz(matriz1);
		System.out.println("\nIngresa el número de filas de la matriz 2");
		filas = scanner.nextInt();
		System.out.println("\nIngresa el número de columnas de la matriz 2");
		columnas = scanner.nextInt();
		matriz2 = generarMatriz(filas, columnas);
		dibujarMatriz(matriz2);
		System.out.println("\nLa matriz sumada es:");
		sumarMatrices();
	}

	public int[][] generarMatriz(int filas, int columnas){
		int[][] matriz = new int[filas][columnas];
		for (int i = 0;i < filas;i++) {
			for (int j = 0;j < columnas;j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
		return matriz;
	}

	public void sumarMatrices(){
		if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
			matrizSumada = new int[matriz1.length][matriz1[0].length];
			for (int i = 0;i < matriz1.length;i++) {
				for (int j = 0;j < matriz1[0].length;j++) {
					matrizSumada[i][j] = matriz1[i][j] + matriz2[i][j];
				}	
			}
			dibujarMatriz(matrizSumada);
		} else {
			System.out.println("\nLas matrices deben ser del mismo tamaño");
		}
	}

	public void dibujarMatriz(int[][] matriz){
		for (int i = 0;i < matriz.length;i++) {
			System.out.println();
			for (int j = 0;j < matriz[i].length;j++) {
			System.out.print(matriz[i][j]+"\t");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Ejercicio9 ex = new Ejercicio9();
	}
}