package org.example;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        System.out.println("Introduce el valor de la base: ");
        Scanner entrada = new Scanner(System.in);
        base= entrada.nextDouble();
        System.out.println("Introduce el valor de la altura: ");
        altura= entrada.nextDouble();

        area= (base*altura)/2;

        System.out.println("El area del triangulo es: " + area);

    }

    }

