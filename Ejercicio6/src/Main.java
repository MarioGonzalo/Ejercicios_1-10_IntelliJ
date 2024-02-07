import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int N = 10; // Número de primeros números primos a obtener
        int[] prim = NNumsPrim(N); // Array con los N primeros números primos

        // Se imprime el array con los N primeros números primos
        System.out.println("Los primeros " + N + " números primos son:");
        System.out.println(Arrays.toString(prim));
    }

    public static int[] NNumsPrim(int N) {
        // Se crea un array de tamaño N para almacenar los N primeros números primos
        int[] prim = new int[N];
        int i = 0; // Contador de números primos
        int num = 2; // Número a comprobar si es primo

        // Mientras no se hayan obtenido los N primeros números primos
        while (i < N) {
            // Si el número es primo, se almacena en el array y se aumenta el contador
            if (esPrim(num)) {
                prim[i] = num;
                i++;
            }
            num++;
        }

        return prim; // Se devuelve el array con los N primeros números primos
    }

    public static boolean esPrim(int num) {
        // Si el número es 0 o 1, no es primo
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // Si el número es divisible por algún número entre 2 y su raíz cuadrada, no es primo
            if (num % i == 0) {
                return false;
            }
        }
        return true; // Si no se cumple ninguna de las condiciones anteriores, el número es primo
    }
}
