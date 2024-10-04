package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
    double nota1=0;
    double nota2=0;
    double nota3=0;
    double media;
    final double APROBADO=5;


        Scanner entrada = new Scanner(System.in);

                System.out.println("Introduce la nota del primer trimestre (0-10): ");
                nota1 = entrada.nextDouble();
                System.out.println("Introduce la nota del segundo trimestre(0-10):");
                nota2 = entrada.nextDouble();
                System.out.println("Introduce la nota del tercer trimestre(0-10): ");
                nota3 = entrada.nextDouble();




            media = ((nota1 + nota2 + nota3) / 3);

            if (media >= APROBADO) {
                System.out.println("Tu nota media es: " + media + ". Estás aprobado!");

            } else {
                System.out.println("Tu nota media es: " + media + ". Estás suspendido!");
            }
        }

        }



