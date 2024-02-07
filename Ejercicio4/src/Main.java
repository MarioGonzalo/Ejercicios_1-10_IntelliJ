import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer de la entrada.

        // Se pide al usuario que introduzca números enteros positivos.
        System.out.println("Introduce números enteros positivos. Introduce un número negativo para finalizar.");

        // Se inicializan las variables min y max con los valores máximos y mínimos posibles.
        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            // Se lee un número entero de la entrada.
            System.out.print("Introduce un número: ");
            num = scanner.nextInt();

            // Si el número es positivo, se actualizan las variables min y max.
            if (num >= 0) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        } while (num >= 0);

        // Se muestran los resultados.
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No se han introducido números positivos.");
        } else {
            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }

        scanner.close(); // Se cierra el objeto Scanner.
    }
}
