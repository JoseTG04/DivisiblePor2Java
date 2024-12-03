import java.util.Scanner;

public class DivisiblePor2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        //for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            // Verificar si el número es divisible por 2
            if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible por 2.");
            } else {
            System.out.println("El número " + numero + " no es divisible por 2.");
            }
           // }

            scanner.close();
    }
}
