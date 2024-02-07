import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario.

        // Se pide al usuario que ingrese un número entero positivo.
        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();

        // Se verifica que el número ingresado sea positivo.
        if (num <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }// Si el número ingresado es positivo, se descompone en factores primos.
        else {
            ArrayList<Integer> factPrim = descomp(num);
            System.out.print("Los factores primos de " + num + " son: ");
            for (int i = 0; i < factPrim.size(); i++) {
                System.out.print(factPrim.get(i));
                if (i < factPrim.size() - 1) {
                    System.out.print(" * ");
                }
            }
        }

        scanner.close();// Se cierra el objeto Scanner.
    }

    public static ArrayList<Integer> descomp(int num) {
        ArrayList<Integer> factPrim = new ArrayList<>(); // Se crea un ArrayList para almacenar los factores primos.

        // Se descompone el número en factores primos.
        while (num % 2 == 0) {
            factPrim.add(2);
            num /= 2;
        }

        // Se descompone el número en factores primos impares.
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                factPrim.add(i);
                num /= i;
            }
        }

        // Si el número es primo, se agrega a la lista de factores primos.
        if (num > 2) {
            factPrim.add(num);
        }

        return factPrim; // Se retorna la lista de factores primos.
    }
}
