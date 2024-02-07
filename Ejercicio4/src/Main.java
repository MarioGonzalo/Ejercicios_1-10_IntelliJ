import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos. Introduce un número negativo para finalizar.");

        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.print("Introduce un número: ");
            num = scanner.nextInt();

            if (num >= 0) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        } while (num >= 0);

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No se han introducido números positivos.");
        } else {
            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }

        scanner.close();
    }
}
