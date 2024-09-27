package org.example;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        System.out.println("Introduce el primer numero: ");
        Scanner entrada = new Scanner(System.in);
        num1= entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2= entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3= entrada.nextInt();

        if (num1==num2 | num1==num3 | num2==num3){
            System.out.println("ERROR: hay números iguales");

        }else{
            if (num1<num2 && num1<num3){
                System.out.println("El numero menor es: " + num1);
            } else if (num2<num1 & num2<num3) {
                System.out.println("El numero menor es: " + num2);
            }else{
                System.out.println("El numero menor es: " +num3);
            }
        }

    }
}
