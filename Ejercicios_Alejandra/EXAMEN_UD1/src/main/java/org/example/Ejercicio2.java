package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        int num = 0;
        boolean error = true;

        Scanner entrada = new Scanner(System.in);

        while (error) {
            try {
                System.out.println("Introduce un número:");
                num = entrada.nextInt();
                error= false;
            } catch (InputMismatchException e){
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }

        if (num<0){
            System.out.println("El valor absoluto es: " +num*-1);
        }else{
            System.out.println("El valor aboluto es:" +num);
        }

    }
}
