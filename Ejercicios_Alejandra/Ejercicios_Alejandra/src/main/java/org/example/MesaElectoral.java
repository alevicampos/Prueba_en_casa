package org.example;


    import java.util.Scanner;

    public class MesaElectoral {
        public void mesaelectoral() {
            Scanner entrada= new Scanner(System.in);

            String nombre;
            int edad;
            int mayorEdad=18;
            int diferencia;

            System.out.println("¡BIENVENIDO A MI MESA ELECTORAL!");
            System.out.println("Introduce tu nombre: ");
            nombre= entrada.next();
            System.out.println("Hola " +nombre+". Introduce tu edad:" );
            edad= entrada.nextInt();
            diferencia= mayorEdad-edad;

            if (edad>= mayorEdad){
                System.out.println("Enhorabuena " +nombre+ ". Puedes votar. ");

            }else{
                System.out.println("Lo siento " +nombre+ ". No puedes votar.");
                System.out.println("Te faltan " +diferencia+ " años para ser mayor de edad.");
            }


        }
}
