package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int n = oTeclado.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += (2 * i - 1);
        }

        System.out.println("La suma de los " + n + " primeros números impares es: " + suma);
    }  
}
