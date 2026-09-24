package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un entero no negativo: ");
        int n = oTeclado.nextInt();

        if (n < 0) {
            System.out.println("El número ingresado debe ser no negativo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}

