import java.util.Scanner;


public class EjercicioDos {
    public static void main(String[] args) {
        int num1;
        int num2;

        System.out.println("Introduce el primer número:");
        Scanner entrada = new Scanner(System.in);
        num1= entrada.nextInt();

        System.out.println("Introduce el segundo número:");

        num2= entrada.nextInt();

        if (num1==num2) {
            System.out.print("ERROR! Los números son iguales");
        }
        else{
            if (num1>num2) {
                System.out.println("El número " + num1+ " es mayor que " + num2);
            }
            else{
                System.out.println("El número " +num1+ " es menor que " + num2);
            }
        }

    }
}


