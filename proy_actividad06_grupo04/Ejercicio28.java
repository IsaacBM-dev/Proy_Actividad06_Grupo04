package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un entero positivo: ");
        int num = oTeclado.nextInt();

        if (num <= 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            int temp = num;
            int invertido = 0;

            while (temp > 0) {
                int digito = temp % 10;
                invertido = (invertido * 10) + digito;
                temp /= 10;
            }

            System.out.println("Número invertido: " + invertido);
        }
    }
}


