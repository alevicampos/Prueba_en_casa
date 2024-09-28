package org.example;


//    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class MesaElectoral {
        public void mesaelectoral() {
            Scanner entrada = new Scanner(System.in);

            String nombre;
            int edad;
            int mayorEdad = 18;
            int diferencia;
//            boolean error = true;

            System.out.println("¡BIENVENIDO A MI MESA ELECTORAL!");
            System.out.println("Introduce tu nombre: ");
            nombre = entrada.next();
            System.out.println("Hola " + nombre + ". Introduce tu edad:");
            edad = entrada.nextInt();
            diferencia = mayorEdad - edad;
//            while (error == true) {
//                try {
//                    System.out.println("Hola " + nombre + ". Introduce tu edad:");
//                    edad = entrada.nextInt();
//                    diferencia = mayorEdad - edad;
//
//                    error = false;
//
//                } catch (InputMismatchException Er) {
//                    System.out.println("El valor introducido no es válido");
//                    entrada.nextLine();
//                }
//            }

            while (edad < 0) {
                System.out.println("ERROR: El valor introducido no es válido");
                System.out.println("Introduce correctamente tu edad:");
                edad = entrada.nextInt();

            }

                if (edad >= mayorEdad) {
                    System.out.println("Enhorabuena " + nombre + ". Puedes votar. ");

                } else {
                    System.out.println("Lo siento " + nombre + ". No puedes votar.");
                    System.out.println("Te faltan " + diferencia + " años para ser mayor de edad.");


                }
            }

        }

