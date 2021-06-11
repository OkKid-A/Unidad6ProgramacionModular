package src;

public class Ejercicio6{

	int[][] matriz;

	public Ejercicio6(){
		matriz = generarMatriz();
		System.out.println("\nLa matriz original es:");
		dibujarMatriz();
		doblarMatriz();
		System.out.println("\nLa matriz doblada es:");
		dibujarMatriz();
	}

	public int[][] generarMatriz(){
		int[][] matriz = new int[3][3];
		matriz[0][0] = 5;
		matriz[0][1] = 6;
		matriz[0][2] = 13;
		matriz[1][0] = 14;
		matriz[1][1] = 2;
		matriz[1][2] = 4;
		matriz[2][0] = 21;
		matriz[2][1] = 7;
		matriz[2][2] = 6;
		return matriz;
	}

	public void doblarMatriz(){
		for (int i = 0;i < matriz.length;i++) {
			for (int j = 0;j < matriz[i].length;j++) {
			matriz[i][j] *= 2;
			}
		}
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

	public static void main(String[] args) {
		Ejercicio6 ex = new Ejercicio6();
	}
}