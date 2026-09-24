package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a ingresar?: ");
        int cantidad = oTeclado.nextInt();

        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = oTeclado.nextDouble();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResumen:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
