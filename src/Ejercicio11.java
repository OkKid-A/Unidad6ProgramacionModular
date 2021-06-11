package src;

import java.util.Scanner;

public class Ejercicio11 {

    String[] nombres;
    String[] estadosAsignados;
    double [] notas;
    Scanner scanner;
    final String[] DETALLE = {"Sobresaliente", "Notable", "Bien", "Suspendido"};


    public Ejercicio11(){
        scanner = new Scanner(System.in);
        nombres = new String [6];
        notas = new double [6];
        estadosAsignados = new String [6];
        System.out.println();
        for (int i = 0; i < 6; i++) {
            nombres[i] = pedirNombre();
            notas[i] = pedirNota();
        }
        estadosAsignados = asignarEstado(notas);
        System.out.println("\nLas calificaciones son:");
        for (int i = 0; i < 6; i++) {
            System.out.println("\nAlumno: "+nombres[i] + "\nNota: " + notas[i] + "\nEstado: " + estadosAsignados[i]);
        }
    }
    public double pedirNota(){
        double nota = 0;
        do {
            if((nota < 0) || (nota > 10)){
                System.out.println("Ingrese una nota entre 0 y 10");
            } else {
                System.out.print("Ingrese la nota del alumno: ");
                nota = scanner.nextDouble();
            }

        } while ((nota < 0) || (nota > 10));
        return nota;
    }

    public String pedirNombre(){
        String nombre;
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = scanner.next();
        return nombre;
    }
    public String [] asignarEstado(double[] notasAlumnos){
        String [] estadosCalificados = new String [notasAlumnos.length];
        for (int i = 0; i < notasAlumnos.length; i++) {
            estadosCalificados[i] = calificar(notasAlumnos[i]);
        }
        return estadosCalificados;
    }

    public String calificar(double nota){
        String calificado = "";
        if ((nota >= 0) && (nota <= (4.99))) {
            calificado = DETALLE[3];
        } else if((nota >= 5) && (nota <= (6.99))){
            calificado = DETALLE[2];
        }else if((nota >= 7) && (nota <= (8.99))){
            calificado = DETALLE[1];
        }else if((nota >= 9) && (nota <= 10)){
            calificado = DETALLE[0];
        }
        return calificado;
    }  

    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
    }

}