package src;

import java.util.Scanner;

public class Ejercicio3{

	int[] arreglo;
	Scanner scanner;
	boolean seEncontro;

	public Ejercicio3(){
		arreglo = new int[8];
		scanner = new Scanner(System.in);
		seEncontro = false;
		for (int k = 0;k < arreglo.length;k++){
			arreglo[k] = recolectarValor(k);
		}
		int buscado = pedirValorBuscado();
		for(int i = 0;i < arreglo.length;i++){
			if (buscarValor(buscado,i)) {
				break;
			}
		}
		comprobarBusqueda();
	}

	public int recolectarValor(int indice){
			System.out.print("\nIngresa el valor del indice " + indice + ": ");
			return scanner.nextInt();
	}

	public boolean buscarValor(int buscado, int indice){
		if (arreglo[indice] == buscado) {
				seEncontro = true;
		}
		return seEncontro;
	}

	public int pedirValorBuscado(){
		System.out.println("\nIngresa el número que deseas buscar.");
		int buscado = scanner.nextInt();
		return buscado;
	}

	public void comprobarBusqueda(){
		if (seEncontro) {
			System.out.println("\nVerdadero");
		} else {
			System.out.println("\nFalso");
		}
	}

	public static void main(String[] args) {
		Ejercicio3 ex = new Ejercicio3();
	}
}