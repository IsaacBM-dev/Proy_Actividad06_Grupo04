package com.senati.proy_actividad06_grupo04;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner oTeclado = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        char c = oTeclado.next().charAt(0);

        if (c == '.' || c == ',' || c == ';' || c == ':') {
            System.out.println("Es un signo de puntuación.");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Es una cifra del 0 al 9.");
        } else {
            System.out.println("Es otro carácter.");
        }
    }
}

