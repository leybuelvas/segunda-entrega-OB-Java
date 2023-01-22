package com.company;

import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {

        /*
        Scanner es una clase que nos permite obtener la entrada de datos primitivos.
        Esto quiere decir que podemos capturar datos del tipo int, double, string y etc.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("agrega un numero");

        int numero = scanner.nextInt();

        double iva = numero * 0.19;

        double suma = numero + iva;

        System.out.println("El resultado con IVA es: " + suma);
    }
}
