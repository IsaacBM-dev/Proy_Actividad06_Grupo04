package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1 a 12): ");
        int mes = oTeclado.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 días.");
                break;
            default:
                System.out.println("Número de mes fuera del rango válido (1-12).");
                break;
        }
    }
}


