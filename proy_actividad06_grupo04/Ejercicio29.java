package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int num = oTeclado.nextInt();

        int original = num;
        int temp = Math.abs(num);
        int invertido = 0;

        while (temp > 0) {
            int digito = temp % 10;
            invertido = (invertido * 10) + digito;
            temp /= 10;
        }

        if (Math.abs(original) == invertido) {
            System.out.println("El número " + original + " es capicúa.");
        } else {
            System.out.println("El número " + original + " no es capicúa.");
        }
    }
}
