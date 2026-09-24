package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos N: ");
        int n = oTeclado.nextInt();

        long a = 0, b = 1;
        System.out.print("Los primeros " + n + " términos de Fibonacci son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}