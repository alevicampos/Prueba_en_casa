package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicaciones {
    public void multiplicaciones() {

        int multiplicando = 0;
        int multiplicador = 0;
        int resultado = 0;
        boolean error = true;

        Scanner entrada = new Scanner(System.in);
        while (error == true) {
            try {

                System.out.println("Introduce el multiplicando (3 cifras):");
                multiplicando = entrada.nextInt();

                System.out.println("Introduce el multiplicador (3 cifras):");
                multiplicador = entrada.nextInt();
                error = false;
            } catch (InputMismatchException Er) {
                System.out.println("Error!! El valor introducido no es válido");
                entrada.nextLine();
            }
        }

            boolean esMultiplicadorNegativo = multiplicador < 0;

            if (esMultiplicadorNegativo) {
                multiplicador = multiplicador * -1;
            }

            if (multiplicando == 0 || multiplicador == 0) {
                System.out.println("El producto de la multiplicación es: 0");
            } else {
                String multiplicadorC = Integer.toString(multiplicador);
                String multiplicadorCentenas = multiplicadorC.substring(0,1);
                int num_2Centenas = Integer.parseInt(multiplicadorCentenas);
                String multiplicadorDecenas = multiplicadorC.substring(1,2);
                int num_2Decenas = Integer.parseInt(multiplicadorDecenas);
                String multiplicadorUnidades = multiplicadorC.substring(2,3);
                int num_2Unidades = Integer.parseInt(multiplicadorUnidades);


                int suma1 = (num_2Unidades * multiplicando);
                int suma2 = (num_2Decenas * multiplicando) * 10;
                int suma3 = (num_2Centenas * multiplicando) * 100;

                resultado = (suma1 + suma2 + suma3);

                if (esMultiplicadorNegativo) {
                    resultado *= -1;
                }

                System.out.println("El producto de la multiplicación es: " + resultado);
                System.out.println("El proceso es:");
                System.out.println("  "+multiplicando);
                System.out.println("X " + multiplicador);
                System.out.println("_________");
                System.out.println("  "+suma1);
                System.out.println(suma2+"x");
                System.out.println(suma3+"xx");
                System.out.println("_________");
                System.out.println(resultado);
            }
        }
    }

