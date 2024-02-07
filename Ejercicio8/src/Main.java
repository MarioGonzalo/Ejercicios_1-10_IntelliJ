import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        int[] num = getNum(scanner);
        double media = media(num);
        int min = min(num);
        int max = max(num);

        // Se imprimen los resultados
        System.out.println("La media de los números es: " + media);
        System.out.println("El mínimo número ingresado es: " + min);
        System.out.println("El máximo número ingresado es: " + max);

        scanner.close(); // Se cierra el objeto Scanner
    }

    public static int[] getNum(Scanner scanner) {
        // Se pide al usuario que ingrese números enteros
        System.out.println("Ingrese números enteros. Ingrese 0 para terminar:");
        int[] nums = new int[100]; // Tamaño máximo del array, podría ser ajustado según necesidad
        int indice = 0;
        int num;

        // Se leen los números ingresados por el usuario
        do {
            num = scanner.nextInt();
            nums[indice] = num;
            indice++;
        } while (num != 0); // Se termina de leer números cuando el usuario ingresa 0


        int[] numIngr = new int[indice - 1]; // Se crea un nuevo array con el tamaño exacto de los números ingresados
        // Se copian los números ingresados al nuevo array
        for (int i = 0; i < indice - 1; i++) {
            numIngr[i] = nums[i];
        }

        return numIngr; // Se retorna el array con los números ingresados
    }

    public static double media(int[] nums) {
        // Se calcula la media de los números ingresados
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public static int min(int[] nums) {
        // Se busca el número mínimo de los ingresados
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int max(int[] nums) {
        // Se busca el número máximo de los ingresados
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
