package org.example;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un número:");
        Scanner entrada = new Scanner(System.in);
        num= entrada.nextInt();

        if (num==0) {
            System.out.print("El número es natural");
        }
        else{
            if (num>0) {
                System.out.println("El número es positivo");
            }
            else{
                System.out.println("El número es negativo");
            }
        }

    }
}


