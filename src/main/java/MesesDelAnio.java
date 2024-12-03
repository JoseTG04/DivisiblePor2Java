import java.util.Scanner;

public class MesesDelAnio {

    public static void main(String[] args) {

        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un número del 1 al 12: ");
        int numero = scanner.nextInt();


        if (numero >= 1 && numero <= 12) {
            System.out.println("El mes correspondiente es: " + meses[numero - 1]);
        } else {
            System.out.println("Número inválido. Debes ingresar un número entre 1 y 12.");
        }

        scanner.close();
    }


}

