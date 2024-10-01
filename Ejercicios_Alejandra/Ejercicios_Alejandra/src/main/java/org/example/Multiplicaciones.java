package org.example;

import java.util.Scanner;

public class Multiplicaciones {
    public void multiplicaciones() {
        Scanner entrada = new Scanner(System.in);

      int multiplicando;
      int multiplicador;



        System.out.println("Introduce el multiplicando (3 cifras):");
        multiplicando= entrada.nextInt();

        String numCaracter = Integer.toString(multiplicando);
        String numCaracterUno= numCaracter.substring(0,1);
        String numCaracterDos= numCaracter.substring(1,2);
        String numCaracterTres= numCaracter.substring(2,3);


        System.out.println("Introduce el multiplicador (3 cifras):");
        multiplicador= entrada.nextInt();

        String numCaracterMultiplicador = Integer.toString(multiplicador);
        String numCaracterUnor= numCaracter.substring(0,1);
        String numCaracterDosr= numCaracter.substring(1,2);
        String numCaracterTresr= numCaracter.substring(2,3);












    }
}
