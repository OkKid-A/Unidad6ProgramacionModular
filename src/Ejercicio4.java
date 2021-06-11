package src;

import java.util.Random;

public class Ejercicio4{

	int[] arreglo;
	Random random;

	public Ejercicio4(){
		random = new Random();
		arreglo = generarArreglo();
		int mayor = encontrarMayor();
		for (int i = 0;i < arreglo.length;i++) {
			medirDistancia(mayor,i);
		}
	}

	public int[] generarArreglo(){
		int[] arreglo = new int[10];
		for (int i = 0;i < arreglo.length;i++) {
			arreglo[i] = random.nextInt(50);
			System.out.println("\nEl indice " + i + " vale: " + arreglo[i]);
		}
		return arreglo;
	}

	public int encontrarMayor(){
		int indice = 0;
		int mayor = 0;
		for (int i = 0;i < arreglo.length;i++) {
			if (arreglo[i]>mayor) {
				mayor = arreglo[i];
				indice = i;
			}
		}
		return indice;
	}

	public void medirDistancia(int mayor, int indice){
		int distancia = (+(mayor - indice));
		if (distancia < 0) {
			distancia = -distancia;
		}
		System.out.println("\nEl indice " + indice + " esta a " + distancia + " indices, del número mayor");
	}

	public static void main(String[] args) {
		Ejercicio4 ex = new Ejercicio4();
	}
}