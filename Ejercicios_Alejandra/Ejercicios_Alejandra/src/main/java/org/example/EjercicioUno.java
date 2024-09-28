package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioUno {
    public void ejerciciouno() {
        int num;
        boolean error= true;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");

        num= entrada.nextInt();
while (error==true){


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
    try{
        System.out.println("Introduce un número:");
        num= entrada.nextInt();
    }catch (InputMismatchException Er){
        System.out.println("El valor introducido no es válido");
        entrada.nextLine();
    }
}

    }
}


