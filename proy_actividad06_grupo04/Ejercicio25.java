package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese lado a: ");
        double a = oTeclado.nextDouble();
        System.out.print("Ingrese lado b: ");
        double b = oTeclado.nextDouble();
        System.out.print("Ingrese lado c: ");
        double c = oTeclado.nextDouble();

        // Verif desigualdad triangular
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("El triángulo es Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es Isósceles.");
            } else {
                System.out.println("El triángulo es Escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }
    }
}
