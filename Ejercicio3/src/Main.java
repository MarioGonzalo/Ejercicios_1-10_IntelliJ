import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] mult5 = get5mult(begin, end);
        int sum = sumArr(mult5);

        System.out.println("Los múltiplos de 5 comprendidos entre 1 y 100 son:");
        System.out.println(Arrays.toString(mult5));
        System.out.println("La suma de todos los múltiplos de 5 es: " + sum);
        System.out.println("La cantidad de múltiplos de 5 es: " + mult5.length);
    }

    public static int[] get5mult(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        int[] mult5 = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                mult5[index] = i;
                index++;
            }
        }
        return mult5;
    }

    public static int sumArr(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
