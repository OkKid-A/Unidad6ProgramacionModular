package src;

import java.util.Random;

public class Ejercicio2{

	int[] arreglo;
	Random random;
	int cont;

	public Ejercicio2(){
		arreglo = new int[10];
		random = new Random();
		cont = 0;
		llenarArray(arreglo);
		for (int i = 0;i < arreglo.length;i++) {
			mostrarValor(i);
		}
		System.out.println("\nEl número mayor en el arreglo es: "+encontrarMayor(arreglo)+". Y se repite " + cont + " veces.");
	}

	public void llenarArray(int[] arreglo){
		for (int i = 0;i < arreglo.length;i++) {
			arreglo[i] = random.nextInt(100);
		}
	}

	public void mostrarValor(int indice){
		System.out.println("\nEl valor en el indice "+indice+" es: " + arreglo[indice]);
	}

	public int encontrarMayor(int[] arreglo){
		int mayor = 0;
		cont = 0;
		for (int i = 0;i < arreglo.length;i++) {
			if (arreglo[i]>mayor) {
				mayor = arreglo[1];
			}
			if (mayor == arreglo[i]) {
				cont++;
			}
		}
		return mayor;
	}

	public static void main(String[] args) {
		Ejercicio2 ex = new Ejercicio2();
	}
}