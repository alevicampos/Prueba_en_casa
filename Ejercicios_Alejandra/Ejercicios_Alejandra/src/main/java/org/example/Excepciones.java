package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public void control_excepciones(){

        Scanner entrada = new Scanner((System.in));


        int numero;
        boolean error = true;

        while (error==true) {

            try{

                System.out.println(" Introduzca un número");
                numero= entrada.nextInt();
                error = false;

            }catch (InputMismatchException er){
                System.out.println("ERROR: introduce un valor válido");
                entrada.nextLine();
            }
        }
    }
}
