import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario

        int dimension;
        // Se pide al usuario que ingrese la dimensión de la matriz cuadrada
        do {
            System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
            dimension = scanner.nextInt();
            if (dimension <= 0) {
                System.out.println("Por favor, ingrese una dimensión válida mayor que 0.");
            }
        } while (dimension <= 0);

        // Se genera la matriz simétrica
        int[][] matriz = matrizSim(dimension);
        imprimir(matriz);

        scanner.close();
    }

    public static int[][] matrizSim(int dimension) {
        // Se crea una matriz cuadrada de dimensión "dimension"
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        // Se generan los valores de la matriz
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100); // Se generan números aleatorios entre 0 y 99
                matriz[j][i] = matriz[i][j]; // Se refleja el valor para mantener la simetría
            }
        }

        return matriz;
    }

    public static void imprimir(int[][] matriz) {
        // Se imprime la matriz
        System.out.println("La matriz simétrica generada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
