package src;

import java.util.Random;

public class Ejercicio7{

	int[][] matriz;
	Random random;

	public Ejercicio7(){
		random = new Random();
		matriz = generarMatriz();
		System.out.println("\nLa matriz generada es:");
		dibujarMatriz();
		int suma = sumarMatrizPar();
		System.out.println("\nLa suma de los valores en filas par es: " + suma);
	}

	public int[][] generarMatriz(){
		int[][] matriz = new int[4][3];
		for (int i = 0;i < matriz.length;i++) {
			for (int j = 0;j < matriz[i].length;j++) {
				matriz[i][j] = random.nextInt(556);
			}
		}
		return matriz;
	}

	public void dibujarMatriz(){
		for (int i = 0;i < matriz.length;i++) {
			System.out.println();
			for (int j = 0;j < matriz[i].length;j++) {
			System.out.print(matriz[i][j]+"\t");
			}
		}
		System.out.println();
	}

	public int sumarMatrizPar(){
		int total = 0;
		for (int i = 0;i < matriz.length;i++) {
			if (((i+1)%2)==0) {
				for (int j = 0;j < matriz[i].length;j++) {
					total += matriz[i][j];
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Ejercicio7 ex = new Ejercicio7();
	}
}