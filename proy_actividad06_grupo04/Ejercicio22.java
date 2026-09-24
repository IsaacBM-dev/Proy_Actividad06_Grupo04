package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un número K: ");
        int k = oTeclado.nextInt();

        System.out.println("Números del 30 al 1 (omitidos múltiplos de " + k + "):");
        for (int i = 30; i >= 1; i--) {
            if (k != 0 && i % k == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }   
}

