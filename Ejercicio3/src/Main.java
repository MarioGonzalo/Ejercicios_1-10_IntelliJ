import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Se define el rango de números a evaluar
        int begin = 1;
        int end = 100;

        int[] mult5 = get5mult(begin, end);// Se obtienen los múltiplos de 5 mediante la función get5mult
        int sum = sumArr(mult5);// Se obtiene la suma de los múltiplos de 5 mediante la función sumArr

        // Se imprimen los resultados
        System.out.println("Los múltiplos de 5 comprendidos entre 1 y 100 son:");
        System.out.println(Arrays.toString(mult5));
        System.out.println("La suma de todos los múltiplos de 5 es: " + sum);
        System.out.println("La cantidad de múltiplos de 5 es: " + mult5.length);
    }

    public static int[] get5mult(int begin, int end) {
        int count = 0; // Se inicializa el contador de múltiplos de 5
        // Se cuentan los múltiplos de 5 en el rango
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        int[] mult5 = new int[count]; // Se crea un array con la cantidad de múltiplos de 5
        int index = 0; // Se inicializa el índice del array a 0
        // Se almacenan los múltiplos de 5 en el array
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                mult5[index] = i;
                index++;
            }
        }
        return mult5; // Se retorna el array con los múltiplos de 5
    }

    public static int sumArr(int[] array) {
        int sum = 0; // Se inicializa la suma en 0
        // Se suman los elementos del array
        for (int num : array) {
            sum += num;
        }
        return sum; // Se retorna la suma
    }
}
