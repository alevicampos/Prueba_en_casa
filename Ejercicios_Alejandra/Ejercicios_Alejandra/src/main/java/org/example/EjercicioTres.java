package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioTres {
    public void ejerciciotres() {
        double num1;
        double num2;
        double resultado;
        boolean error = true;

        System.out.println("Introduce el dividendo:");
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextDouble();

        System.out.println("Introduce el divisor:");
        num2 = entrada.nextDouble();

        while (error==true) {
            try {
                System.out.println("Introduce el dividendo:");

                num1 = entrada.nextDouble();

                System.out.println("Introduce el divisor:");
                num2 = entrada.nextDouble();
            } catch (InputMismatchException er) {
                System.out.println("ERROR: introduce un valor válido");
                entrada.nextLine();
            }
            resultado = (num1 / num2);

            if (num2 == 0) {
                System.out.println("ERROR: no se puede dividir entre 0");

            } else {
                System.out.println("El resultado de la division es: " + resultado);
            }


        }
    }
}
