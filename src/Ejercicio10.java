package src;

import java.util.Scanner;

public class Ejercicio10 {

    Scanner scanner;
    int filas;
    int columnas;
    int [][] matriz;

    public Ejercicio10(){
        scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columans: ");
        columnas = scanner.nextInt();
        matriz = generarMatriz(filas, columnas);
        System.out.println("\nLa matriz original es:");
        dibujarMatriz(matriz);
        System.out.println("\nLa matriz transpuesta es:");
        matriz = matrizTraspuesta(matriz);
        dibujarMatriz(matriz);
        System.out.println();
    }

    public int [][] generarMatriz(int fila, int columna){
        int [][] matriz = new int [fila][columna];
        matriz = llenarMatriz(matriz);
        return matriz;
    }

    public static int aleatorio(int minimo, int maximo){
        int aleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return aleatorio;
    }

    public int [][] llenarMatriz(int [][] matrizALlenar){
        for (int i = 0; i < matrizALlenar.length; i++) {
            for (int j = 0; j < matrizALlenar[i].length; j++) {
                matrizALlenar[i][j] = aleatorio(10, 99);
            }
        }
        return matrizALlenar;
    }
    public void dibujarMatriz(int [][] numerosMatriz){
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int k = 0; k < numerosMatriz[i].length; k++) {
                String valor = Integer.toString(numerosMatriz[i][k]);
                System.out.print(valor + "   ");
            }
            System.out.println("");
        }
    }
    public int [][] matrizTraspuesta(int [][] matrizO){
        int [][] matrizT = new int [matrizO[0].length][matrizO.length];
        for (int i = 0; i < matrizO.length; i++) {
            for (int j = 0; j < matrizO[i].length; j++) {
                matrizT[j][i] = matrizO[i][j];
            }
        }
        return matrizT;
    }


    public static void main(String[] args) {
        Ejercicio10 ex = new Ejercicio10();
    }
}